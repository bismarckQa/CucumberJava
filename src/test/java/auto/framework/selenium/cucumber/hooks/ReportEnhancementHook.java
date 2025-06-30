package auto.framework.selenium.cucumber.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.AfterStep;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

public class ReportEnhancementHook {

    @Autowired
    private WebDriver driver;

    @Before
    public void setupScenarioInfo(Scenario scenario) {
        Collection<String> tags = scenario.getSourceTagNames();

        // Extraer información de los tags según tu feature actual
        String environment = extractTagValue(tags, "Environment_");
        String appName = extractTagValue(tags, "versia_renal");
        String version = extractTagValue(tags, "@");
        String module = extractTagValue(tags, "Module_");

        // Log mejorado para debugging
        System.out.println("🎯 =================================");
        System.out.println("📊 INICIANDO SCENARIO: " + scenario.getName());
        System.out.println("🏷️  TAGS ENCONTRADOS: " + tags);
        System.out.println("🌍 Environment: " + (environment != null ? environment : "dev"));
        System.out.println("📱 Application: VersiaRenal");
        System.out.println("🔢 Version: " + (version != null ? version : "3.2"));
        System.out.println("📦 Module: " + (module != null ? module : "Prueba"));
        System.out.println("🎯 =================================");

        // Establecer propiedades del sistema para ExtentReports
        System.setProperty("extent.reporter.spark.systeminfo.Scenario", scenario.getName());
        System.setProperty("extent.reporter.spark.systeminfo.Environment", environment != null ? environment : "dev");
        System.setProperty("extent.reporter.spark.systeminfo.Application", "VersiaRenal");
        System.setProperty("extent.reporter.spark.systeminfo.Version", version != null ? version : "3.2");
        System.setProperty("extent.reporter.spark.systeminfo.Module", module != null ? module : "Prueba");
        System.setProperty("extent.reporter.spark.systeminfo.ExecutionTime",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }

    @AfterStep
    public void takeScreenshotAfterEachStep(Scenario scenario) {
        if (driver != null) {
            try {
                // Captura
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

                // ⚠️ Adjuntar sin nombre -> Evita mostrar texto técnico en PDF
                scenario.attach(screenshot, "image/png", "");

                // Guardar localmente con nombre limpio
                String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
                String fileName = scenario.getName().replaceAll("[^a-zA-Z0-9]", "_") + "_Step_" + timestamp + ".png";
                Files.createDirectories(Paths.get("target/screenshots/"));
                Files.write(Paths.get("target/screenshots/" + fileName), screenshot);

                System.out.println("📸 Captura tomada en paso: " + fileName);

            } catch (Exception e) {
                System.err.println("❌ Error capturando screenshot en paso: " + e.getMessage());
            }
        }
    }


    @After
    public void afterScenario(Scenario scenario) {
        // 📊 Log final del scenario
        String status = scenario.isFailed() ? "❌ FAILED" : "✅ PASSED";
        System.out.println("🏁 SCENARIO TERMINADO: " + scenario.getName() + " - " + status);

        if (scenario.isFailed()) {
            takeFailureScreenshot(scenario);
        }
    }

    /**
     * Screenshot especial para fallos
     */
    private void takeFailureScreenshot(Scenario scenario) {
        if (driver != null) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "FAILURE_SCREENSHOT");
                saveScreenshotToFile(screenshot, scenario.getName(), "FAILURE");
                System.out.println("🔴 FAILURE Screenshot capturado para: " + scenario.getName());
            } catch (Exception e) {
                System.err.println("❌ Error capturando failure screenshot: " + e.getMessage());
            }
        }
    }

    /**
     * Guardar screenshot en archivo local
     */
    private void saveScreenshotToFile(byte[] screenshot, String scenarioName, String stepName) {
        try {
            // Crear directorio si no existe
            String screenshotDir = "target/screenshots/";
            Files.createDirectories(Paths.get(screenshotDir));

            // Limpiar nombre del archivo
            String cleanScenarioName = scenarioName.replaceAll("[^a-zA-Z0-9]", "_");
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            String fileName = cleanScenarioName + "_" + stepName + "_" + timestamp + ".png";

            // Guardar archivo
            Files.write(Paths.get(screenshotDir + fileName), screenshot);
            System.out.println("💾 Screenshot guardado: " + screenshotDir + fileName);

        } catch (IOException e) {
            System.err.println("❌ Error guardando screenshot: " + e.getMessage());
        }
    }

    /**
     * Extrae el valor de un tag específico
     */
    private String extractTagValue(Collection<String> tags, String prefix) {
        for (String tag : tags) {
            if (tag.contains(prefix)) {
                String value = tag.replace("@", "");

                // Manejar casos específicos según tus tags
                if (prefix.equals("Enviroment_")) {
                    return value.replace("Enviroment_", "");
                } else if (prefix.equals("versia_renal")) {
                    return "VersiaRenal";
                } else if (prefix.equals("Module_")) {
                    return value.replace("Module_", "");
                } else if (tag.matches("@\\d+\\.\\d+")) {
                    // Para versiones como @3.2
                    return value;
                }
                return value;
            }
        }
        return null;
    }
}
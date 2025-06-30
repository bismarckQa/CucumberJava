package auto.framework.selenium.cucumber.hooks;

import io.cucumber.java.AfterAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 📄 Hook para generación automática de reporte PDF
 *
 * @author QA Automation Team
 * @version 3.2
 */
public class PDFReportHook {

    private static final Logger logger = LoggerFactory.getLogger(PDFReportHook.class);
    private static final DateTimeFormatter TIMESTAMP_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");

    /**
     * 📄 Procesa y organiza el reporte PDF después de todas las pruebas
     */
    @AfterAll
    public static void generateFinalPDFReport() {
        logger.info("📄 INICIANDO GENERACIÓN DE REPORTE PDF...");

        try {
            // Verificar que el PDF fue generado por ExtentReports
            String originalPdfPath = "target/reports/VersiaRenal-ExtentReport.pdf";
            File originalPdf = new File(originalPdfPath);

            if (originalPdf.exists()) {
                // Crear nombre con timestamp para el PDF final
                String timestamp = LocalDateTime.now().format(TIMESTAMP_FORMATTER);
                String finalPdfName = String.format("VersiaRenal_TestEvidence_%s.pdf", timestamp);
                String finalPdfPath = "target/reports/" + finalPdfName;

                // Copiar PDF con nombre único
                Path source = Paths.get(originalPdfPath);
                Path destination = Paths.get(finalPdfPath);
                Files.copy(source, destination);

                // Logs de éxito
                logger.info("✅ PDF GENERADO EXITOSAMENTE:");
                logger.info("   📁 Ubicación: {}", finalPdfPath);
                logger.info("   📊 Tamaño: {} KB", Files.size(destination) / 1024);
                logger.info("   🕒 Timestamp: {}", timestamp);

                // Información adicional
                printPDFSummary(finalPdfPath, originalPdfPath);

            } else {
                logger.warn("⚠️ No se encontró el PDF generado en: {}", originalPdfPath);
                logger.info("💡 Verifica que extent.reporter.pdf.start=true en extent.properties");
                logger.info("💡 El PDF se genera automáticamente por ExtentReports");
            }

        } catch (IOException e) {
            logger.error("❌ Error procesando reporte PDF: {}", e.getMessage());
        }

        logger.info("🎯 PROCESO DE PDF COMPLETADO");
    }

    /**
     * 📋 Muestra resumen de archivos generados
     */
    private static void printPDFSummary(String finalPdfPath, String originalPdfPath) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("📄 REPORTE PDF GENERADO - EVIDENCIAS DE TESTING");
        System.out.println("=".repeat(60));
        System.out.println("🎯 ARCHIVO PRINCIPAL (para evidencias):");
        System.out.println("   " + finalPdfPath);
        System.out.println("\n📋 OTROS REPORTES DISPONIBLES:");
        System.out.println("   📊 HTML: target/reports/VersiaRenal-ExtentReport.html");
        System.out.println("   🌐 Cucumber: target/reports/cucumber-html-report/index.html");
        System.out.println("   📄 PDF Original: " + originalPdfPath);
        System.out.println("\n📸 SCREENSHOTS:");
        System.out.println("   📁 Directorio: target/screenshots/");

        // Contar screenshots
        File screenshotsDir = new File("target/screenshots");
        if (screenshotsDir.exists() && screenshotsDir.isDirectory()) {
            File[] screenshots = screenshotsDir.listFiles((dir, name) -> name.endsWith(".png"));
            System.out.println("   📷 Total capturas: " + (screenshots != null ? screenshots.length : 0));
        }

        System.out.println("\n💡 El PDF contiene todas las evidencias y screenshots");
        System.out.println("   necesarios para documentación oficial.");
        System.out.println("=".repeat(60) + "\n");
    }
}
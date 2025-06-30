package auto.framework.selenium.cucumber.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 🧹 Hook para limpieza automática de screenshots y reportes antes de cada ejecución
 *
 * @author QA Automation Team
 * @version 3.2
 */
public class ScreenshotCleanupHook {

    private static final Logger logger = LoggerFactory.getLogger(ScreenshotCleanupHook.class);
    private static boolean isCleanupExecuted = false;

    /**
     * 🗑️ Limpia screenshots y reportes antes de TODA la suite de pruebas
     * Se ejecuta solo UNA VEZ por ejecución completa
     */
    @BeforeAll
    public static void cleanupBeforeAllTests() {
        if (!isCleanupExecuted) {
            logger.info("🧹 INICIANDO LIMPIEZA AUTOMÁTICA DE REPORTES Y SCREENSHOTS...");

            cleanupDirectory("target/screenshots", "screenshots antiguos");
            cleanupDirectory("target/reports", "reportes anteriores");

            // Crear directorios limpios
            createDirectoryIfNotExists("target/screenshots");
            createDirectoryIfNotExists("target/reports");

            logger.info("✅ LIMPIEZA COMPLETADA - Directorios listos para nueva ejecución");
            isCleanupExecuted = true;
        }
    }

    /**
     * 🗂️ Elimina el contenido de un directorio específico
     */
    private static void cleanupDirectory(String directoryPath, String description) {
        try {
            File directory = new File(directoryPath);
            if (directory.exists() && directory.isDirectory()) {
                FileUtils.cleanDirectory(directory);
                logger.info("🗑️  Eliminados {} de: {}", description, directoryPath);
            }
        } catch (IOException e) {
            logger.warn("⚠️  No se pudo limpiar {}: {}", directoryPath, e.getMessage());
        }
    }

    /**
     * 📁 Crea directorio si no existe
     */
    private static void createDirectoryIfNotExists(String directoryPath) {
        try {
            Path path = Paths.get(directoryPath);
            if (!Files.exists(path)) {
                Files.createDirectories(path);
                logger.info("📁 Directorio creado: {}", directoryPath);
            }
        } catch (IOException e) {
            logger.error("❌ Error creando directorio {}: {}", directoryPath, e.getMessage());
        }
    }
}
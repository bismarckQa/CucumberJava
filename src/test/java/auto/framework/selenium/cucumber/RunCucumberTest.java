package auto.framework.selenium.cucumber;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectDirectories;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src/test/java/auto/framework/selenium/cucumber/features/TestSuites")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "auto.framework.selenium.cucumber")
@ConfigurationParameter(key = Constants.PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")

// ========== REPORTES PROFESIONALES (RUTAS CORREGIDAS) ==========
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value =
        "pretty," +
                "html:target/reports/cucumber-html-report.html," +
                "junit:target/reports/cucumber-report.xml," +
                "timeline:target/reports/timeline-report," +
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
)

// ========== FILTROS DE TAGS INTELIGENTES ==========
// Descomenta la línea que necesites:

// 🏥 SOLO TESTS BÁSICOS
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@test")

// 🚀 SMOKE TESTS
//@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@smoke")

// ⚡ SOLO CASOS CRÍTICOS
//@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@test and @smoke")

// 🧪 AMBIENTE DEV
//@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@Enviroment_dev")

// 🔄 REGRESSION SIN MANUALES
//@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@regression and not @manual")

public class RunCucumberTest {
}
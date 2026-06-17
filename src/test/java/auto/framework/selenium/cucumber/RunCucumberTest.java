package auto.framework.selenium.cucumber;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectDirectories;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src/test/java/auto/framework/selenium/cucumber/features/TestSuites")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@test")
public class RunCucumberTest {
}

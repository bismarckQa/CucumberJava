package auto.framework.selenium.cucumber;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectDirectories;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src/test/java/auto/framework/selenium/cucumber/features")
public class RunCucumberCITest {
}

# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a **Spring Boot-based Selenium E2E test automation framework** for the Baxter/Versia Renal application. It uses **Cucumber BDD** with **JUnit 5** for parallel test execution and follows the **Page Object Pattern**. The framework leverages Spring's dependency injection to share WebDriver instances across page objects and step definitions within each test scenario.

## Build and Test Commands

### Run Tests

```bash
# Run tests via Maven with tag filtering
mvn -Dtest="auto.framework.selenium.cucumber.RunCucumberTest" -Dgroups="smoke | regression" test

# Run from IntelliJ
# Right-click and run: src/test/java/auto/framework/selenium/cucumber/RunCucumberTest.java
```

### Test Execution Configuration

The main test runner is `src/test/java/auto/framework/selenium/cucumber/RunCucumberTest.java`. Modify the `@ConfigurationParameter` annotations in this file to change:
- **Test tags**: Currently set to `@test`. Uncomment other lines for `@smoke`, `@regression`, etc.
- **Feature directory**: Currently `src/test/java/auto/framework/selenium/cucumber/features/TestSuites`
- **Parallel execution**: Configured in `src/test/resources/junit-platform.properties` with `cucumber.execution.parallel.config.fixed.parallelism = 2`

### Reports

Test execution generates multiple report formats in the `target/reports/` directory:
- ExtentReports HTML: `target/reports/VersiaRenal-ExtentReport.html`
- ExtentReports PDF: `target/reports/VersiaRenal-ExtentReport.pdf`
- Cucumber HTML: `target/reports/cucumber-html-report`
- Timeline report: `target/reports/timeline-report/`

## Architecture

### Spring Boot Integration

The framework uses Spring Boot to manage WebDriver lifecycle and dependency injection:

1. **Custom WebDriver Scope**: `src/test/java/auto/framework/selenium/scope/WebdriverScope.java` extends `SimpleThreadScope` to create a custom scope that manages WebDriver instances per test scenario. This ensures each Cucumber scenario gets its own isolated WebDriver instance.

2. **Lazy Initialization**: Custom annotations like `@LazyAutowired`, `@LazyComponent`, and `@WebdriverScopeBean` ensure WebDriver and page objects are only created when needed for a scenario.

3. **Spring Context Configuration**: `CucumberSpringContextConfig.java` bridges Cucumber and Spring Boot using `@CucumberContextConfiguration`.

### WebDriver Configuration

- **Local execution**: `src/test/java/auto/framework/selenium/configuration/WebDriverConfig.java` creates drivers based on the `browser` property in `application.properties` (chrome, firefox, edge, android)
- **Grid execution**: `RemoteWebDriverConfig.java` supports Selenium Grid (activated with Spring profile `grid`)
- **Browser selection**: Set via `browser` property in `src/test/resources/application.properties`

### Page Object Pattern

All page objects extend `BasePage<T>` (`src/test/java/auto/framework/selenium/pages/BasePage.java`):

- **Generic Type Parameter**: Each page object specifies itself as the type parameter (e.g., `class LoginPage extends BasePage<LoginPage>`) to enable method chaining
- **Autowired Dependencies**: WebDriver, WebDriverWait, JavascriptExecutor, and utilities are autowired via Spring
- **Element Interaction Methods**: All Selenium interactions MUST use BasePage methods (`click()`, `write()`, `readText()`, etc.) instead of direct WebElement methods. These methods internally call `waitElement()` to ensure elements are present/clickable before interaction.
- **Page Factory**: `@PostConstruct init()` method initializes page elements using PageFactory
- **isAt() Contract**: Each page object must implement `isAt()` to verify the page is loaded

Page objects are organized in:
- `src/test/java/auto/framework/selenium/pages/baxter_page/` - Application-specific pages
- `src/test/java/auto/framework/selenium/pages/loginpage/` - Login pages

### Step Definitions

Located in `src/test/java/auto/framework/selenium/cucumber/steps/`. Each step definition file corresponds to a page object (e.g., `LoginPageSteps.java` uses `LoginPage`). Step definitions use Cucumber annotations (`@Given`, `@When`, `@Then`, `@And`, `@But`) and must include assertions in `@Then` steps.

### Feature Files

Located in `src/test/java/auto/framework/selenium/cucumber/features/`, organized by test type:
- `Smoke/` - Smoke test scenarios (tag: `@smoke`)
- `Regression/` - Regression test scenarios (tag: `@regression`)
- `TestSuites/` - Test suite configurations (currently active directory)

### Hooks and Lifecycle

`src/test/java/auto/framework/selenium/cucumber/CucumberHooks.java`:
- `@AfterStep`: Takes screenshots on test failure
- `@After`: Closes and quits WebDriver after each scenario

Additional hooks in `src/test/java/auto/framework/selenium/cucumber/hooks/`:
- `ReportEnhancementHook.java`: Enhances reports with additional metadata
- `PDFReportHook.java`: Generates PDF reports
- `ScreenshotCleanupHook.java`: Manages screenshot cleanup

### Aspect-Oriented Programming

Custom annotations with AOP aspects in `src/test/java/auto/framework/selenium/aspect_oriented_programming/`:
- `@ElapsedTime`: Measures method execution time in milliseconds
- `@TakeScreenshot`: Automatically captures screenshots and saves to `src/test/resources/screenshots`

## Configuration Files

- `src/test/resources/application.properties`: Main configuration (URLs, credentials, browser, timeout, screenshot path)
- `src/test/resources/cucumber.properties`: Cucumber plugins and glue configuration
- `src/test/resources/junit-platform.properties`: Parallel execution settings
- `src/test/resources/extent.properties`: ExtentReports configuration

### Application Properties Structure

The `application.properties` file uses a custom map format for test data:
- `application.users={login_baxter:'support', login_baxter_false:'support1111', ...}`
- `application.passwords={login_baxter:'renal2', login_baxter_false:'renal1111', ...}`
- `application.patients={patient1:'Ape1_1838 Ape2_1838, Nom_1838 - 1838', ...}`

## Development Workflow

### Adding New Tests

1. **Add Feature File**: Create or modify `.feature` files in `src/test/java/auto/framework/selenium/cucumber/features/`
2. **Reuse or Create Steps**: Use existing step definitions or create new ones in `steps/`
3. **Create Page Objects if Needed**: Add page objects for new views/services in `pages/baxter_page/`, extending `BasePage<T>`

### Page Object Requirements

- Extend `BasePage<YourPageName>`
- Use `@LazyAutowired` for Spring dependencies
- Implement `isAt()` method
- Use BasePage methods (`click()`, `write()`, etc.) instead of direct WebElement methods
- Return `this` (typed as `P`) from interaction methods to enable method chaining

### Parallel Execution

The framework supports parallel test execution at the scenario level. Configure parallelism in `junit-platform.properties`:
- `cucumber.execution.parallel.enabled=true`
- `cucumber.execution.parallel.config.fixed.parallelism = 2`

Use Cucumber's resource lock tags for scenarios that cannot run in parallel:
- `@rw-lang` - read-write lock on language resource
- `@r-lang` - read lock on language resource

## Technology Stack

- **Java 17**
- **Spring Boot 3.0.1**
- **Selenium 4.13.0**
- **Cucumber 7.10.1**
- **JUnit 5 (Jupiter) 5.9.2**
- **ExtentReports 5.0.9**
- **Maven Surefire 3.0.0-M8**
- **Appium 8.5.1** (for Android support)

## Project Structure Notes

- Test code is in `src/test/java/` following the package structure `auto.framework.selenium.*`
- Configuration classes are in `src/test/java/auto/framework/selenium/configuration/`
- Utility classes are in `src/test/java/auto/framework/selenium/utils/`
- Custom annotations are in `src/test/java/auto/framework/selenium/annotations/`
- The main application class is `src/main/java/auto/framework/selenium/SpringSeleniumApplication.java`

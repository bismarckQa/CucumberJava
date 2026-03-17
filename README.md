# Framework Selenium Java
### Versión Spring Boot + Cucumber — Baxter / Versia Renal

---

## Descripción

Este framework recoge pruebas automatizadas **E2E** para la aplicación **Versia Renal** de Baxter.

Está basado en **Spring Boot**, que permite una integración potente entre las partes del framework: principalmente gestiona un **WebDriver por cada Scenario** y lo comparte entre **Page Objects y sus Steps** mediante inyección de dependencias.

La librería de pruebas es **Cucumber + JUnit 5 (Jupiter)**. Los tests se definen en archivos **Feature** de Cucumber y se pueden ejecutar en paralelo filtrando por **@Tags**. Incluso se pueden crear tags de cerrojo de lectura/escritura para escenarios que no deben ejecutarse simultáneamente.

El framework sigue el **patrón Page Object**: un objeto Java por cada servicio/vista de la web, que contiene los `WebElement` y los métodos de interacción.

---

## Tabla de contenidos

1. [Requisitos](#1-requisitos)
2. [Instalación y ejecución](#2-instalación-y-ejecución)
3. [Estructura del proyecto](#3-estructura-del-proyecto)
4. [Cómo añadir cobertura](#4-cómo-añadir-cobertura)
5. [Convenciones y patrones clave](#5-convenciones-y-patrones-clave)
6. [Módulos disponibles](#6-módulos-disponibles)
7. [Configuración](#7-configuración)
8. [Reportes](#8-reportes)
9. [Créditos](#9-créditos)

---

## 1. Requisitos

- Java 17
- Maven 3.x
- IntelliJ IDEA (recomendado) o cualquier IDE con soporte Maven
- Google Chrome / Firefox / Edge instalado
- Conexión a la aplicación Versia Renal (dev/staging)

---

## 2. Instalación y ejecución

### Desde terminal (Maven)
```bash
mvn -Dtest="auto.framework.selenium.cucumber.RunCucumberTest" -Dgroups="smoke | regression" test
```

### Desde IntelliJ
1. Abrir el proyecto (carpeta raíz con `pom.xml`)
2. IntelliJ descarga las dependencias automáticamente via Maven
3. Ejecutar con botón derecho → **Run**: `src/test/java/auto/framework/selenium/cucumber/RunCucumberTest.java`

### Filtrar por tags
Editar las anotaciones `@ConfigurationParameter` en `RunCucumberTest.java`:
```java
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@smoke")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@regression")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@test")
```

### Ejecución paralela
Configurada en `src/test/resources/junit-platform.properties`:
```properties
cucumber.execution.parallel.enabled=true
cucumber.execution.parallel.config.fixed.parallelism=2
```

---

## 3. Estructura del proyecto

```
src/
└── test/
    ├── java/auto/framework/selenium/
    │   ├── cucumber/
    │   │   ├── features/
    │   │   │   ├── Smoke/              # Escenarios smoke (@smoke)
    │   │   │   ├── Regression/         # Escenarios de regresión (@regression)
    │   │   │   │   ├── Demographics/   # Módulo Demographics
    │   │   │   │   ├── LabTest/        # Módulo Lab Tests
    │   │   │   │   ├── Hospitalization/
    │   │   │   │   ├── Medication/
    │   │   │   │   ├── Access/
    │   │   │   │   ├── HDPrescription/
    │   │   │   │   ├── HDTherapy_Config/
    │   │   │   │   ├── PhysicalAssessment/
    │   │   │   │   ├── PDPrescription/
    │   │   │   │   └── ...
    │   │   │   └── TestSuites/         # Suite activa para pruebas rápidas
    │   │   ├── steps/                  # Step definitions (un archivo por Page)
    │   │   ├── RunCucumberTest.java    # Punto de entrada de ejecución
    │   │   ├── CucumberHooks.java      # Hooks: screenshot en fallo, quit driver
    │   │   └── hooks/                  # Hooks adicionales (reports, cleanup)
    │   ├── pages/
    │   │   ├── BasePage.java           # Clase base de todos los Page Objects
    │   │   └── baxter_page/            # Page Objects de la aplicación
    │   ├── configuration/              # WebDriver config (local y Grid)
    │   ├── annotations/                # @LazyAutowired, @LazyComponent, etc.
    │   ├── aspect_oriented_programming/ # @ElapsedTime, @TakeScreenshot
    │   ├── scope/                      # WebdriverScope (scope por scenario)
    │   └── utils/                      # Utilidades generales
    └── resources/
        ├── application.properties      # URLs, credenciales, browser, timeout
        ├── cucumber.properties         # Plugins y glue de Cucumber
        ├── junit-platform.properties   # Configuración de paralelismo
        └── extent.properties           # Configuración de reportes ExtentReports
```

---

## 4. Cómo añadir cobertura

El orden correcto al añadir nueva cobertura es **de abajo hacia arriba**: Page → Steps → Feature.

### 4.1 Crear un Page Object

1. Crear clase en `src/test/java/auto/framework/selenium/pages/baxter_page/`
2. Extender `BasePage<NombreDeTuPage>`
3. Anotar con `@LazyComponent`
4. Declarar `@FindBy` para cada elemento
5. Implementar el método `isAt()`
6. Crear métodos de interacción usando **siempre** los métodos de `BasePage`

```java
@LazyComponent
public class MiNuevaPagina extends BasePage<MiNuevaPagina> {

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.campo']")
    private WebElement inputCampo;

    @Override
    public boolean isAt() { return false; }

    public void enterCampo(String valor) throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(inputCampo);
        inputCampo.clear();
        write(inputCampo, valor);
        pause(500);
        switchBack();
    }
}
```

### 4.2 Crear Steps

1. Crear clase en `src/test/java/auto/framework/selenium/cucumber/steps/`
2. Inyectar el Page Object con `@LazyAutowired`
3. Definir métodos con `@Given`, `@When`, `@Then`, `@And`
4. Los steps `@Then` deben contener **assertions**

```java
public class MiNuevaPaginaSteps {

    @LazyAutowired
    private MiNuevaPagina miNuevaPagina;

    @And("I enter the campo {string}")
    public void iEnterTheCampo(String valor) throws InterruptedException {
        miNuevaPagina.enterCampo(valor);
    }
}
```

### 4.3 Crear Feature

1. Crear `.feature` en la carpeta correspondiente (`Smoke/` o `Regression/<Modulo>/`)
2. Aplicar las tags de cabecera estándar
3. Usar los steps ya definidos

```gherkin
@Environment_dev
@versia_renal
@3.2
@NombreModulo
Feature: Descripción del módulo

  @test @regression @test_Case_XXXX
  Scenario: Descripción del escenario
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    ...
```

---

## 5. Convenciones y patrones clave

### BasePage — métodos obligatorios

Usar **siempre** los métodos de `BasePage` en lugar de llamar directamente al `WebElement`. Internamente aplican `waitElement()` que espera a que el elemento esté en el DOM.

| Método | Uso |
|--------|-----|
| `click(element)` | Clic con espera |
| `click(By locator)` | Clic por locator dinámico |
| `write(element, text)` | Escribir en input |
| `readText(element)` | Leer texto de elemento |
| `scrollToElementMove(element)` | Scroll suave hasta el elemento |
| `waitElements(element)` | Esperar a que el elemento sea visible |
| `pause(ms)` | Pausa en milisegundos |
| `clickBelowElementByOffset(element, px)` | Clic JS a N píxeles debajo del elemento |

### Kendo UI dropdowns

Los dropdowns de Kendo requieren un tratamiento especial. Hay dos patrones según el tipo:

**Kendo ComboBox** (patrón estándar):
```java
private void selectKendoOption(WebElement expandBtn, WebElement inputRef) throws InterruptedException {
    scrollToElementMove(expandBtn);
    click(expandBtn);
    pause(500);
    clickBelowElementByOffset(inputRef, 40);
    pause(500);
}
```

**Kendo DropDownList** (listbox):
```java
click(dropDownButton);
pause(500);
click(By.xpath("//ul[@role='listbox']//li[1]"));
```

**Kendo ComboBox con li tabindex** (variante referred by):
```java
click(dropDownButton);
pause(500);
click(By.xpath("(//li[@tabindex='-1'])[1]"));
```

### Cambio de frames

La aplicación usa iframes anidados. Antes de interactuar con cualquier elemento:

```java
private void switchToContentFrame() {
    driver.switchTo().frame("frmContenido");
    driver.switchTo().frame("iframeV2");
}

private void switchBack() {
    driver.switchTo().parentFrame();
    driver.switchTo().parentFrame();
}
```

Todos los métodos de Page Object deben llamar a `switchToContentFrame()` al inicio y `switchBack()` al final.

### Datepickers (Kendo Date Picker)

```java
inputFecha.sendKeys(Keys.chord(Keys.CONTROL, "a"));
inputFecha.sendKeys("01/01/2024");
```

### Menú tres puntos (three-points menu)

```java
click(By.xpath(
    "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
    "//a[not(contains(@class,'ng-hide'))]//span[normalize-space(.)='" + option + "']"
));
```

### Botón New por índice (múltiples grids en la misma página)

```java
public void clickNewButtonByIndex(int index) throws InterruptedException {
    switchToContentFrame();
    WebElement btn = driver.findElement(By.xpath("(//button[contains(@class,'k-grid-add')])[" + index + "]"));
    scrollToElementMove(btn);
    click(btn);
    pause(500);
    switchBack();
}
```

### Anotaciones de utilidad

- `@ElapsedTime` — mide el tiempo de ejecución del método en milisegundos
- `@TakeScreenshot` — captura pantalla automáticamente (guardado en `src/test/resources/screenshots`)

---

## 6. Módulos disponibles

| Módulo | Page Object | Steps |
|--------|-------------|-------|
| Login | `LoginPage.java` | `LoginPageSteps.java` |
| BaxterHome | `BaxterHomePage.java` | `BaxterHomeSteps.java` |
| Demographics | `DemographicsPage.java` | `DemographicsSteps.java` |
| LabTests | `LabTestsPage.java` | `LabTestsSteps.java` |
| Accesses | `AccessesPage.java` | `AccessesSteps.java` |
| Allergies | `AllergiesModulePage.java` | `AllergiesSteps.java` |
| Hospitalization | `HospitalizationPage.java` | `HospitalizationSteps.java` |
| Medication | `MedicationPage.java` | `MedicationSteps.java` |
| HDPrescription | `HDPrescriptionPage.java` | `HDPrescriptionSteps.java` |
| HDTreatment | `HDTreatmentPage.java` | `HDTreatmentSteps.java` |
| HDTherapyConfig | `HDTherapyConfigPage.java` | `HDTherapyConfigSteps.java` |
| PhysicalAssessment | `PhysicalAssessmentPage.java` | `PhysicalAssessmentSteps.java` |
| PDPrescription | `PDPrescriptionPage.java` | `PDPrescriptionSteps.java` |
| PDTreatment | `PDTreatmentPage.java` | `PDTreatmentSteps.java` |
| Reviews | `ReviewsModulePage.java` | `ReviewsSteps.java` |
| NursingCare | `NursingCarePage.java` | `NursingCareSteps.java` |
| Diagnoses | `DiagnosesModulePage.java` | `DiagnosesSteps.java` |
| Infections | `InfectionsPage.java` | `InfectionsSteps.java` |
| Transplant | `TransplantPage.java` | `TransplantSteps.java` |
| WaitingList | `WaitingListPage.java` | `WaitingListSteps.java` |
| ... | ... | ... |

---

## 7. Configuración

### application.properties

```properties
# URL de la aplicación
application.url=https://...

# Browser: chrome | firefox | edge | android
browser=chrome

# Timeout de esperas (segundos)
application.timeout=10

# Usuarios y contraseñas (formato mapa)
application.users={login_baxter:'support', login_baxter_false:'support1111'}
application.passwords={login_baxter:'renal2', login_baxter_false:'renal1111'}

# Pacientes de prueba
application.patients={patient1:'Ape1_1838 Ape2_1838, Nom_1838 - 1838'}
```

### Selenium Grid (opcional)

Activar el perfil `grid` para ejecutar en Selenium Grid:
```bash
mvn test -Dspring.profiles.active=grid
```

---

## 8. Reportes

Tras la ejecución se generan reportes en `target/reports/`:

| Reporte | Ruta |
|---------|------|
| ExtentReports HTML | `target/reports/VersiaRenal-ExtentReport.html` |
| ExtentReports PDF | `target/reports/VersiaRenal-ExtentReport.pdf` |
| Cucumber HTML | `target/reports/cucumber-html-report/` |
| Timeline | `target/reports/timeline-report/` |

---

## 9. Créditos

- [Spring Initializr](https://start.spring.io/)
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Gherkin Reference](https://cucumber.io/docs/gherkin/reference/)
- [Selenium 4 — WebDriverManager integrado](https://www.selenium.dev/blog/2022/selenium-4-6-0-released/)
- [Markdown Cheat Sheet](https://www.markdownguide.org/cheat-sheet/)

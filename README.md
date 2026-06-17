# Framework de Automatización Selenium Java

## Versia Renal - Vantive

Este repositorio contiene el framework de automatización funcional end-to-end para la aplicación Versia Renal. La herramienta permite transformar casos de prueba manuales en escenarios automatizados ejecutables con navegador real, evidencias, reportes y una estructura mantenible por módulos.

El framework está construido con Java, Maven, Selenium WebDriver, Cucumber, Gherkin, Spring / Spring Boot, JUnit y Extent Reports.

---

## Índice

1. [Objetivo de la herramienta](#1-objetivo-de-la-herramienta)
2. [Tecnologías utilizadas](#2-tecnologías-utilizadas)
3. [Importancia del pom.xml](#3-importancia-del-pomxml)
4. [Cómo funciona el framework](#4-cómo-funciona-el-framework)
5. [Estructura del proyecto](#5-estructura-del-proyecto)
6. [Flujo Feature - Steps - Page](#6-flujo-feature---steps---page)
7. [BasePage](#7-basepage)
8. [Configuración](#8-configuración)
9. [Ejecución](#9-ejecución)
10. [Reportes y evidencias](#10-reportes-y-evidencias)
11. [XPaths, iframes y Kendo](#11-xpaths-iframes-y-kendo)

---

## 1. Objetivo de la herramienta

El objetivo del framework es automatizar pruebas funcionales end-to-end sobre Versia Renal. La automatización abre el navegador, inicia sesión, navega por la aplicación, selecciona usuarios o pacientes, interactúa con formularios, valida resultados y genera evidencias de ejecución.

La herramienta no es una colección de scripts aislados. Está organizada por capas para que el mantenimiento sea más sencillo:

- Si cambia un caso de prueba, se actualiza el archivo `.feature`.
- Si cambia la frase de un paso, se revisa la clase de `steps`.
- Si cambia una pantalla, botón, tabla o formulario, se actualiza la `Page`.
- Si se necesita una acción común, se centraliza en `BasePage`.

---

## 2. Tecnologías utilizadas

| Tecnología | Uso dentro del framework |
| ---------- | ------------------------ |
| Eclipse Temurin JDK 25 / Java 25 | Lenguaje principal. Contiene steps, pages, utilidades, configuración y lógica de automatización. |
| Maven 3.9.x | Gestiona dependencias, compilación, plugins y ejecución de pruebas mediante el `pom.xml`. |
| Selenium WebDriver 4.44.0 | Controla el navegador: clicks, inputs, iframes, alertas, tablas, scrolls y validaciones. |
| Cucumber 7.34.3 | Conecta escenarios escritos en Gherkin con métodos Java. |
| Gherkin | Lenguaje de los archivos `.feature`, usando `Given`, `When`, `Then` y `And`. |
| Spring Boot 4.0.6 | Gestiona contexto, componentes, inyección de dependencias y configuración compartida. |
| JUnit Platform / JUnit Jupiter 6.0.3 | Permite lanzar la suite de Cucumber desde Java. |
| TestNG 7.12.0 | Se mantiene por compatibilidad con dependencias y ejecuciones existentes. |
| Lombok 1.18.42 | Da soporte a anotaciones y generación de código en compilación. |
| Extent Reports 5.1.2 | Genera reportes HTML con escenarios, pasos, estados y evidencias. |
| Chrome / Selenium Manager | Prepara el driver necesario para que Selenium controle el navegador. |
| application.properties | Centraliza URL, credenciales, navegador, timeouts y datos de ejecución. |

---

## 3. Importancia del pom.xml

El archivo `pom.xml` es una pieza principal del proyecto. Es el archivo de configuración de Maven y define cómo se construye, compila y ejecuta el framework.

En este proyecto el `pom.xml` sirve para:

- Declarar las dependencias necesarias: Selenium, Cucumber, Spring, JUnit, Extent Reports y librerías auxiliares.
- Definir la versión de Java usada por el proyecto.
- Configurar plugins de Maven para compilar y ejecutar pruebas.
- Permitir que Visual Studio Code, mediante Maven, descargue automáticamente las librerías.
- Ejecutar la suite desde terminal usando comandos `mvn`.
- Mantener el proyecto reproducible en otro equipo sin copiar librerías manualmente.

Cuando se abre el proyecto en Visual Studio Code, Maven lee el `pom.xml`, descarga las dependencias y prepara el entorno. Por eso el proyecto debe abrirse desde la carpeta raíz donde está el `pom.xml`.

Ejemplo de ejecución Maven:

```bash
mvn -Dtest="auto.framework.selenium.cucumber.RunCucumberTest" test
```

---

## 4. Cómo funciona el framework

El flujo general es:

1. Cucumber lee un escenario escrito en Gherkin.
2. Cada línea del escenario se enlaza con un método Java en la capa de steps.
3. El step llama a una Page Object.
4. La Page Object usa Selenium para interactuar con la pantalla.
5. `BasePage` aporta métodos comunes de espera, click, escritura, alertas, iframes y dropdowns.
6. Al ejecutar, se generan evidencias y reportes.

La idea principal es separar el lenguaje del caso de prueba de la implementación técnica. El `.feature` queda legible para QA, mientras que Selenium ejecuta la acción real dentro de las Pages.

---

## 5. Estructura del proyecto

```text
src/
└── test/
    ├── java/auto/framework/selenium/
    │   ├── cucumber/
    │   │   ├── features/
    │   │   │   ├── Regression/
    │   │   │   ├── Smoke/
    │   │   │   └── TestSuites/
    │   │   ├── steps/
    │   │   ├── RunCucumberTest.java
    │   │   └── CucumberHooks.java
    │   ├── pages/
    │   │   ├── BasePage.java
    │   │   └── baxter_page/
    │   ├── configuration/
    │   ├── annotations/
    │   ├── aspect_oriented_programming/
    │   ├── scope/
    │   └── utils/
    └── resources/
        ├── application.properties
        ├── cucumber.properties
        ├── junit-platform.properties
        └── extent.properties
```

| Ruta | Función |
| ---- | ------- |
| `features` | Contiene escenarios Gherkin por módulo. |
| `steps` | Traduce cada frase Gherkin a código Java. |
| `pages/baxter_page` | Contiene las Page Objects de cada módulo. |
| `BasePage.java` | Centraliza acciones comunes de Selenium. |
| `configuration` | Configuración del navegador, WebDriver y contexto. |
| `aspect_oriented_programming` | Lógica transversal como evidencias o tiempos. |
| `resources` | Properties, configuración de Cucumber, JUnit y reportes. |
| `target` | Carpeta generada por Maven con compilados y reportes. No se sube como cambio funcional. |

---

## 6. Flujo Feature - Steps - Page

Cuando se crea un módulo nuevo, el framework se empieza siempre por las mismas tres piezas:

1. Un archivo `.feature` dentro de `features`, normalmente agrupado por módulo.
2. Una clase `Steps` dentro del paquete `auto.framework.selenium.cucumber.steps`.
3. Una clase `Page` dentro del paquete `auto.framework.selenium.pages.baxter_page`.

La regla práctica es que el `.feature` describe el caso, el `Steps` solo conecta la frase con Java y la `Page` ejecuta Selenium usando localizadores y métodos comunes heredados de `BasePage`.

### Feature

Describe el escenario en lenguaje Gherkin:

```gherkin
Scenario: View received messages
  Given I open the Vantive website
  And   I try to login with "login_baxter" credentials
  And   I login successful
  When  I click messages icon
  And   I click see all messages
  Then  I verify received messages displayed
```

### Steps

Cada frase del Feature se conecta con un método Java:

```java
@When("I click messages icon")
public void iClickMessagesIcon() throws InterruptedException {
    messagesPage.clickMessagesIcon();
}
```

### Page

La Page ejecuta la acción real con Selenium:

```java
public void clickMessagesIcon() throws InterruptedException {
    waitElements(messagesIcon);
    click(messagesIcon);
}
```

### Crear un módulo nuevo desde cero

Ejemplo básico usando un módulo inicial llamado `Search`.

Primero se crea el Feature:

```text
src/test/java/auto/framework/selenium/cucumber/features/Regression/Search/ViewSearch.feature
```

Ejemplo mínimo:

```gherkin
@Environment_dev @versia_renal @3.2 @Search @regression
Feature: Search - View search

  Background:
    Given I open the Vantive website
    And   I try to login with "login_baxter" credentials
    And   I login successful

  Scenario: Open search
    When  I click search icon
```

Después se crea la clase de Steps:

```text
src/test/java/auto/framework/selenium/cucumber/steps/SearchSteps.java
```

El Step no debe contener Selenium directamente. Solo recibe la frase del Feature y llama a la Page:

```java
package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.SearchPage;
import io.cucumber.java.en.When;

public class SearchSteps {

    @LazyAutowired
    private SearchPage searchPage;

    @When("I click search icon")
    public void iClickSearchIcon() throws InterruptedException {
        searchPage.clickSearchIcon();
    }
}
```

Luego se crea la Page:

```text
src/test/java/auto/framework/selenium/pages/baxter_page/SearchPage.java
```

La Page hereda de `BasePage`, define los elementos arriba y abajo crea métodos claros reutilizables:

```java
package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

@LazyComponent
public class SearchPage extends BasePage<SearchPage> {

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'fa-search')]/ancestor::*[self::button or self::a or self::li or self::span][1]")
    private WebElement btnSearchIcon;

    @Override
    public boolean isAt() {
        return wait.until((d) -> btnSearchIcon.isDisplayed());
    }

    public void clickSearchIcon() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(btnSearchIcon));
        click(btnSearchIcon);
        pause(500);
    }
}
```

En este ejemplo la Page consume métodos y objetos de `BasePage`, como `wait`, `click()` y `pause()`. Si el módulo necesita dropdowns Kendo, alertas, iframes, scroll o clicks especiales, se debe revisar primero si `BasePage` ya tiene un método reutilizable antes de crear lógica nueva.

La pauta para empezar cualquier módulo es:

- El nombre del Step debe ser directo y entendible.
- Los XPaths y WebElements van arriba en la Page.
- Los métodos de la Page deben ser pequeños y reutilizables.
- El Step llama a la Page, no a Selenium.
- La Page hereda de `BasePage` para reutilizar esperas, clicks, scrolls, iframes, alertas y dropdowns.

---

## 7. BasePage

`BasePage` es la clase base que heredan las Page Objects. Evita repetir código común en cada módulo.

Métodos y responsabilidades habituales:

- Clicks normales.
- Clicks por JavaScript.
- Escritura en inputs.
- Lectura de textos.
- Esperas explícitas.
- Scroll a elementos.
- Manejo de iframes.
- Manejo de alertas del navegador.
- Manejo de modales HTML.
- Selección de dropdowns Kendo.
- Métodos auxiliares para tablas y acciones comunes.

La regla práctica es no duplicar lógica de Selenium en cada Page si puede resolverse con un método común en `BasePage`.

---

## 8. Configuración

La configuración principal vive en `src/test/resources/application.properties`.

Ejemplos de datos centralizados:

```properties
application.url=https://...
browser=chrome
application.timeout=10
application.users={login_baxter:'support', login_baxter_t:'trasplante'}
application.passwords={login_baxter:'renal2', login_baxter_t:'trasplante'}
```

En los Features no se escribe directamente el usuario real. Se usa una clave:

```gherkin
And I try to login with "login_baxter" credentials
```

El framework toma esa clave, busca usuario y contraseña en properties y los escribe en la pantalla de login.

---

## 9. Ejecución

Antes de ejecutar, el equipo debe tener configurado Java 25 y Maven.

Pasos recomendados en VS Code:

1. Abrir el proyecto desde el workspace versia-QA (en la carpeta vscode-workspaces).
2. Instalar o habilitar las extensiones recomendadas (Java y Cucumber).
3. Reiniciar vscode.
4. Instalar el JDK versión 25 (**NUNCA INSTALAR DESDE ORACLE**). Se puede hacer desde las opciones de Java, sino descargar de la dirección:
https://learn.microsoft.com/en-us/java/openjdk/download
5. Ejecutar Maven desde la sección MAVEN del explorador de soluciones -> cucumber-selenium -> Lifecycle -> test.
> La primera ejecución de Maven debería fallar, porque falta configurar el path de Java. Para esto, accedemos a la carpeta %userprofile%/.m2 y creamos el fichero toolchains.xml. El contenido del fichero debe ser como el siguiente, pero con el jdkHome apuntando a vuestra instalación local del JDK elegido.
```xml
<?xml version="1.0" encoding="UTF-8"?>
<toolchains>
  <toolchain>
    <type>jdk</type>
    <provides>
      <version>25</version>
    </provides>
    <configuration>
      <jdkHome>C:\Program Files\Microsoft\jdk-25.0.3.9-hotspot</jdkHome>
    </configuration>
  </toolchain>
</toolchains>
``` 


### Si se quiere lanzar desde terminal

```bash
.\mvnw.cmd -Dtest="auto.framework.selenium.cucumber.RunCucumberTest" test
```

Compilación rápida sin ejecutar escenarios:

```bash
.\mvnw.cmd -DskipTests test-compile
```

### Ejecución por tags

Los escenarios pueden filtrarse por tags como:

```gherkin
@test
@regression
@test_Case_17388
```

La suite puede configurarse para ejecutar solo los escenarios necesarios.

---

## 10. Reportes y evidencias

Después de ejecutar, el framework genera reportes y evidencias. Sirven para revisar qué escenario se ejecutó, qué pasos pasaron, dónde falló y qué veía el navegador.

| Elemento | Uso |
| -------- | --- |
| `target/reports/VersiaRenal-ExtentReport.html` | Reporte visual de ejecución. |
| `target/reports/cucumber-report.xml` | Resultado estructurado de Cucumber. |
| `src/test/resources/screenshots/` | Capturas de pantalla. |
| `src/test/resources/screenshots/test-execution.log` | Log de ejecución. |

Los reportes y archivos de `target` son generados por ejecución. Normalmente no se suben al repositorio.

---

## 11. XPaths, iframes y Kendo

### XPaths

Los XPaths deben construirse desde referencias estables del DOM:

```xpath
//h2[text()='Medication']//span[contains(@class,'k-icon')]
//h2[text()='Messages']/ancestor::div[contains(@class,'x_panel')]//button[contains(@class,'k-grid-add')]
//tr[.//td[contains(text(),'Foianini Baggio')]]//button[contains(@class,'k-grid-edit')]
```

Se deben evitar rutas absolutas como:

```xpath
/html/body/div[3]/div[1]/div[4]/div/div[2]/ul/li[1]
```

### Iframes

Selenium solo interactúa con el contexto actual. Si el módulo está dentro de un iframe, primero hay que entrar:

```java
driver.switchTo().frame("frmContenido");
// acciones dentro del módulo
driver.switchTo().parentFrame();
```

Si hay dos iframes:

```java
driver.switchTo().frame("frmContenido");
driver.switchTo().frame("iframeV2");
// acciones dentro del formulario
driver.switchTo().parentFrame();
driver.switchTo().parentFrame();
```

### Kendo

Los dropdowns Kendo no siempre son un `select` HTML normal. Muchas veces el `select` real está oculto y hay que hacer click sobre el componente visible. Por eso se usan métodos reutilizables de `BasePage` para seleccionar opciones por texto.
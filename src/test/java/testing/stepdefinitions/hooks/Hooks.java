package testing.stepdefinitions.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    @Before(order = 0)
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order = 1)
    public void restartBrowserBeforeScenario(Scenario scenario) {
        System.out.println("🔄 Reiniciando navegador para el escenario: " + scenario.getName());

        try {
            // Si hay un driver activo, cerrarlo completamente
            WebDriver existing = Serenity.getDriver();
            if (existing != null) {
                if (existing instanceof WebDriverFacade) {
                    ((WebDriverFacade) existing).getProxiedDriver().quit();
                } else {
                    existing.quit();
                }
            }
        } catch (Exception e) {
            System.out.println("⚠️ Error cerrando el navegador anterior: " + e.getMessage());
        }

        // Crear uno nuevo
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Asociar el nuevo driver al actor principal
        OnStage.theActorCalled("User").can(BrowseTheWeb.with(driver));

        // Guardar el nombre del escenario
        Serenity.setSessionVariable("ScenarioName").to(scenario.getName());
    }
}
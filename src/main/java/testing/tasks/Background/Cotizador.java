package testing.tasks.Background;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static testing.ui.Background.CotizadorPage.COTIZADOR;

public class Cotizador implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {

            String originalWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();

            for (String window : allWindows) {
                if (!window.equals(originalWindow)) {
                    driver.switchTo().window(window);
                    System.out.println("🔄 Cambiado a la nueva ventana.");
                    break;
                }
            }


            WebElement botonCotizador = wait.until(
                    ExpectedConditions.elementToBeClickable(COTIZADOR)
            );

            // Hacer scroll y click
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", botonCotizador);
            botonCotizador.click();
            System.out.println("✅ Click en el botón 'Cotizador' realizado.");

        } catch (Exception e) {
            System.out.println("❌ Error al hacer clic en el botón 'Cotizador': " + e.getMessage());
        }
    }

    public static Cotizador click() {
        return instrumented(Cotizador.class);
    }
}

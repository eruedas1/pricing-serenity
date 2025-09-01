package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import static testing.ui.CotizadorPage.COTIZADOR;

public class Cotizador implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            // Cambiar a la nueva ventana
            String originalWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();

            for (String window : allWindows) {
                if (!window.equals(originalWindow)) {
                    driver.switchTo().window(window);
                    System.out.println("🔄 Cambiado a la nueva ventana.");
                    break;
                }
            }

            // Buscar el botón "Cotizador"
            List<WebElement> botones = driver.findElements(COTIZADOR);
            boolean encontrado = false;

            for (WebElement span : botones) {
                if (span.getText().trim().equalsIgnoreCase("Cotizador")) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", span);
                    span.click();
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("❌ No se encontró el botón con texto 'Cotizador'.");

            }

        } catch (Exception e) {
            System.out.println("❌ Error al hacer clic en el botón 'Cotizador': " + e.getMessage());
        }
    }

    public static Cotizador click() {
        return new Cotizador();
    }
}

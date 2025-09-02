package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import static testing.ui.CargarInformacionPage.BOTON_CARGAR_INFORMACION;

public class CargarInformacion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            // Esperar a que el botón sea visible y clickeable
            wait.until(ExpectedConditions.elementToBeClickable(BOTON_CARGAR_INFORMACION));

            WebElement boton = driver.findElement(BOTON_CARGAR_INFORMACION);
            System.out.println("Texto del botón encontrado: '" + boton.getText().trim() + "'");

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", boton);
            boton.click();

        } catch (Exception e) {
            System.out.println("❌ Error al hacer clic en el botón 'Cargar información': " + e.getMessage());
        }
    }
    public static CargarInformacion click() {
        return new CargarInformacion();
    }
}

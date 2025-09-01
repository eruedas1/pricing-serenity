package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.cssSelector;

public class CotizadorPage {

    public static final By COTIZADOR = cssSelector("button.button span.button-text");
    private CotizadorPage() {
    }
}

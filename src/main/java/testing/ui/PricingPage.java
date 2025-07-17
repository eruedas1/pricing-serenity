package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.cssSelector;

public class PricingPage {

    public static final Target INICIO_PRICING = Target.the("Boton Pricing").locatedBy("(//div[@class='Home_cardHover__BTtFn'])[2]");
    public static final By COTIZADOR = cssSelector("button.button span.button-text");
    private PricingPage() {
    }
}

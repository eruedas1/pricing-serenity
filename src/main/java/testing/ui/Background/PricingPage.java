package testing.ui.Background;

import net.serenitybdd.screenplay.targets.Target;


public class PricingPage {

    public static final Target INICIO_PRICING = Target.the("Boton Pricing").locatedBy("//div[contains(text(),'Pricing')]");
    private PricingPage() {
    }
}

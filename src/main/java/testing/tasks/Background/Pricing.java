package testing.tasks.Background;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.Background.PricingPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Pricing implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PricingPage.INICIO_PRICING, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(PricingPage.INICIO_PRICING)
        );
    }
    public static Pricing click() {
        return new Pricing();
    }
}

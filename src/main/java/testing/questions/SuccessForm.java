package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPage;
import testing.ui.PricingPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SuccessForm implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(FormularioPage.FORMULARIO, isVisible()).forNoMoreThan(180).seconds() ,//Tiempo de espera para cargar la pagina fomrulario
                Ensure.that(FormularioPage.FORMULARIO).isDisplayed(),
                Ensure.that(FormularioPage.FORMULARIO).text().contains("Cotizador")

        );
        return true;
    }

    public static SuccessForm loginExitoso() {
        return new SuccessForm();
    }
}

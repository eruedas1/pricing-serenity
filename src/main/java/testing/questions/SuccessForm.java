package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPasoUno.FormularioPasoUnoNitPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SuccessForm implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(FormularioPasoUnoNitPage.FORMULARIO, isVisible()).forNoMoreThan(180).seconds() ,//Tiempo de espera para cargar la pagina fomrulario
                Ensure.that(FormularioPasoUnoNitPage.FORMULARIO).isDisplayed(),
                Ensure.that(FormularioPasoUnoNitPage.FORMULARIO).text().contains("Cotizador")

        );
        return true;
    }

    public static SuccessForm loginExitoso() {
        return new SuccessForm();
    }
}

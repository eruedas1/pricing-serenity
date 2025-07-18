package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import testing.ui.FormularioPage;

public class SuccessForm implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(FormularioPage.FORMULARIO).isDisplayed(),
                Ensure.that(FormularioPage.FORMULARIO).text().contains("Cotizador")
        );
        return true;
    }

    public static SuccessForm loginExitoso() {
        return new SuccessForm();
    }
}

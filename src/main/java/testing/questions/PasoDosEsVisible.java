package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.Formulario.FormularioPasoDosPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class PasoDosEsVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            // Espera hasta que el título sea visible
            actor.attemptsTo(
                    WaitUntil.the(FormularioPasoDosPage.TITULO_PASO_DOS, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                    Ensure.that(FormularioPasoDosPage.TITULO_PASO_DOS).isDisplayed()

            );

            // Debug: imprimir si el elemento se encuentra
            boolean visible = FormularioPasoDosPage.TITULO_PASO_DOS.resolveFor(actor).isVisible();
            System.out.println("Paso 2 visible? " + visible);
            return visible;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método estático para usar en el Step de manera limpia
    public static PasoDosEsVisible existe() {
        return new PasoDosEsVisible();
    }
}
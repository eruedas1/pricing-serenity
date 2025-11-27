package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SuccessForm implements Question<Boolean> {

    private final Target elemento;
    private final String textoEsperado;

    public SuccessForm(Target elemento, String textoEsperado) {
        this.elemento = elemento;
        this.textoEsperado = textoEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(elemento, isVisible()).forNoMoreThan(30).seconds(),
                Ensure.that(elemento).isDisplayed()
        );

        if (textoEsperado != null) {
            actor.attemptsTo(
                    Ensure.that(elemento).text().contains(textoEsperado)
            );
        }

        return true;
    }

    public static SuccessForm con(Target elemento) {
        return new SuccessForm(elemento, null);
    }

    public static SuccessForm conTexto(Target elemento, String texto) {
        return new SuccessForm(elemento, texto);
    }
}

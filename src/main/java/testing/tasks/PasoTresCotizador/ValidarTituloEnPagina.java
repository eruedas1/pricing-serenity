package testing.tasks.PasoTresCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.time.Duration;

import static testing.ui.Formulario.FormularioPasoTresPage.TITULO;
public class ValidarTituloEnPagina implements Task {

    private final String textoEsperado;

    public ValidarTituloEnPagina(String textoEsperado) {
        this.textoEsperado = textoEsperado;
    }

    public static ValidarTituloEnPagina conTexto(String textoEsperado) {
        return new ValidarTituloEnPagina(textoEsperado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Espera explícita hasta que el título esté visible (máximo 40 segundos)
        actor.attemptsTo(
                WaitUntil.the(TITULO, isVisible())
                        .forNoMoreThan(Duration.ofSeconds(40)),

                // Hace scroll por si el elemento está fuera del viewport
                Scroll.to(TITULO),

                // Valida que contenga el texto esperado
                Ensure.that(TITULO).textContent().containsIgnoringCase(textoEsperado)
        );
    }
}
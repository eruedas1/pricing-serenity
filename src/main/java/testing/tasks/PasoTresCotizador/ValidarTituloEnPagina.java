package testing.tasks.PasoTresCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.Formulario.FormularioPasoTresPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

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

        actor.attemptsTo(
                // Espera hasta que el elemento esté visible
                WaitUntil.the(FormularioPasoTresPage.TITULO, isVisible())
                        .forNoMoreThan(30).seconds(),

                // Valida el texto
                Ensure.that(FormularioPasoTresPage.TITULO).textContent()
                        .containsIgnoringCase(textoEsperado),

                // Espera adicional de 3 segundos antes de continuar
                WaitUntil.the(FormularioPasoTresPage.TITULO, isVisible())
                        .forNoMoreThan(30).seconds()
        );
    }
}
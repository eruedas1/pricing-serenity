package testing.tasks.PasoTresCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static testing.ui.Formulario.FormularioPasoTresPage.BOTON_SIGUIENTE;
import static testing.ui.Formulario.FormularioPasoTresPage.TITULO_NIVELES_ATRIBUCION;

public class ClickEnSiguienteYValidarTitulo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                // Click en el botón Siguiente
                Click.on(BOTON_SIGUIENTE),

                // Espera hasta que el nuevo título aparezca
                WaitUntil.the(TITULO_NIVELES_ATRIBUCION, isVisible())
                        .forNoMoreThan(Duration.ofSeconds(40)),

                // Scroll al título por visibilidad
                Scroll.to(TITULO_NIVELES_ATRIBUCION),

                // Validación del texto
                Ensure.that(TITULO_NIVELES_ATRIBUCION)
                        .textContent()
                        .containsIgnoringCase("Niveles de atribución - Visto bueno")
        );
    }

    public static ClickEnSiguienteYValidarTitulo validar() {
        return new ClickEnSiguienteYValidarTitulo();
    }
}

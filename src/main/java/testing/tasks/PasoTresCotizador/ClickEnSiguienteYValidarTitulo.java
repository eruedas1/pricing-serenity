package testing.tasks.PasoTresCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static testing.ui.Formulario.FormularioPasoTresPage.BOTON_SIGUIENTE;
import static testing.ui.Formulario.FormularioPasoTresPage.TITULO_NIVELES_ATRIBUCION;

public class ClickEnSiguienteYValidarTitulo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                // 1️⃣ Click en el botón Siguiente
                Click.on(BOTON_SIGUIENTE),

                // 2️⃣ Espera hasta que aparezca el título en la siguiente página
                WaitUntil.the(TITULO_NIVELES_ATRIBUCION, isVisible())
                        .forNoMoreThan(40).seconds(),

                // 3️⃣ Desplazamiento para garantizar visibilidad
                Scroll.to(TITULO_NIVELES_ATRIBUCION),

                // 4️⃣ Validación del texto
                Ensure.that(TITULO_NIVELES_ATRIBUCION)
                        .textContent()
                        .containsIgnoringCase("Niveles de atribución - Visto bueno")
        );

        // 5️⃣ Pausa manual de 30 segundos (mantiene la vista en la página)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static ClickEnSiguienteYValidarTitulo validar() {
        return new ClickEnSiguienteYValidarTitulo();
    }
}

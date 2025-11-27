package testing.tasks.PasoTresCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static testing.ui.Formulario.FormularioPasoTresPage.BOTON_GUARDAR_CONTINUAR_MODAL;

public class GuardarYContinuarModal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_GUARDAR_CONTINUAR_MODAL, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_GUARDAR_CONTINUAR_MODAL)
        );
    }

    public static GuardarYContinuarModal clickEnBoton() {
        return instrumented(GuardarYContinuarModal.class);
    }
}
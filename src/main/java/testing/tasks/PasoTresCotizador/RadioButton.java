package testing.tasks.PasoTresCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static testing.ui.Formulario.FormularioPasoTresPage.RADIOBUTTON;

public class RadioButton implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RADIOBUTTON)
        );
    }

    public static RadioButton conTextoCotizacion() {
        return instrumented(RadioButton.class);
    }
}
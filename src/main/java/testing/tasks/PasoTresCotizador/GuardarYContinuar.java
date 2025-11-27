package testing.tasks.PasoTresCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static testing.ui.Formulario.FormularioPasoTresPage.BOTON_GUARDAR_CONTINUAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static testing.ui.Formulario.FormularioPasoTresPage.*;

    public class GuardarYContinuar implements Task {

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(BOTON_GUARDAR_CONTINUAR),
                    WaitUntil.the(CAMPO_COMENTARIO, isVisible()).forNoMoreThan(10).seconds()
            );
        }

        public static GuardarYContinuar clickEnBoton() {
            return instrumented(GuardarYContinuar.class);
        }

}

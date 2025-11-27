package testing.tasks.PasoTresCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static testing.ui.Formulario.FormularioPasoTresPage.SELECT_SEMAFORO;
import static testing.ui.Formulario.FormularioPasoTresPage.SELECT_CIFIN;

public class SeleccionarSemaforoYCifin implements Task {

    private final String semaforo;
    private final String cifin;

    public SeleccionarSemaforoYCifin(String semaforo, String cifin) {
        this.semaforo = semaforo;
        this.cifin = cifin;
    }

    public static SeleccionarSemaforoYCifin conOpciones(String semaforo, String cifin) {
        return new SeleccionarSemaforoYCifin(semaforo, cifin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(semaforo).from(SELECT_SEMAFORO),
                SelectFromOptions.byVisibleText(cifin).from(SELECT_CIFIN)
        );
    }
}
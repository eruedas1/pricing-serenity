package testing.tasks.PasoTresCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static testing.ui.Formulario.FormularioPasoTresPage.SELECT_DESEMBOLSO;

public class SeleccionarDesembolso implements Task {

    private final String opcionDesembolso;

    public SeleccionarDesembolso(String opcionDesembolso) {
        this.opcionDesembolso = opcionDesembolso;
    }

    public static SeleccionarDesembolso conTexto(String opcionDesembolso) {
        return new SeleccionarDesembolso(opcionDesembolso);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(opcionDesembolso).from(SELECT_DESEMBOLSO)
        );
    }
}
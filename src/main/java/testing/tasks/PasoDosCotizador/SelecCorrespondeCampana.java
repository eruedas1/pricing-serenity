package testing.tasks.PasoDosCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import testing.ui.Formulario.FormularioPasoDosPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelecCorrespondeCampana implements Task {
    private final String correspondeCampana;

    public SelecCorrespondeCampana(String correspondeCampana) {
        this.correspondeCampana = correspondeCampana;
      }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectFromOptions.byValue(correspondeCampana).from(FormularioPasoDosPage.CORRESPONDE_CAMPANA_DROPDOWN)
        );
    }
    public static SelecCorrespondeCampana con(String correspondeCampana) {
        return instrumented(SelecCorrespondeCampana.class,correspondeCampana );
    }
}

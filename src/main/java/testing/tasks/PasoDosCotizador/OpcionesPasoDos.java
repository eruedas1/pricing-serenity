package testing.tasks.PasoDosCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import testing.ui.Formulario.FormularioPasoDosPage;



import static net.serenitybdd.screenplay.Tasks.instrumented;


public class OpcionesPasoDos implements Task {
    private final String SustiyProrroga;
    private final String tipoOperacion;
    private final String indiceReferencia;



    public OpcionesPasoDos(String SustiyProrroga, String tipoOperacion, String indiceReferencia) {
        this.SustiyProrroga = SustiyProrroga;
        this.tipoOperacion = tipoOperacion;
        this.indiceReferencia = indiceReferencia;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectFromOptions.byValue(SustiyProrroga).from(FormularioPasoDosPage.SUSTITUCION_PRORROGA_DROPDOWN),
                SelectFromOptions.byValue(tipoOperacion).from(FormularioPasoDosPage.TIPO_OPERACION_DROPDOWN),
                SelectFromOptions.byValue(indiceReferencia).from(FormularioPasoDosPage.INDICE_REFERENCIA_DROPDOWN)

        );
    }
    public static OpcionesPasoDos con(String SustiyProrroga, String tipoOperacion, String indiceReferencia) {
        return instrumented(OpcionesPasoDos.class,SustiyProrroga,tipoOperacion,indiceReferencia );
    }
}

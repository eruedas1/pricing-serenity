package testing.ui.FormularioPasoUno;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class OpcionesPasoUno implements Task {
    private final String opcion;
    private final String ratinguno;
    private final String ratingdos;
    private final String ratingtres;
    private final String ratingcuatro;


    public OpcionesPasoUno(String opcion, String ratinguno, String ratingdos, String ratingtres, String ratingcuatro) {
        this.opcion = opcion;
        this.ratinguno = ratinguno;
        this.ratingdos = ratingdos;
        this.ratingtres = ratingtres;
        this.ratingcuatro = ratingcuatro;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectFromOptions.byValue(ratinguno).from(FormularioPasoUnoPage.OBSERVADO_DROPDOWN),
                SelectFromOptions.byValue(ratingdos).from(FormularioPasoUnoPage.PROYECTADOUNO_DROPDOWN),
                SelectFromOptions.byValue(ratingtres).from(FormularioPasoUnoPage.PROYECTADODOS_DROPDOWN),
                SelectFromOptions.byValue(ratingcuatro).from(FormularioPasoUnoPage.PROYECTADOTRES_DROPDOWN),

        WaitUntil.the(FormularioPasoUnoPage.TIPO_ClIENTE, isEnabled()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText(opcion).from(FormularioPasoUnoPage.TIPO_ClIENTE)
        );
    }
    public static OpcionesPasoUno con(String opcion, String ratinguno, String ratingdos, String ratingtres, String ratingcuatro) {
        return instrumented(OpcionesPasoUno.class,opcion,ratinguno,ratingdos,ratingtres, ratingcuatro );
    }
}

package testing.tasks.FormularioPasoUno;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import testing.ui.FormularioPasoUno.FormularioPasoUnoPage;

public class SeleccionarRatingFinanciero implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byValue("1").from(FormularioPasoUnoPage.OBSERVADO_DROPDOWN),
                SelectFromOptions.byValue("2").from(FormularioPasoUnoPage.PROYECTADOUNO_DROPDOWN),
                SelectFromOptions.byValue("3").from(FormularioPasoUnoPage.PROYECTADODOS_DROPDOWN),
                SelectFromOptions.byValue("4").from(FormularioPasoUnoPage.PROYECTADOTRES_DROPDOWN)
        );
    }

    public static SeleccionarRatingFinanciero camposIndicados() {
        return new SeleccionarRatingFinanciero();
    }
}
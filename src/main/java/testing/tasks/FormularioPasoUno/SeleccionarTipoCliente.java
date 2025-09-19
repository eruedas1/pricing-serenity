package testing.tasks.FormularioPasoUno;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPasoUno.FormularioPasoUnoPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeleccionarTipoCliente implements Task {

    private final String opcion;

    public SeleccionarTipoCliente(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FormularioPasoUnoPage.TIPO_ClIENTE, isEnabled()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText(opcion).from(FormularioPasoUnoPage.TIPO_ClIENTE)
        );
    }

    public static SeleccionarTipoCliente como(String opcion) {
        return new SeleccionarTipoCliente(opcion);
    }
}

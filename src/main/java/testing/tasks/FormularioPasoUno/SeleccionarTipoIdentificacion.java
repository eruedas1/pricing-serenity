package testing.tasks.FormularioPasoUno;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPasoUno.FormularioPasoUnoNitPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeleccionarTipoIdentificacion implements Task {

    private final String tipo;

    public SeleccionarTipoIdentificacion(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FormularioPasoUnoNitPage.TIPO_IDENTIFICACION_DROPDOWN, isEnabled()).forNoMoreThan(15).seconds(),
                SelectFromOptions.byVisibleText(tipo).from(FormularioPasoUnoNitPage.TIPO_IDENTIFICACION_DROPDOWN)
        );
    }

    public static SeleccionarTipoIdentificacion como(String tipo) {
        return new SeleccionarTipoIdentificacion(tipo);
    }
}


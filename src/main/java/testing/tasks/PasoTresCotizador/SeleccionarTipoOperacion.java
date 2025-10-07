package testing.tasks.PasoTresCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.Formulario.FormularioPasoTresPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarTipoOperacion implements Task {

    private final String tipoOperacion;

    public SeleccionarTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public static SeleccionarTipoOperacion conValor(String tipoOperacion) {
        return new SeleccionarTipoOperacion(tipoOperacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                // Espera a que el dropdown esté visible
                WaitUntil.the(FormularioPasoTresPage.SELECT_TIPO_OPERACION, isVisible())
                        .forNoMoreThan(20).seconds(),

                // Selecciona la opción por texto visible
                SelectFromOptions.byVisibleText(tipoOperacion)
                        .from(FormularioPasoTresPage.SELECT_TIPO_OPERACION)


        );
    }
}

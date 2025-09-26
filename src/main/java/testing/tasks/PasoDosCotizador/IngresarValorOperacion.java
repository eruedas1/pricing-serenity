package testing.tasks.PasoDosCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.Formulario.FormularioPasoDosPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarValorOperacion implements Task {

    private final String numero;

    public IngresarValorOperacion (String numero) {
        this.numero = numero;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FormularioPasoDosPage.VALOR_OPERACION, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(numero).into(FormularioPasoDosPage.VALOR_OPERACION)
        );
    }

    public static IngresarValorOperacion con(String numero) {
        return new IngresarValorOperacion(numero);
    }
}


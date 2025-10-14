package testing.tasks.PasoDosCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import testing.ui.Formulario.FormularioPasoDosPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EscribirPasoDos implements Task {

    private final String spread;
    private final String plazoMeses;
    private final String periodoGraciaEnMeses;

    public EscribirPasoDos(String spread, String plazoMeses, String periodoGraciaEnMeses) {
        this.spread = spread;
        this.plazoMeses = plazoMeses;
        this.periodoGraciaEnMeses = periodoGraciaEnMeses;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(spread).into(FormularioPasoDosPage.SPREAD),
                Enter.theValue(plazoMeses).into(FormularioPasoDosPage.PLAZO_EN_MESES),
                Enter.theValue(periodoGraciaEnMeses).into(FormularioPasoDosPage.PERIODO_GRACIA_MESES)
                );
    }

    public static EscribirPasoDos conValores(String spread, String plazoMeses, String periodoGraciaEnMeses) {
        return new EscribirPasoDos(spread, plazoMeses, periodoGraciaEnMeses);
    }
}

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

    private EscribirPasoDos(String spread, String plazoMeses, String periodoGraciaEnMeses) {
        this.spread = spread;
        this.plazoMeses = plazoMeses;
        this.periodoGraciaEnMeses = periodoGraciaEnMeses;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (spread != null && !spread.isEmpty()) {
            actor.attemptsTo(
                    Enter.theValue(spread).into(FormularioPasoDosPage.SPREAD)
            );
        }

        if (plazoMeses != null && !plazoMeses.isEmpty()) {
            actor.attemptsTo(
                    Enter.theValue(plazoMeses).into(FormularioPasoDosPage.PLAZO_EN_MESES)
            );
        }

        if (periodoGraciaEnMeses != null && !periodoGraciaEnMeses.isEmpty()) {
            actor.attemptsTo(
                    Enter.theValue(periodoGraciaEnMeses).into(FormularioPasoDosPage.PERIODO_GRACIA_MESES)
            );
        }
    }

    // Solo spread
    public static EscribirPasoDos soloSpread(String spread) {
        return new EscribirPasoDos(spread, "", "");
    }

    // Solo plazo en meses
    public static EscribirPasoDos soloPlazo(String plazoMeses) {
        return new EscribirPasoDos("", plazoMeses, "");
    }

    // Solo periodo de gracia
    public static EscribirPasoDos soloPeriodo(String periodoGraciaEnMeses) {
        return new EscribirPasoDos("", "", periodoGraciaEnMeses);
    }

    // Los tres valores
    public static EscribirPasoDos conValores(String spread, String plazoMeses, String periodoGraciaEnMeses) {
        return new EscribirPasoDos(spread, plazoMeses, periodoGraciaEnMeses);
    }
}


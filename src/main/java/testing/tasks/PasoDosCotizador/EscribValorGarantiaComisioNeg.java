package testing.tasks.PasoDosCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import testing.ui.Formulario.FormularioPasoDosPage;

public class EscribValorGarantiaComisioNeg implements Task {

    private final String valorGarantia;
    private final String comisionesNegociadas;

    private EscribValorGarantiaComisioNeg(String valorGarantia, String comisionesNegociadas) {
        this.valorGarantia = valorGarantia;
        this.comisionesNegociadas = comisionesNegociadas;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (valorGarantia != null && !valorGarantia.isEmpty()) {
            actor.attemptsTo(
                    Enter.theValue(valorGarantia).into(FormularioPasoDosPage.VALOR_GARANTIA)
            );
        }

        if (comisionesNegociadas != null && !comisionesNegociadas.isEmpty()) {
            actor.attemptsTo(
                    Enter.theValue(comisionesNegociadas).into(FormularioPasoDosPage.COMISIONES_NEGOCIADAS)
            );
        }
    }

    // ✅ Solo valor garantía
    public static EscribValorGarantiaComisioNeg soloValorGarantia(String valorGarantia) {
        return new EscribValorGarantiaComisioNeg(valorGarantia, "");
    }

    // ✅ Solo comisiones negociadas
    public static EscribValorGarantiaComisioNeg soloComisiones(String comisionesNegociadas) {
        return new EscribValorGarantiaComisioNeg("", comisionesNegociadas);
    }

    // ✅ Ambos
    public static EscribValorGarantiaComisioNeg conValores(String valorGarantia, String comisionesNegociadas) {
        return new EscribValorGarantiaComisioNeg(valorGarantia, comisionesNegociadas);
    }
}

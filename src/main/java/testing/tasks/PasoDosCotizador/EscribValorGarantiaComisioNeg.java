package testing.tasks.PasoDosCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import testing.ui.Formulario.FormularioPasoDosPage;

public class EscribValorGarantiaComisioNeg implements Task {

    private final String valorGarantia;
    private final String comisionesNegociadas;


    public EscribValorGarantiaComisioNeg(String valorGarantia, String comisionesNegociadas) {
        this.valorGarantia = valorGarantia;
        this.comisionesNegociadas = comisionesNegociadas;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(valorGarantia).into(FormularioPasoDosPage.VALOR_GARANTIA),
                Enter.theValue(comisionesNegociadas).into(FormularioPasoDosPage.COMISIONES_NEGOCIADAS)
                );
    }

    public static EscribValorGarantiaComisioNeg conValores(String valorGarantia, String comisionesNegociadas) {
        return new EscribValorGarantiaComisioNeg(valorGarantia, comisionesNegociadas);
    }
}

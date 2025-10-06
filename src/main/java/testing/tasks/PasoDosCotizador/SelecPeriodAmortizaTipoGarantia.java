package testing.tasks.PasoDosCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import testing.ui.Formulario.FormularioPasoDosPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelecPeriodAmortizaTipoGarantia implements Task {
    private final String periodicidadPagoDeIntereses;
    private final String amortizacionDeCapital;
    private final String tipoDeGarantia;



    public SelecPeriodAmortizaTipoGarantia(String periodicidadPagoDeIntereses, String amortizacionDeCapital, String tipoDeGarantia) {
        this.periodicidadPagoDeIntereses = periodicidadPagoDeIntereses;
        this.amortizacionDeCapital = amortizacionDeCapital;
        this.tipoDeGarantia = tipoDeGarantia;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectFromOptions.byValue(periodicidadPagoDeIntereses).from(FormularioPasoDosPage.PERIODICIDAD_INTERES_DROPDOWN),
                SelectFromOptions.byValue(amortizacionDeCapital).from(FormularioPasoDosPage.AMORTIZACION_CAPITAL_DROPDOWN),
                SelectFromOptions.byValue(tipoDeGarantia).from(FormularioPasoDosPage.TIPO_GARANTIA_DROPDOWN)

        );
    }
    public static SelecPeriodAmortizaTipoGarantia con(String periodicidadPagoDeIntereses, String amortizacionDeCapital, String tipoDeGarantia) {
        return instrumented(SelecPeriodAmortizaTipoGarantia.class,periodicidadPagoDeIntereses,amortizacionDeCapital,tipoDeGarantia );
    }
}

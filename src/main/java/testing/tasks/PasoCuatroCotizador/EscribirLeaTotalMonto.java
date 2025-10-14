package testing.tasks.PasoCuatroCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import testing.ui.Formulario.FormularioPasoCuatroPage;

public class EscribirLeaTotalMonto implements Task {

    private final String LEA;
    private final String TotalUtilizado;
    private final String MontoAprobado;

    public EscribirLeaTotalMonto(String LEA, String TotalUtilizado, String MontoAprobado) {
        this.LEA = LEA;
        this.TotalUtilizado = TotalUtilizado;
        this.MontoAprobado = MontoAprobado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(LEA).into(FormularioPasoCuatroPage.LEA),
                Enter.theValue(TotalUtilizado).into(FormularioPasoCuatroPage.TOTAL_UTILIZADO),
                Enter.theValue(MontoAprobado).into(FormularioPasoCuatroPage.MONTO_APROBADO)
        );
    }

    public static EscribirLeaTotalMonto conValores(String LEA, String TotalUtilizado, String MontoAprobado) {
        return new EscribirLeaTotalMonto(LEA, TotalUtilizado, MontoAprobado);
    }
}

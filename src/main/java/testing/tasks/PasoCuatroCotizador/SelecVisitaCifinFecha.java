package testing.tasks.PasoCuatroCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import testing.ui.Formulario.FormularioPasoCuatroPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelecVisitaCifinFecha implements Task {
    private final String RealizoVisitaComercial;
    private final String RevisoCifin;
    private final String FechadeCorte;


    public SelecVisitaCifinFecha(String RealizoVisitaComercial, String RevisoCifin, String FechadeCorte) {
        this.RealizoVisitaComercial = RealizoVisitaComercial;
        this.RevisoCifin = RevisoCifin;
        this.FechadeCorte = FechadeCorte;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectFromOptions.byValue(RealizoVisitaComercial).from(FormularioPasoCuatroPage.SELECT_REALIZO_VISITA),
                SelectFromOptions.byValue(RevisoCifin).from(FormularioPasoCuatroPage.SELECT_REVISO_CIFIN),
                Click.on(FormularioPasoCuatroPage.SELECT_FECHA_CORTE),
                Enter.theValue(FechadeCorte).into(FormularioPasoCuatroPage.SELECT_FECHA_CORTE)
        );
    }

    public static SelecVisitaCifinFecha con(String RealizoVisitaComercial, String RevisoCifin, String FechadeCorte) {
        return instrumented(SelecVisitaCifinFecha.class, RealizoVisitaComercial, RevisoCifin, FechadeCorte);
    }
}

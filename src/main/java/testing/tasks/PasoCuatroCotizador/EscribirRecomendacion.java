package testing.tasks.PasoCuatroCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static testing.ui.Formulario.FormularioPasoCuatroPage.CAMPO_RECOMENDACION;


public class EscribirRecomendacion implements Task {

    private final String Recomendacion;

    public EscribirRecomendacion (String Recomendacion) {
        this.Recomendacion = Recomendacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Recomendacion).into(CAMPO_RECOMENDACION)
        );
    }

    public static EscribirRecomendacion opcional(String Recomendacion) {
        return instrumented(EscribirRecomendacion.class, Recomendacion);
    }
}
package testing.tasks.PasoTresCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static testing.ui.Formulario.FormularioPasoTresPage.CAMPO_COMENTARIO;

public class EscribirComentario implements Task {

    private final String comentario;

    public EscribirComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(comentario).into(CAMPO_COMENTARIO)
        );
    }

    public static EscribirComentario opcional(String comentario) {
        return instrumented(EscribirComentario.class, comentario);
    }
}
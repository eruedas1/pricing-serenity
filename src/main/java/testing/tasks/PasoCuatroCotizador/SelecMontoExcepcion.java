package testing.tasks.PasoCuatroCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import testing.ui.Formulario.FormularioPasoCuatroPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelecMontoExcepcion implements Task {
    private final String Monto;
    private final String Exepcion;


    public SelecMontoExcepcion(String Monto, String Exepcion) {
        this.Monto = Monto;
        this.Exepcion = Exepcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectFromOptions.byValue(Monto).from(FormularioPasoCuatroPage.SELECT_MONTO),
                SelectFromOptions.byValue(Exepcion).from(FormularioPasoCuatroPage.SELECT_EXCEPCION)
                );
    }

    public static SelecMontoExcepcion con(String Monto, String Exepcion) {
        return instrumented(SelecMontoExcepcion.class, Monto, Exepcion);
    }
}

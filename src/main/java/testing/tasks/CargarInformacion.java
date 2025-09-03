package testing.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.CargarInformacionPage;

public class CargarInformacion implements Task {
    private final int segundos;

    public CargarInformacion(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                // Esperar que el botón sea clickeable
                WaitUntil.the(CargarInformacionPage.BOTON_CARGAR_INFORMACION_VISIBLE,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),

                // Hacer clic
                Click.on(CargarInformacionPage.BOTON_CARGAR_INFORMACION_VISIBLE),

                // Esperar hasta que el campo con info esté visible (máx 40s)
                WaitUntil.the(CargarInformacionPage.CAMPO_CON_INFORMACION,
                        WebElementStateMatchers.isVisible()).forNoMoreThan(40).seconds()
        );
    }


    public static CargarInformacion unosSegundos(int segundos) {
        return new CargarInformacion(segundos);
    }
}


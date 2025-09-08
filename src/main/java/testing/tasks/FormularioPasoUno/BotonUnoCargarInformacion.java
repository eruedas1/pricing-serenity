package testing.tasks.FormularioPasoUno;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPasoUno.BotonUnoCargarInformacionPage;

public class BotonUnoCargarInformacion implements Task {
   // private final int segundos;

   // public CargarInformacion(int segundos) {
      //  this.segundos = segundos;
   // }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                // Esperar que el botón sea clickeable
                WaitUntil.the(BotonUnoCargarInformacionPage.BOTON_CARGAR_INFORMACION_VISIBLE,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),

                // Hacer click
                Click.on(BotonUnoCargarInformacionPage.BOTON_CARGAR_INFORMACION_VISIBLE),

                // Esperar hasta que el campo con info esté visible (máx 40s)
                WaitUntil.the(BotonUnoCargarInformacionPage.BOTON_CARGAR_INFORMACION_VISIBLE,
                        WebElementStateMatchers.isVisible()).forNoMoreThan(40).seconds()
        );
    }

    public static BotonUnoCargarInformacion unosSegundos() {
        return new BotonUnoCargarInformacion();
    }
}

package testing.tasks.PasoCuatroCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.Formulario.FormularioPasoCuatroPage;
import testing.utils.Espera;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

    public class BtnContinuarCorreos implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(

                    WaitUntil.the(FormularioPasoCuatroPage.BOTON_CONTINUAR_CORREOS, isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(FormularioPasoCuatroPage.BOTON_CONTINUAR_CORREOS),
                    Espera.unosSegundos(15)

            );
        }

        public static testing.tasks.PasoCuatroCotizador.BtnContinuarCorreos ejecutar() {
            return new testing.tasks.PasoCuatroCotizador.BtnContinuarCorreos();
        }
    }



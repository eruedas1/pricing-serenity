package testing.tasks.PasoCuatroCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.Formulario.FormularioPasoCuatroPage;
import testing.utils.Espera;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class BtnSiguiente implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // clic en siguiente”
                Scroll.to(FormularioPasoCuatroPage.BOTON_SIGUIENTE),
                WaitUntil.the(FormularioPasoCuatroPage.BOTON_SIGUIENTE, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(FormularioPasoCuatroPage.BOTON_SIGUIENTE),
                Espera.unosSegundos(50)

        );
    }

    public static BtnSiguiente ejecutar() {
        return new BtnSiguiente();
    }
}

package testing.tasks.PasoDosCotizador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.Formulario.FormularioPasoDosPage;
import testing.utils.Espera;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class BtnContinuarDos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // primer clic “Continuar”
                Scroll.to(FormularioPasoDosPage.BOTON_CONTINUAR_PASO2),
                WaitUntil.the(FormularioPasoDosPage.BOTON_CONTINUAR_PASO2, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(FormularioPasoDosPage.BOTON_CONTINUAR_PASO2),
                Espera.unosSegundos(15),

                // luego clic “Finalizado”
                Scroll.to(FormularioPasoDosPage.BOTON_FINALIZADO),
                WaitUntil.the(FormularioPasoDosPage.BOTON_FINALIZADO, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(FormularioPasoDosPage.BOTON_FINALIZADO),
                Espera.unosSegundos(15)
        );
    }

    public static BtnContinuarDos ejecutar() {
        return new BtnContinuarDos();
    }
}

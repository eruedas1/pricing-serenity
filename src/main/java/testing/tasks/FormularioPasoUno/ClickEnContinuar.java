package testing.tasks.FormularioPasoUno;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPasoUno.FormularioPasoUnoPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ClickEnContinuar implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FormularioPasoUnoPage.BOTON_CONTINUAR),
                WaitUntil.the(FormularioPasoUnoPage.BOTON_CONTINUAR, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(FormularioPasoUnoPage.BOTON_CONTINUAR)


        );
    }

    public static ClickEnContinuar enPasoUno() {
        return new ClickEnContinuar();
    }
}


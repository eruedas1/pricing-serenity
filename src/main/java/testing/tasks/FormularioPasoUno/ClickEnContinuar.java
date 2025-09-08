package testing.tasks.FormularioPasoUno;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPasoUno.FormularioPasoDosPage;
import testing.ui.FormularioPasoUno.FormularioPasoUnoNitPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickEnContinuar implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FormularioPasoUnoNitPage.BOTON_CONTINUAR),
                WaitUntil.the(FormularioPasoUnoNitPage.BOTON_CONTINUAR, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(FormularioPasoUnoNitPage.BOTON_CONTINUAR)


        );
    }

    public static ClickEnContinuar enPasoUno() {
        return new ClickEnContinuar();
    }
}


package testing.tasks.FormularioPasoUno;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPasoUno.FormularioPasoUnoPage;

import static java.lang.Thread.sleep;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FormularioPasoUno implements Task {
    private final String tipo;


    public FormularioPasoUno(String tipo) {
        this.tipo = tipo;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // Paso 1: Esperar formulario
                WaitUntil.the(FormularioPasoUnoPage.FORMULARIO, isVisible()).forNoMoreThan(10).seconds()
        );
    }

}









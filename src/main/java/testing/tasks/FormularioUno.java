package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPage;
import testing.ui.LoginPage;
import testing.ui.PricingPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FormularioUno implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FormularioPage.FORMULARIO, isVisible()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText("Nit").from(FormularioPage.TIPO_IDENTIFICACION_DROPDOWN),
                Click.on(FormularioPage.TIPO_IDENTIFICACION_DROPDOWN),//Seleccionar la opcion tipo de identificacion
                SelectFromOptions.byVisibleText("No").from(FormularioPage.TIPO_ClIENTE),
                Click.on(FormularioPage.TIPO_ClIENTE)//Seleccionar la opcion tipo de cliente

        );
    }
    public static FormularioUno click() {
        return new FormularioUno();
    }



}

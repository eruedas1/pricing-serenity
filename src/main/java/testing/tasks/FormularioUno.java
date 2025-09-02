package testing.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPage;
import testing.ui.LoginPage;
import testing.ui.PricingPage;
import static java.lang.Thread.sleep;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FormularioUno implements Task {

    private final String numeroIdentificacion;

    public FormularioUno(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        // Paso 1: Esperar que el formulario esté visible
        actor.attemptsTo(
                WaitUntil.the(FormularioPage.FORMULARIO, isVisible()).forNoMoreThan(10).seconds()
        );

        // Paso 2: Esperar y seleccionar tipo de identificación
        actor.attemptsTo(
                WaitUntil.the(FormularioPage.TIPO_IDENTIFICACION_DROPDOWN, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(FormularioPage.TIPO_IDENTIFICACION_DROPDOWN, isEnabled()).forNoMoreThan(50).seconds(),
                SelectFromOptions.byVisibleText("Nit").from(FormularioPage.TIPO_IDENTIFICACION_DROPDOWN)
        );

        // Paso 3: Escribir lentamente el número de identificación
        WebElementFacade input = FormularioPage.NUMERO_IDENTIFICACION_INPUT.resolveFor(actor);
        input.clear();

        try {
            for (char c : numeroIdentificacion.toCharArray()) {
                input.sendKeys(String.valueOf(c));
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Paso 4: Esperar y seleccionar tipo de cliente
        actor.attemptsTo(
                WaitUntil.the(FormularioPage.TIPO_ClIENTE, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(FormularioPage.TIPO_ClIENTE, isEnabled()).forNoMoreThan(50).seconds(),
                SelectFromOptions.byVisibleText("No").from(FormularioPage.TIPO_ClIENTE)

        );
    }

    // Método estático para crear la tarea con parámetro
    public static FormularioUno conNumeroIdentificacion(String numero) {
        return new FormularioUno(numero);
    }

    // Método opcional si quieres usarlo sin escribir número aún
    public static FormularioUno click() {
        return new FormularioUno(""); // vacío o puedes lanzar excepción si es requerido
    }
}





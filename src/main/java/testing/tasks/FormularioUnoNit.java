package testing.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPage;
import testing.ui.PricingPage;

import static java.lang.Thread.sleep;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FormularioUnoNit implements Task {

    private final String numeroIdentificacion;

    public FormularioUnoNit(String numeroIdentificacion) {
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

        actor.attemptsTo(
                WaitUntil.the(FormularioPage.OBSERVADO_DROPDOWN, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(FormularioPage.OBSERVADO_DROPDOWN, isEnabled()).forNoMoreThan(50).seconds(),
                SelectFromOptions.byValue("1").from(FormularioPage.OBSERVADO_DROPDOWN),
                WaitUntil.the(FormularioPage.PROYECTADOUNO_DROPDOWN, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(FormularioPage.PROYECTADOUNO_DROPDOWN, isEnabled()).forNoMoreThan(50).seconds(),
                SelectFromOptions.byValue("2").from(FormularioPage.PROYECTADOUNO_DROPDOWN),
                WaitUntil.the(FormularioPage.PROYECTADODOS_DROPDOWN, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(FormularioPage.PROYECTADODOS_DROPDOWN, isEnabled()).forNoMoreThan(50).seconds(),
                SelectFromOptions.byValue("3").from(FormularioPage.PROYECTADODOS_DROPDOWN),
                WaitUntil.the(FormularioPage.PROYECTADOTRES_DROPDOWN, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(FormularioPage.PROYECTADOTRES_DROPDOWN, isEnabled()).forNoMoreThan(50).seconds(),
                SelectFromOptions.byValue("4").from(FormularioPage.PROYECTADOTRES_DROPDOWN)


        );

    }

    // Método estático para crear la tarea con parámetro
    public static FormularioUnoNit conNumeroIdentificacion(String numero) {
        return new FormularioUnoNit(numero);
    }

    // Método opcional si quieres usarlo sin escribir número aún
    public static FormularioUnoNit click() {
        return new FormularioUnoNit(""); // vacío o puedes lanzar excepción si es requerido
    }
}





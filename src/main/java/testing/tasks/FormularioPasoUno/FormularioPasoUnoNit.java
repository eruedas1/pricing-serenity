package testing.tasks.FormularioPasoUno;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPasoUno.FormularioPasoUnoNitPage;

import static java.lang.Thread.sleep;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FormularioPasoUnoNit implements Task {

    private final String numeroIdentificacion;

    public FormularioPasoUnoNit(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // Paso 1: Esperar formulario
                WaitUntil.the(FormularioPasoUnoNitPage.FORMULARIO, isVisible()).forNoMoreThan(10).seconds(),

                // Paso 2: Seleccionar tipo de identificación
                WaitUntil.the(FormularioPasoUnoNitPage.TIPO_IDENTIFICACION_DROPDOWN, isEnabled()).forNoMoreThan(15).seconds(),
                SelectFromOptions.byVisibleText("Nit").from(FormularioPasoUnoNitPage.TIPO_IDENTIFICACION_DROPDOWN),

                // Paso 3: Ingresar número de identificación
                WaitUntil.the(FormularioPasoUnoNitPage.NUMERO_IDENTIFICACION_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(numeroIdentificacion).into(FormularioPasoUnoNitPage.NUMERO_IDENTIFICACION_INPUT),

                // Paso 4: Seleccionar opciones en dropdowns
                SelectFromOptions.byVisibleText("No").from(FormularioPasoUnoNitPage.TIPO_ClIENTE),
                SelectFromOptions.byValue("1").from(FormularioPasoUnoNitPage.OBSERVADO_DROPDOWN),
                SelectFromOptions.byValue("2").from(FormularioPasoUnoNitPage.PROYECTADOUNO_DROPDOWN),
                SelectFromOptions.byValue("3").from(FormularioPasoUnoNitPage.PROYECTADODOS_DROPDOWN),
                SelectFromOptions.byValue("4").from(FormularioPasoUnoNitPage.PROYECTADOTRES_DROPDOWN),

                // Paso 5: Botón Continuar
                Scroll.to(FormularioPasoUnoNitPage.BOTONCONTINUAR1),
                WaitUntil.the(FormularioPasoUnoNitPage.BOTONCONTINUAR1, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(FormularioPasoUnoNitPage.BOTONCONTINUAR1)
        );
    }

    public static FormularioPasoUnoNit conNumeroIdentificacion(String numero) {
        return new FormularioPasoUnoNit(numero);
    }
}









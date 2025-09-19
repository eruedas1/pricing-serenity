package testing.tasks.FormularioPasoUno;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPasoUno.FormularioPasoUnoPage;

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
                WaitUntil.the(FormularioPasoUnoPage.FORMULARIO, isVisible()).forNoMoreThan(10).seconds(),

                // Paso 2: Seleccionar tipo de identificación
                WaitUntil.the(FormularioPasoUnoPage.TIPO_IDENTIFICACION_DROPDOWN, isEnabled()).forNoMoreThan(15).seconds(),
                SelectFromOptions.byVisibleText("Nit").from(FormularioPasoUnoPage.TIPO_IDENTIFICACION_DROPDOWN),

                // Paso 3: Ingresar número de identificación
                WaitUntil.the(FormularioPasoUnoPage.NUMERO_IDENTIFICACION_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(numeroIdentificacion).into(FormularioPasoUnoPage.NUMERO_IDENTIFICACION_INPUT),

                // Paso 4: Seleccionar opciones en dropdowns
                SelectFromOptions.byVisibleText("No").from(FormularioPasoUnoPage.TIPO_ClIENTE),
                SelectFromOptions.byValue("1").from(FormularioPasoUnoPage.OBSERVADO_DROPDOWN),
                SelectFromOptions.byValue("2").from(FormularioPasoUnoPage.PROYECTADOUNO_DROPDOWN),
                SelectFromOptions.byValue("3").from(FormularioPasoUnoPage.PROYECTADODOS_DROPDOWN),
                SelectFromOptions.byValue("4").from(FormularioPasoUnoPage.PROYECTADOTRES_DROPDOWN)


        );
    }

    public static FormularioPasoUnoNit conNumeroIdentificacion(String numero) {
        return new FormularioPasoUnoNit(numero);
    }
}









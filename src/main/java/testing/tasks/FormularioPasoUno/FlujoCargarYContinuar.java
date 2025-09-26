package testing.tasks.FormularioPasoUno;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.Formulario.BotonUnoCargarInformacionPage;
import testing.ui.Formulario.FormularioPasoUnoPage;
import testing.utils.Espera;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FlujoCargarYContinuar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // Paso 1: Click en Cargar Información
                WaitUntil.the(BotonUnoCargarInformacionPage.BOTON_CARGAR_INFORMACION_VISIBLE, isClickable())
                        .forNoMoreThan(60).seconds(),
                Click.on(BotonUnoCargarInformacionPage.BOTON_CARGAR_INFORMACION_VISIBLE),

                // Paso 2: Validar que los campos aparecen
                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_NOMBRE_CLIENTE, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_NOMBRE_CLIENTE).isDisplayed(),

                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_SEGMENTO_COMERCIAL, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_SEGMENTO_COMERCIAL).isDisplayed(),

                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_EPC, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_EPC).isDisplayed(),

                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_ACTIVOS_PROMEDIO, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_ACTIVOS_PROMEDIO).isDisplayed(),

                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_PASIVOS_PROMEDIO, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_PASIVOS_PROMEDIO).isDisplayed(),

                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_MARGEN_CONTRIBUCION, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_MARGEN_CONTRIBUCION).isDisplayed(),

                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_ROA, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_ROA).isDisplayed(),

                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_ACTIVOS_TOTALES, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_ACTIVOS_TOTALES).isDisplayed(),

                Espera.unosSegundos(15), // espera de seguridad

                // Paso 3: Click en Continuar
                Scroll.to(FormularioPasoUnoPage.BOTON_CONTINUAR),
                WaitUntil.the(FormularioPasoUnoPage.BOTON_CONTINUAR, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(FormularioPasoUnoPage.BOTON_CONTINUAR)
        );
    }

    public static FlujoCargarYContinuar ejecutar() {
        return new FlujoCargarYContinuar();
    }
}
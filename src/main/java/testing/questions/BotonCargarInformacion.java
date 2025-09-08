package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPasoUno.BotonUnoCargarInformacionPage;
import testing.utils.Espera;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BotonCargarInformacion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(

                // Nombre Cliente
                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_NOMBRE_CLIENTE, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_NOMBRE_CLIENTE).isDisplayed(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_NOMBRE_CLIENTE).text().contains("Nombre Cliente"),

                // Segmento Comercial
                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_SEGMENTO_COMERCIAL, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_SEGMENTO_COMERCIAL).isDisplayed(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_SEGMENTO_COMERCIAL).text().contains("Segmento comercial"),

                // EPC
                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_EPC, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_EPC).isDisplayed(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_EPC).text().contains("Clasificación comercial EPC"),

                // Activos promedio
                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_ACTIVOS_PROMEDIO, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_ACTIVOS_PROMEDIO).isDisplayed(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_ACTIVOS_PROMEDIO).text().contains("Activos promedio"),

                // Pasivos promedio
                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_PASIVOS_PROMEDIO, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_PASIVOS_PROMEDIO).isDisplayed(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_PASIVOS_PROMEDIO).text().contains("Pasivos promedio"),

                // Margen de Contribución
                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_MARGEN_CONTRIBUCION, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_MARGEN_CONTRIBUCION).isDisplayed(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_MARGEN_CONTRIBUCION).text().contains("Margen de Contribución"),

                // ROA
                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_ROA, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_ROA).isDisplayed(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_ROA).text().contains("ROA"),

                // Activos Totales
                WaitUntil.the(BotonUnoCargarInformacionPage.CAMPO_ACTIVOS_TOTALES, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_ACTIVOS_TOTALES).isDisplayed(),
                Ensure.that(BotonUnoCargarInformacionPage.CAMPO_ACTIVOS_TOTALES).text().contains("Activos totales"),

                // ... todas tus validaciones ...
                Espera.unosSegundos(10) // espera 30 segundos extra
        );
        return true;
    }

    public static BotonCargarInformacion camposExitosos() {
        return new BotonCargarInformacion();
    }
}

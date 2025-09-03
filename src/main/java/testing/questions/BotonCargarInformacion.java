package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.tasks.CargarInformacion;
import testing.ui.CargarInformacionPage;
import testing.ui.FormularioPage;
import testing.utils.Espera;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BotonCargarInformacion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(

                // Nombre Cliente
                WaitUntil.the(CargarInformacionPage.CAMPO_NOMBRE_CLIENTE, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(CargarInformacionPage.CAMPO_NOMBRE_CLIENTE).isDisplayed(),
                Ensure.that(CargarInformacionPage.CAMPO_NOMBRE_CLIENTE).text().contains("Nombre Cliente"),

                // Segmento Comercial
                WaitUntil.the(CargarInformacionPage.CAMPO_SEGMENTO_COMERCIAL, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(CargarInformacionPage.CAMPO_SEGMENTO_COMERCIAL).isDisplayed(),
                Ensure.that(CargarInformacionPage.CAMPO_SEGMENTO_COMERCIAL).text().contains("Segmento comercial"),

                // EPC
                WaitUntil.the(CargarInformacionPage.CAMPO_EPC, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(CargarInformacionPage.CAMPO_EPC).isDisplayed(),
                Ensure.that(CargarInformacionPage.CAMPO_EPC).text().contains("Clasificación comercial EPC"),

                // Activos promedio
                WaitUntil.the(CargarInformacionPage.CAMPO_ACTIVOS_PROMEDIO, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(CargarInformacionPage.CAMPO_ACTIVOS_PROMEDIO).isDisplayed(),
                Ensure.that(CargarInformacionPage.CAMPO_ACTIVOS_PROMEDIO).text().contains("Activos promedio"),

                // Pasivos promedio
                WaitUntil.the(CargarInformacionPage.CAMPO_PASIVOS_PROMEDIO, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(CargarInformacionPage.CAMPO_PASIVOS_PROMEDIO).isDisplayed(),
                Ensure.that(CargarInformacionPage.CAMPO_PASIVOS_PROMEDIO).text().contains("Pasivos promedio"),

                // Margen de Contribución
                WaitUntil.the(CargarInformacionPage.CAMPO_MARGEN_CONTRIBUCION, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(CargarInformacionPage.CAMPO_MARGEN_CONTRIBUCION).isDisplayed(),
                Ensure.that(CargarInformacionPage.CAMPO_MARGEN_CONTRIBUCION).text().contains("Margen de Contribución"),

                // ROA
                WaitUntil.the(CargarInformacionPage.CAMPO_ROA, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(CargarInformacionPage.CAMPO_ROA).isDisplayed(),
                Ensure.that(CargarInformacionPage.CAMPO_ROA).text().contains("ROA"),

                // Activos Totales
                WaitUntil.the(CargarInformacionPage.CAMPO_ACTIVOS_TOTALES, isVisible()).forNoMoreThan(180).seconds(),
                Ensure.that(CargarInformacionPage.CAMPO_ACTIVOS_TOTALES).isDisplayed(),
                Ensure.that(CargarInformacionPage.CAMPO_ACTIVOS_TOTALES).text().contains("Activos totales"),

                // ... todas tus validaciones ...
                Espera.unosSegundos(30) // espera 30 segundos extra
        );
        return true;
    }

    public static BotonCargarInformacion camposExitosos() {
        return new BotonCargarInformacion();
    }
}

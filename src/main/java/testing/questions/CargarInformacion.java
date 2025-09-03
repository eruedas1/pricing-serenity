package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.CargarInformacionPage;
import testing.ui.FormularioPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CargarInformacion {
    public class CargarInformacion implements Question<Boolean> {
        @Override
        public Boolean answeredBy(Actor actor) {
            actor.attemptsTo(
                    WaitUntil.the(CargarInformacionPage.CAMPO_NOMBRE_CLIENTE, isVisible()).forNoMoreThan(180).seconds() ,//Tiempo de espera para cargar la infromcion del cliente
                    Ensure.that(CargarInformacionPage.CAMPO_NOMBRE_CLIENTE).isDisplayed(),
                    Ensure.that(CargarInformacionPage.CAMPO_NOMBRE_CLIENTE).text().contains("FromularioUnoNit")

            );
            return true;
        }

        public static testing.questions.CargarInformacion loginExitoso() {
            return new testing.questions.CargarInformacion();
        }
    }
}

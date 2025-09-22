package testing.tasks.FormularioPasoUno;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.FormularioPasoUno.FormularioPasoUnoPage;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarNumeroIdentificacion implements Task {

        private final String numero;

        public IngresarNumeroIdentificacion(String numero) {
            this.numero = numero;
        }

<<<<<<< HEAD
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(FormularioPasoUnoPage.NUMERO_IDENTIFICACION_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                    Enter.theValue(numero).into(FormularioPasoUnoPage.NUMERO_IDENTIFICACION_INPUT)
            );
        }

        public static IngresarNumeroIdentificacion con(String numero) {
            return new IngresarNumeroIdentificacion(numero);
        }
=======
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FormularioPasoUnoNitPage.NUMERO_IDENTIFICACION_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(numero).into(FormularioPasoUnoNitPage.NUMERO_IDENTIFICACION_INPUT)
        );
>>>>>>> origin/main
    }

    public static IngresarNumeroIdentificacion con(String numero) {
        return new IngresarNumeroIdentificacion(numero);
    }
}


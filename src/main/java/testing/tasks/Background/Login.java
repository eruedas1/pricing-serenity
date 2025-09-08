package testing.tasks.Background;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.Background.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.INICIO_FAAN),
                WaitUntil.the(LoginPage.INPUT_CORREO, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(this.username).into(LoginPage.INPUT_CORREO),
                Click.on(LoginPage.BOTON_SIGUIENTE),
                WaitUntil.the(LoginPage.INPUT_PASSWORD, isVisible()).forNoMoreThan(10).seconds()
        );
        if (this.password != null && !this.password.isEmpty()) {
            actor.attemptsTo(
                    Enter.theValue(this.password).into(LoginPage.INPUT_PASSWORD)
            );
        }
        actor.attemptsTo(
                Click.on(LoginPage.INICIO_SESION),
                Click.on(LoginPage.BOTON_NO)
        );
    }

    public static Login conCredenciales(String username, String password) {
        return instrumented(Login.class, username, password);
    }
}
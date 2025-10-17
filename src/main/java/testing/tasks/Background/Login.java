package testing.tasks.Background;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
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

        System.out.println("Probando usuario: " + this.username);

        actor.attemptsTo(
                Click.on(LoginPage.INICIO_FAAN),
                WaitUntil.the(LoginPage.INPUT_CORREO, isVisible()).forNoMoreThan(15).seconds()
        );

        // ✅ Validar correo vacío
        if (this.username == null || this.username.trim().isEmpty()) {
            System.out.println("⚠️ Correo vacío o nulo, se detiene el flujo de login.");
            return;
        }

        actor.attemptsTo(
                Enter.theValue(this.username).into(LoginPage.INPUT_CORREO),
                Click.on(LoginPage.BOTON_SIGUIENTE)
        );

        // 🕐 Esperar a que cargue algo (mensaje o campo de contraseña)
        Serenity.takeScreenshot();

        // ✅ Validar si aparece el campo de contraseña
        if (LoginPage.INPUT_PASSWORD.resolveAllFor(actor).size() == 0) {
            System.out.println("⚠️ No se encontró el campo de contraseña. El correo probablemente es inválido.");
            return;
        }

        actor.attemptsTo(
                WaitUntil.the(LoginPage.INPUT_PASSWORD, isVisible()).forNoMoreThan(10).seconds()
        );

        // ✅ Validar contraseña vacía
        if (this.password == null || this.password.trim().isEmpty()) {
            System.out.println("⚠️ Contraseña vacía o nula, se detiene el flujo de login.");
            return;
        }

        actor.attemptsTo(
                Enter.theValue(this.password).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.INICIO_SESION)
        );

        // ✅ Verificar si aparece el botón "No" (solo en logins válidos)
        if (LoginPage.BOTON_NO.resolveAllFor(actor).size() > 0) {
            actor.attemptsTo(
                    WaitUntil.the(LoginPage.BOTON_NO, isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(LoginPage.BOTON_NO)
            );
        }

        Serenity.takeScreenshot();
    }

    public static Login conCredenciales(String username, String password) {
        return instrumented(Login.class, username, password);
    }
}
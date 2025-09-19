package testing.ui.Background;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    private LoginPage() { }
    public static final Target LOGIN_BIENVENIDA = Target.the("Mensaje de bienvenida en Pricing")
            .locatedBy("//h1[contains(text(), 'Bienvenido')]");
    public static final Target INICIO_FAAN = Target.the("Boton login")
            .locatedBy("//button[normalize-space()='Inicia sesión']");
    public static final Target INPUT_CORREO = Target.the("Boton login")
            .locatedBy(("//input[@class='form-control ltr_override input ext-input text-box ext-text-box']"));
    public static final Target BOTON_SIGUIENTE = Target.the("Boton login")
            .located(By.id("idSIButton9"));
    public static final Target INPUT_PASSWORD = Target.the("Boton login")
            .located(By.name("passwd"));
    public static final Target INICIO_SESION = Target.the("Boton login")
            .locatedBy("//input[@id='idSIButton9']");
    public static final Target BOTON_NO = Target.the("Boton login")
            .locatedBy("//input[@id='idBtn_Back']");
    public static final Target ERROR_MESSAGE = Target.the("Mensaje de error").locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
    public static final Target MISSING_USERNAME = Target.the("Mensaje de error por usuario faltante").locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
    public static final Target MISSING_PASSWORD = Target.the("Mensaje de error por contraseña faltante").locatedBy("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");
}
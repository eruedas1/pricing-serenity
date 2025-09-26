package testing.ui.Formulario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPasoDosPage {

    public static final Target TITULO_PASO_DOS = Target.the("PASO 2 DE 4")
            .located(By.xpath("//label[contains(normalize-space(),'PASO 2 DE 4')]"));
    public static final Target VALOR_OPERACION = Target.the("Campo valor operacion")
            .locatedBy("//input[@id='valorOperacion'][1]"); //locator del valor operacion

}
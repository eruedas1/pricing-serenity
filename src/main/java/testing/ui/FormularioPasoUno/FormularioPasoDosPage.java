package testing.ui.FormularioPasoUno;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPasoDosPage {
    public static final Target TITULO_PASO_DOS = Target.the("PASO 2 DE 4")
            .located(By.xpath("//label[contains(normalize-space(),'PASO 2 DE 4')]"));

}
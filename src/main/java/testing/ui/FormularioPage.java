package testing.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioPage {
    public static final Target FORMULARIO = Target.the("Formulario de cotizador")
            .locatedBy("div[class='pr-title'] p"); // Cambia el locator si es diferente


    private FormularioPage() {
    }
}

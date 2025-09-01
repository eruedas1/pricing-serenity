package testing.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioPage {
    public static final Target FORMULARIO = Target.the("Formulario de cotizador")
            .locatedBy("div.pr-title p"); // Cambia el locator si es diferente

    public static final Target TIPO_IDENTIFICACION_DROPDOWN = Target.the("Dropdown de tipo de identificación")
            .locatedBy("#tipoIdentificacionCliente"); //localizar elemento tipo de identificacion


    private FormularioPage() {
    }
}

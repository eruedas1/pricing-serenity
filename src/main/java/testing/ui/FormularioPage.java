package testing.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioPage {
    public static final Target FORMULARIO = Target.the("Formulario de cotizador")
            .locatedBy("div.pr-title p"); // Cambia el locator si es diferente

    public static final Target TIPO_IDENTIFICACION_DROPDOWN = Target.the("Dropdown de tipo de identificación")
            .locatedBy("#tipoIdentificacionCliente"); //localizar elemento tipo de identificacion

    public static final Target NUMERO_IDENTIFICACION_INPUT = Target.the("Campo de número de identificación")
            .locatedBy("#identificacionCliente"); //locator del numero de indentificacion

    public static final Target TIPO_ClIENTE = Target.the("Dropdown de tipo de cliente")
            .locatedBy("#tipoClienteEspecial"); //localizar elemento tipo de cliente especial o codeudor


    private FormularioPage() {
    }
}

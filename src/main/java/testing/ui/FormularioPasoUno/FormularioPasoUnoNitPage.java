package testing.ui.FormularioPasoUno;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPasoUnoNitPage {
    public static final Target FORMULARIO = Target.the("Formulario de cotizador")
            .locatedBy("div.pr-title p"); // Cambia el locator si es diferente

    public static final Target TIPO_IDENTIFICACION_DROPDOWN = Target.the("Dropdown de tipo de identificación")
            .locatedBy("#tipoIdentificacionCliente"); //localizar elemento tipo de identificacion

    public static final Target NUMERO_IDENTIFICACION_INPUT = Target.the("Campo de número de identificación")
            .locatedBy("#identificacionCliente"); //locator del numero de indentificacion

    public static final Target TIPO_ClIENTE = Target.the("Dropdown de tipo de cliente")
            .locatedBy("#tipoClienteEspecial"); //localizar elemento tipo de cliente especial o codeudor

    public static final Target OBSERVADO_DROPDOWN = Target.the("Dropdown de Observado")
            .locatedBy("//select[@formcontrolname='ratingClienteObs1' and not(contains(@class,'ng-hide'))]"); //localizar elemento Observado

    public static final Target PROYECTADOUNO_DROPDOWN = Target.the("Dropdown de Proyectado Uno")
            .locatedBy("//select[@formcontrolname='ratingClientePro1']"); //localizar elemento Proyectado UNO

    public static final Target PROYECTADODOS_DROPDOWN = Target.the("Dropdown de Proyectado Dos")
            .locatedBy("//select[@formcontrolname='ratingClienteObs2']");//localizar elemento Proyectado DOS

    public static final Target PROYECTADOTRES_DROPDOWN = Target.the("Dropdown de Proyectado Tres")
            .locatedBy("//select[@formcontrolname='ratingClientePro2']");//localizar elemento Proyectado Tres


    //Boton de continuar paso 1 de 4
    public static final Target BOTONCONTINUAR = Target.the("Botón continuar paso 1")
            .located(By.xpath("//button[normalize-space()='Continuar']"));



    private FormularioPasoUnoNitPage() {
    }
}

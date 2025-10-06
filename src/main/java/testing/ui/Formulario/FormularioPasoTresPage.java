package testing.ui.Formulario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPasoTresPage {

    public static final Target RADIOBUTTON = Target.the("Radiobutton Cotización 1")
            .locatedBy("//span[@id='cotizacion1']"); //locator de radiobutton

    public static final Target BOTON_GUARDAR_CONTINUAR = Target.the("Botón Guardar y continuar")
            .locatedBy("//button[contains(normalize-space(.), 'Guardar y continuar')]"); //locator de boron guardar y continuar

    public static final Target CAMPO_COMENTARIO = Target.the("Campo de comentario opcional")
            .locatedBy("//textarea[@id='txt_comentarios']"); //Comentario para el paso 3

    public static final Target BOTON_GUARDAR_CONTINUAR_MODAL = Target.the("Botón Guardar y Continuar dentro del recuadro de comentario")
            .locatedBy("//button[contains(@class, 'bdb-at-btn--sm') and contains(normalize-space(.), 'Guardar y Continuar')]");// segundo boton de guardar y continuar
}

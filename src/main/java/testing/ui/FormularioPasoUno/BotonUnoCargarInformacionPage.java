package testing.ui.FormularioPasoUno;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;

public class BotonUnoCargarInformacionPage {

    // Busca cualquier botón con ese texto, sin depender de IDs duplicados
    public static final By CAMPO_CON_INFORMACION =
            By.xpath("//button[contains(normalize-space(text()),'Cargar información')]");

    // Si necesitas el último (cuando desaparece loader):
    public static final Target BOTON_CARGAR_INFORMACION_VISIBLE = Target.the("botón cargar")
            .located(ByShadow.cssSelector(
                    "#boton",
                    "#pr-content > div:nth-child(2) > pr-modelo-rentabilidad-page > div > div:nth-child(4) > div > pr-input-modelo > article > div.pr-cliente-body > form > div.cargar-button > bdb-at-load-button"
            ));

    public static final Target CAMPO_NOMBRE_CLIENTE = Target.the("campo Nombre Cliente")
            .located(By.xpath("//span[normalize-space(text())='Nombre Cliente']"));

    public static final Target CAMPO_SEGMENTO_COMERCIAL = Target.the("campo Segmento Comercial")
            .located(By.xpath("//span[normalize-space(text())='Segmento comercial']"));

    public static final Target CAMPO_EPC = Target.the("campo Clasificación comercial EPC")
            .located(By.xpath("//span[normalize-space(text())='Clasificación comercial EPC']"));

    public static final Target CAMPO_ACTIVOS_PROMEDIO = Target.the("campo Activos promedio")
            .located(By.xpath("//span[normalize-space(text())='Activos promedio']"));

    public static final Target CAMPO_PASIVOS_PROMEDIO = Target.the("campo Pasivos promedio")
            .located(By.xpath("//span[normalize-space(text())='Pasivos promedio']"));

    public static final Target CAMPO_MARGEN_CONTRIBUCION = Target.the("campo Margen de Contribución")
            .located(By.xpath("//span[normalize-space(text())='Margen de Contribución']"));

    public static final Target CAMPO_ROA = Target.the("campo ROA")
            .located(By.xpath("//span[normalize-space(text())='ROA']"));

    public static final Target CAMPO_ACTIVOS_TOTALES = Target.the("campo Activos totales")
            .located(By.xpath("//span[normalize-space(text())='Activos totales']"));

    private BotonUnoCargarInformacionPage() {
    }
}

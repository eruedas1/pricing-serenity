package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.cssSelector;

public class CargarInformacionPage {

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
            .located(By.id("nombreCliente"));

    

    private CargarInformacionPage() {
    }
}

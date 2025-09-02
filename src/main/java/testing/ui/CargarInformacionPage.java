package testing.ui;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.cssSelector;

public class CargarInformacionPage {

    // Busca cualquier botón con ese texto, sin depender de IDs duplicados
    public static final By BOTON_CARGAR_INFORMACION =
            By.xpath("//button[contains(normalize-space(text()),'Cargar información')]");

    // Si necesitas el último (cuando desaparece loader):
    public static final By BOTON_CARGAR_INFORMACION_VISIBLE =
            By.xpath("(//button[contains(normalize-space(text()),'Cargar información')])[last()]");

    private CargarInformacionPage() {
    }
}

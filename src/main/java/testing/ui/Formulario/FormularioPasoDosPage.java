package testing.ui.Formulario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPasoDosPage {

    public static final Target TITULO_PASO_DOS = Target.the("PASO 2 DE 4")
            .located(By.xpath("//label[contains(normalize-space(),'PASO 2 DE 4')]"));
    public static final Target VALOR_OPERACION = Target.the("Campo valor operacion")
            .locatedBy("//input[@id='valorOperacion'][1]"); //locator del valor operacion
    public static final Target SUSTITUCION_PRORROGA_DROPDOWN = Target.the("Dropdown de sustitucion y prorroga")
            .locatedBy("#select-list"); //localizar sustitucion y prorroga
    public static final Target TIPO_OPERACION_DROPDOWN = Target.the("Dropdown de tipo de operacion")
            .locatedBy("(//select[@formcontrolname='tipoOperacion'])[1]"); //localizar tipo de operacion
    public static final Target INDICE_REFERENCIA_DROPDOWN = Target.the("Dropdown de indice de referencia ")
            .locatedBy("(//select[@formcontrolname='indiceReferencia'])[1]"); //localizar indice de referencia
    public static final Target SPREAD = Target.the("Campo spread")
            .locatedBy("#porcentajeSpread"); //locator del campo spread
    public static final Target PLAZO_EN_MESES = Target.the("Campo plazo en meses")
            .locatedBy("(//input[@formcontrolname='plazoMeses'])[1]"); //locator de plazo en meses
    public static final Target PERIODO_GRACIA_MESES = Target.the("Campo periodo de gracia en meses")
            .locatedBy("(//input[@formcontrolname='periodoGracia'])[1]"); //locator periodo de gracia en meses
    public static final Target PERIODICIDAD_INTERES_DROPDOWN = Target.the("Dropdown de periodicidad pago de interes")
            .locatedBy("(//select[@formcontrolname='pagoIntereses'])[1]"); //localizar periodicidad pago de interes
    public static final Target AMORTIZACION_CAPITAL_DROPDOWN = Target.the("Dropdown de amortizacion capital")
            .locatedBy("(//select[@formcontrolname='amortizacionCapital'])[1]"); //localizar amortizacion capital
    public static final Target TIPO_GARANTIA_DROPDOWN = Target.the("Dropdown de tipo de garantia ")
            .locatedBy("(//select[@formcontrolname='tipoGarantia'])[1]"); //localizar tipo de garantia
    public static final Target VALOR_GARANTIA = Target.the("Campo valor de la garantia")
            .locatedBy("#valorGarantia"); //locator del campo valor de a garantia
    public static final Target COMISIONES_NEGOCIADAS = Target.the("Campo comisiones negociadas")
            .locatedBy("#porcentajeComisionesNegociadas"); //locator de comisiones negociadas
    public static final Target CORRESPONDE_CAMPANA_DROPDOWN = Target.the("Dropdown de corresponde a campana ")
            .locatedBy("(//select[@formcontrolname='campanaComercial'])[1]"); //localizar corresponde a campana
    //Boton de continuar paso 2 de 4
    public static final Target BOTON_CONTINUAR_PASO2 = Target.the("Botón continuar paso 2")
            .located(By.xpath("//button[contains(@class, 'bdb-at-btn bdb-at-btn--secondary bdb-at-btn--lg') and contains(text(), 'Continuar')]"));
    public static final Target BOTON_FINALIZADO = Target.the("Botón finalizado")
            .located(By.xpath("//div[contains(@class, 'button-modal')]//button[contains(text(), 'Continuar')]"));



}
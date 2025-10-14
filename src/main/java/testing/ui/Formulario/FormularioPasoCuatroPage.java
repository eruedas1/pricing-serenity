package testing.ui.Formulario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPasoCuatroPage {

    public static final Target SELECT_MONTO = Target.the("Dropdown de monto")
            .located(By.cssSelector("select[formcontrolname='monto']"));
    public static final Target SELECT_EXCEPCION = Target.the("Dropdown de excepcion")
            .located(By.cssSelector("select[formcontrolname='excepcion']"));
    public static final Target LEA = Target.the("Campo LEA")
            .locatedBy("#lea"); //locator del campo LEA
    public static final Target TOTAL_UTILIZADO = Target.the("Campo total utilizado")
            .locatedBy("#totalUtilizado"); //locator del campo total utilizado
    public static final Target MONTO_APROBADO = Target.the("Campo monto aprobado")
            .locatedBy("#montoAprobadoFamilia"); //locator del campo monto aprobado
    public static final Target SELECT_REALIZO_VISITA = Target.the("Dropdown de realizo visita")
            .located(By.cssSelector("select[formcontrolname='cifrasClienteAnalizadas']"));
    public static final Target SELECT_REVISO_CIFIN = Target.the("Dropdown de reviso Cifin")
            .located(By.cssSelector("select[formcontrolname='cifin']"));
    public static final Target SELECT_FECHA_CORTE = Target.the("Dropdown de fecha de corte")
            .located(By.id("datepicker"));
    public static final Target CAMPO_OBSERVACIONES = Target.the("Campo de obsevaciones")
            .located(By.cssSelector("#observacionesCalificaciones")); //campo observaciones
    public static final Target CAMPO_RECOMENDACION = Target.the("Campo de recomendacion")
            .located(By.xpath("//textarea[contains(@id, 'recomendacion') and @formcontrolname='recomendacionComercial']")); //campo recomendacion
    public static final Target BOTON_SIGUIENTE = Target.the("Botón Siguiente")
            .locatedBy("(//button[@class='bdb-at-btn bdb-at-btn--secondary bdb-at-btn--lg'])[1]");
    public static final Target BOTON_CONTINUAR_CORREOS = Target.the("Botón continuar correos")
            .located(By.xpath("(//button[@class='bdb-at-btn bdb-at-btn--primary'][normalize-space()='Continuar'])[1]"));

}

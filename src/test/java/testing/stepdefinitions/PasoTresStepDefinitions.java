package testing.stepdefinitions;
import io.cucumber.java.en.*;
import testing.tasks.PasoTresCotizador.EscribirComentario;
import testing.tasks.PasoTresCotizador.GuardarYContinuar;
import testing.tasks.PasoTresCotizador.RadioButton;
import testing.tasks.PasoTresCotizador.GuardarYContinuarModal;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PasoTresStepDefinitions {
    @Given("Selecciono el radiobutton con el texto  Cotizacion")
    public void seleccionoElRadiobuttonConElTextoCotizacion() {
        theActorInTheSpotlight().attemptsTo(
                RadioButton.conTextoCotizacion()
        );
    }

    @When("Doy click en el boton Guardar y continuar del paso tres")
    public void doyClickEnElBotonGuardarYContinuarDelPasoTres() {
        theActorInTheSpotlight().attemptsTo(
                GuardarYContinuar.clickEnBoton()
        );
    }

    @And("Escribo un comentario opcional")
    public void escriboUnComentarioOpcional() {
        theActorInTheSpotlight().attemptsTo(
                EscribirComentario.opcional("Prueba de comentario opcional")
        );
    }
    @Then("Doy nuevamente click al boton Guardar y Continuar")
    public void doyNuevamenteClickAlBotonGuardarYContinuar() {
        theActorInTheSpotlight().attemptsTo(
                GuardarYContinuarModal.clickEnBoton()
        );
    }

}

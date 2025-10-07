package testing.stepdefinitions;
import io.cucumber.java.en.*;
import testing.tasks.PasoTresCotizador.*;

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
                GuardarYContinuarModal.clickEnBoton(),
                ValidarTituloEnPagina.conTexto("DCC FOR 130")
        );
    }

    @Given("Selecciono la opcion de Semaforo")
    public void seleccionoLaOpcionDeSemaforo() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarSemaforo.conValor("Amarillo") // Puedes cambiar el color aquí
        );
    }

}

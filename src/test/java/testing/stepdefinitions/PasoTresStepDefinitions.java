package testing.stepdefinitions;
import io.cucumber.java.en.*;
import testing.tasks.PasoDosCotizador.BtnContinuarDos;
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
    @And("Copio un comentario opcional")
    public void copioUnComentarioOpcional() {
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

    @Then("Doy nuevamente click al boton Guardar y Continuar del paso dos")
    public void doyNuevamenteClickAlBotonGuardarYContinuarDelPasoDos() {
        theActorInTheSpotlight().attemptsTo(
                GuardarYContinuarModal.clickEnBoton(),
                ValidarTituloEnPagina.conTexto("DCC FOR 130")
        );
    }

    @Given("Selecciono la opcion de Semaforo y CIFIN {string} y {string}")
    public void seleccionoLaOpcionDeSemaforoYCifin(String semaforo, String cifin) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarSemaforoYCifin.conOpciones(semaforo, cifin)
        );
    }

    @Then("Clickeo la opcion de Semaforo y Cifin {string} y {string}")
    public void clickeoLaOpcionDeSemaforoyCifi(String semaforo, String cifin) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarSemaforoYCifin.conOpciones(semaforo, cifin)
        );
    }

    @When("Selecciono el campo Tipo operacion {string}")
    public void seleccionoElCampoTipoOperacion(String tipoOperacion) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTipoOperacion.conValor(tipoOperacion)
        );
    }

    @Then("Clickeo el campo Tipo operacion {string}")
    public void clickeoElCampoTipoOperacion(String tipoOperacion) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTipoOperacion.conValor(tipoOperacion)
        );
    }

    @And("Selecciono la opcion Desembolso {string}")
    public void seleccionoLaOpcionDesembolso(String desembolso) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarDesembolso.conTexto(desembolso)
        );
    }

    @Then("Doy click en el boton Siguiente")
    public void doyClickEnElBotonSiguiente() {
        theActorInTheSpotlight().attemptsTo(
                ClickEnSiguienteYValidarTitulo.validar()
        );
    }

    @And("Clickeo click en continuar")
    public void ClickeoClickEnContinuar () {
        theActorInTheSpotlight().attemptsTo(
                BtnContinuarDos.ejecutar()
        );


    }

    @Then("Clickeo el radiobutton con el texto  Cotizacion")
    public void ClickeoElRadiobuttonConElTextoCotizacion() {
        theActorInTheSpotlight().attemptsTo(
                RadioButton.conTextoCotizacion()
        );
    }

    @And("Oprimo el radiobutton con el texto  Cotizacion")
    public void oprimoElRadiobuttonConElTextoCotizacion() {
        theActorInTheSpotlight().attemptsTo(
                RadioButton.conTextoCotizacion()
        );
    }

    @Then("Clickeo en el boton Guardar y continuar del paso tres")
    public void clickeoEnElBotonGuardarYContinuarDelPasoTres() {
        theActorInTheSpotlight().attemptsTo(
                GuardarYContinuar.clickEnBoton()
        );
    }


}

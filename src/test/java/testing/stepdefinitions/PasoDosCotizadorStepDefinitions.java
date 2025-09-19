package testing.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testing.questions.PasoDosEsVisible;
import testing.tasks.PasoDosCotizador.IngresarValorOperacion;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PasoDosCotizadorStepDefinitions {


    @Given("Escribo el valor operacion {string}")
    public void escriboElValorOperacion(String numero) {
        theActorInTheSpotlight().attemptsTo(
                IngresarValorOperacion.con(numero)
        );

    }
    @When("Selecciono sustitucion o prorroga")
    public void seleccionoSustitucionOProrroga() {

    }
    @When("Selecciono el tipo de operacion")
    public void seleccionoElTipoDeOperacion() {

    }
    @When("Selecciono el indice de referencia")
    public void seleccionoElIndiceDeReferencia() {

    }
    @When("Escribo el spread {string}")
    public void escriboElSpread(String string) {

    }
    @When("Escribo el plazo en meses {string}")
    public void escriboElPlazoEnMeses(String string) {

    }
    @When("Escribo el periodo de gracia {string}")
    public void escriboElPeriodoDeGracia(String string) {

    }
    @When("Selecciono la periodicidad pago de intereses")
    public void seleccionoLaPeriodicidadPagoDeIntereses() {

    }
    @When("Selecciono amortizacion de capital")
    public void seleccionoAmortizacionDeCapital() {

    }
    @When("Selecciono tipo de garantia")
    public void seleccionoTipoDeGarantia() {

    }
    @When("Escribo el valor de la garantia {string}")
    public void escriboElValorDeLaGarantia(String string) {

    }
    @When("Escribo el valor de las comisiones negociadas {string}")
    public void escriboElValorDeLasComisionesNegociadas(String string) {

    }
    @When("Selecciono corresponde a una campana")
    public void seleccionoCorrespondeAUnaCampana() {

    }
    @When("Doy click en continuar")
    public void doyClickEnContinuar() {

    }
    @Then("Aparece mensaje finalizado")
    public void apareceMensajeFinalizado() {

    }

}
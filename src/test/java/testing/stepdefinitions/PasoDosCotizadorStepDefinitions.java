package testing.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import testing.questions.PasoDosEsVisible;
import testing.tasks.FormularioPasoUno.FlujoCargarYContinuar;
import testing.tasks.PasoCuatroCotizador.BtnContinuarCorreos;
import testing.tasks.PasoDosCotizador.*;
import testing.ui.Formulario.FormularioPasoDosPage;
import testing.ui.Formulario.FormularioPasoUnoPage;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PasoDosCotizadorStepDefinitions {


    @Given("Escribo el valor operacion {string}")
    public void escriboElValorOperacion(String valorOperacion) {
        theActorInTheSpotlight().attemptsTo(
                IngresarValorOperacion.con(valorOperacion)
        );
    }

    @When("Selecciono todos los campos del paso dos {string} y {string} y {string}")
    public void selecciono_todos_los_campos_del_paso_dos_y_y(String SustiyProrroga, String tipoOperacion, String indiceReferencia) {
        // Sustitucion y Prorroga
        if (SustiyProrroga != null && !SustiyProrroga.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byVisibleText(SustiyProrroga).from(FormularioPasoDosPage.SUSTITUCION_PRORROGA_DROPDOWN)
            );
        }
        // Tipo de Operacion
        if (tipoOperacion != null && !tipoOperacion.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byVisibleText(tipoOperacion).from(FormularioPasoDosPage.TIPO_OPERACION_DROPDOWN)
            );
        }
        // Indice de Referencia
        if (indiceReferencia != null && !indiceReferencia.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byVisibleText(indiceReferencia).from(FormularioPasoDosPage.INDICE_REFERENCIA_DROPDOWN)
            );
        }
    }
        @When("Escribo en los campos requeridos {string} y {string} y {string}")
        public void escribo_en_los_campos_requeridos_y_y (String spread, String plazoMeses, String periodoGraciaEnMeses)
        {theActorInTheSpotlight().attemptsTo(
                EscribirPasoDos.conValores (spread, plazoMeses, periodoGraciaEnMeses)
        );

        }

        @When("Selecciono todos los campos requeridos {string} y {string} y {string}")
        public void selecciono_todos_los_campos_requeridos_y_y (String periodicidadPagoDeIntereses, String
        amortizacionDeCapital, String tipoDeGarantia){
            // Periodicidad Pago de Intereses
            if (periodicidadPagoDeIntereses != null && !periodicidadPagoDeIntereses.trim().isEmpty()) {
                theActorInTheSpotlight().attemptsTo(
                        SelectFromOptions.byVisibleText(periodicidadPagoDeIntereses).from(FormularioPasoDosPage.PERIODICIDAD_INTERES_DROPDOWN)
                );
            }
            // Amortizacion de Capital
            if (amortizacionDeCapital != null && !amortizacionDeCapital.trim().isEmpty()) {
                theActorInTheSpotlight().attemptsTo(
                        SelectFromOptions.byVisibleText(amortizacionDeCapital).from(FormularioPasoDosPage.AMORTIZACION_CAPITAL_DROPDOWN)
                );
            }
            // Tipo Garantia
            if (tipoDeGarantia != null && !tipoDeGarantia.trim().isEmpty()) {
                theActorInTheSpotlight().attemptsTo(
                        SelectFromOptions.byVisibleText(tipoDeGarantia).from(FormularioPasoDosPage.TIPO_GARANTIA_DROPDOWN)
                );
            }

        }

        @When("Escribo en los siguientes campos {string} y {string}")
        public void escribo_en_los_siguientes_campos_y (String valorGarantia, String comisionesNegociadas){
            theActorInTheSpotlight().attemptsTo(
                    EscribValorGarantiaComisioNeg.conValores (valorGarantia, comisionesNegociadas)
            );

        }

        @When("Selecciono en el campo {string}")
        public void selecciono_en_el_campo (String correspondeCampana){
            // Corresponde a campaña
            if (correspondeCampana != null && !correspondeCampana.trim().isEmpty()) {
                theActorInTheSpotlight().attemptsTo(
                        SelectFromOptions.byVisibleText(correspondeCampana).from(FormularioPasoDosPage.CORRESPONDE_CAMPANA_DROPDOWN)
                );
            }

        }

        @Then("Doy click en continuar")
        public void doyClickEnContinuar () {
            theActorInTheSpotlight().attemptsTo(
                    BtnContinuarDos.ejecutar()
            );


       }

    }

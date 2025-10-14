package testing.stepdefinitions;
import io.cucumber.java.en.*;
import testing.tasks.PasoCuatroCotizador.*;
import testing.tasks.PasoDosCotizador.BtnContinuarDos;
import testing.tasks.PasoTresCotizador.EscribirComentario;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PasoCuatroStepDefinitions {

    @Given("Selecciono la opcion de Monto y Excepcion {string} y {string}")
    public void selecciono_la_opcion_de_monto_y_excepcion_y(String Monto, String Exepcion) {
        theActorInTheSpotlight().attemptsTo(
                SelecMontoExcepcion.con(Monto, Exepcion)
        );

    }

    @When("Escribo en el campo LEA y total utilizado y monto aprobado {string} y {string} y {string}")
    public void escribo_en_el_campo_lea_y_total_utilizado_y_monto_aprobado_y_y(String LEA, String TotalUtilizado, String MontoAprobado) {
        theActorInTheSpotlight().attemptsTo(
                EscribirLeaTotalMonto.conValores (LEA, TotalUtilizado, MontoAprobado)
        );
    }

    @When("Selecciono la opcion Desembolso Realizo visita comercial y reviso cifin y fecha de corte {string} y {string} y {string}")
    public void selecciono_la_opcion_desembolso_realizo_visita_comercial_y_reviso_cifin_y_fecha_de_corte_y_y(String RealizoVisitaComercial, String RevisoCifin, String FechadeCorte) {
        theActorInTheSpotlight().attemptsTo(
                SelecVisitaCifinFecha.con(RealizoVisitaComercial, RevisoCifin, FechadeCorte)
        );
    }

    @When("Escribo un comentario en Observaciones y Recomendacion")
    public void escribo_un_comentario_en_observaciones_y_recomendacion_y() {
        theActorInTheSpotlight().attemptsTo(
                EscribirRecomendacion.opcional("Prueba de comentario opcional")
        );

    }

    @When("Doy click en el boton Siguiente para finalizar")
    public void doy_click_en_el_boton_siguiente_para_finalizar() {
        theActorInTheSpotlight().attemptsTo(
                BtnSiguiente.ejecutar()
        );


    }
    @Then("Doy click en continuar correos")
    public void doyClickEnContinuarCorreos () {
        theActorInTheSpotlight().attemptsTo(
                BtnContinuarCorreos.ejecutar());
        {

        }

    }
}



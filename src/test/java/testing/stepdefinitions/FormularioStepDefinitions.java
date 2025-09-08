package testing.stepdefinitions;
import io.cucumber.java.en.Then;
import testing.questions.PasoDosEsVisible;
import testing.tasks.FormularioPasoUno.ClickEnContinuar;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioStepDefinitions {

    @Then("Estoy en la pagina dos de cuatro del cotizador")
    public void estoyEnLaPaginaDosDeCuatroDelCotizador() {
        theActorInTheSpotlight().should(
                seeThat(PasoDosEsVisible.existe(), equalTo(true))
        );

        // Ejecutar la acción de click por separado
       // theActorInTheSpotlight().attemptsTo(
          //      ClickEnContinuar.enPasoUno()
     //   );
    }}
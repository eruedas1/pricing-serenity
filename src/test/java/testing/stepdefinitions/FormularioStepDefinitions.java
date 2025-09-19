package testing.stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testing.questions.PasoDosEsVisible;
import testing.questions.SuccessForm;
import testing.tasks.FormularioPasoUno.ClickEnContinuar;
import testing.ui.Background.LoginPage;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioStepDefinitions {

    @Then("Debe iniciar sesion correctamente a pricing")
    public void debeIniciarSesionCorrectamenteAPricing() {
        theActorInTheSpotlight().should(
                seeThat(SuccessForm.conTexto(LoginPage.LOGIN_BIENVENIDA, "Bienvenido"))
        );
    }
        // Ejecutar la acción de click por separado
       // theActorInTheSpotlight().attemptsTo(
          //      ClickEnContinuar.enPasoUno()
     //   );
    }


package testing.stepdefinitions;
import io.cucumber.java.en.Then;
import testing.questions.SuccessForm;
import testing.ui.Background.LoginPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioStepDefinitions {

    @Then("Debe iniciar sesion correctamente a pricing")
    public void debeIniciarSesionCorrectamenteAPricing() {
        theActorInTheSpotlight().should(
                seeThat(SuccessForm.conTexto(LoginPage.LOGIN_BIENVENIDA, "Bienvenido"))
        );
    }
   
    }






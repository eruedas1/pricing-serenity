package testing.stepdefinitions;
<<<<<<< HEAD
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
=======
import io.cucumber.java.en.*;
>>>>>>> origin/main
import testing.questions.PasoDosEsVisible;
import testing.questions.SuccessForm;
import testing.tasks.FormularioPasoUno.ClickEnContinuar;
<<<<<<< HEAD
import testing.ui.Background.LoginPage;
=======
import testing.tasks.FormularioPasoUno.IngresarNumeroIdentificacion;
import testing.tasks.PasoDosCotizador.IngresarValorOperacion;
>>>>>>> origin/main

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
<<<<<<< HEAD
       // theActorInTheSpotlight().attemptsTo(
          //      ClickEnContinuar.enPasoUno()
     //   );
    }

=======
        // theActorInTheSpotlight().attemptsTo(
        //      ClickEnContinuar.enPasoUno()
        //   );
    }

}
>>>>>>> origin/main

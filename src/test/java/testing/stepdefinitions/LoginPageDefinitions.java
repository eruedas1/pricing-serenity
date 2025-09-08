package testing.stepdefinitions;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.questions.BotonCargarInformacion;
import testing.questions.ErrorLogin;
import testing.questions.SuccessForm;
import testing.tasks.Background.Cotizador;
import testing.tasks.Background.Login;
import testing.tasks.Background.Pricing;
import testing.tasks.FormularioPasoUno.*;
import testing.ui.Background.PricingPage;
import testing.utils.CsvUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class LoginPageDefinitions {

    @When("Inicia sesion con sus credenciales")
    public void iniciaSesionConSusCredenciales() throws IOException {
        String rutaCsv = "src/test/resources/data/Login/credenciales-validas.csv";
        List<String[]> filas = CsvUtils.leer(rutaCsv);

        for (String[] fila : filas) {
            String email = fila[0];
            String password = fila[1];

            System.out.println("Probando usuario: " + email);

            OnStage.theActorCalled("User").attemptsTo(
                    Login.conCredenciales(email, password)
            );

        }
    }
    @And("Debe iniciar sesion correctamente")
    public void debeIniciarSesionCorrectamente() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(PricingPage.INICIO_PRICING, isVisible()).forNoMoreThan(30).seconds()

        );
    }

    @And("Debe darle click al boton de pricing")
    public void debeDarleClickAlBotonDePricing() {
        theActorInTheSpotlight().attemptsTo(
                Pricing.click()
        );
    }

    @And("Debe darle click al boton de cotizador")
    public void debeDarleClickAlBotonDeCotizador() {
        theActorInTheSpotlight().attemptsTo(
                Cotizador.click()
        );
    }

    @Then("Estoy en la pagina uno de cuatro del cotizador")
    public void estoyEnLaPaginaUnoDeCuatroDelCotizador() {
        theActorInTheSpotlight().should(seeThat(SuccessForm.loginExitoso()));
    }

    @Given("Selecciono la opcion tipo de identificacion")
    public void seleccionoLaOpcionTipoDeIdentificacion() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTipoIdentificacion.como("Nit")
        );
    }
    @When("Escribo el numero de identificacion {string}")
    public void escriboElNumeroDeIdentificacion(String numero) {
        theActorInTheSpotlight().attemptsTo(
                IngresarNumeroIdentificacion.con(numero)
        );
    }

    @And("Selecciono si es Cliente Especial o Codeudor")
    public void seleccionoSiEsClienteEspecialOCodeudor() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTipoCliente.como("No")
        );
    }

    @And("En Rating Financiero Cliente selecciono los campos indicados")
    public void enRatingFinancieroClienteSeleccionoLosCamposIndicados() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarRatingFinanciero.camposIndicados()
        );
    }

    @And("Debe darle click al boton en  Cargar información")
    public void debeDarleClickAlBotonEnCargarInformacion() {
        theActorInTheSpotlight().attemptsTo(
                BotonUnoCargarInformacion.unosSegundos()

        );
    }

        @And("Debe verificar que existen los campos")
    public void debeVerificarQueExistenLosCampos() {
        theActorInTheSpotlight().should(seeThat(BotonCargarInformacion.camposExitosos()));
    }

    @Then("Dar click en el boton continuar")
    public void darClickEnElBotonContinuar() {
        theActorInTheSpotlight().attemptsTo(
                BotonUnoCargarInformacion.unosSegundos()

        );
    }


    // Casos de prueba de excepcion

    @Then("Debe entrar a la pagina del formulario")
    public void debeEntrarALaPaginaDelFormulario() {
        theActorInTheSpotlight().should(seeThat(SuccessForm.loginExitoso()));
    }

    @Then("Debe ver el mensaje de error {string}")
    public void debeVerElMensajeDeError(String expectedErrorMessage) {
        theActorInTheSpotlight().should(seeThat(ErrorLogin.porCredencialesInvalidas(expectedErrorMessage)));
    }

    @Then("Debe iniciar sesion correctamente a pricing")
    public void debeIniciarSesionCorrectamenteAPricing() {
        theActorInTheSpotlight().should(seeThat(SuccessForm.loginExitoso()));
    }

    @Then("Debe ver el mensaje de error {string} debajo del nombre de usuario")
    public void debeVerElMensajeDeErrorDebajoDelNombreDeUsuario(String expectedErrorMessage) {
        theActorInTheSpotlight().should(seeThat(ErrorLogin.porNombreDeUsuarioFaltante(expectedErrorMessage)));
    }



    @When("Inicia sesión con sus credenciales invalidas correo")
    public void iniciaSesionConSusCredencialesInvalidasCorreo() throws IOException {
        String rutaCsv = "src/test/resources/data/Login/credenciales-invvalidas-correo.csv";
        List<String[]> filas = CsvUtils.leer(rutaCsv);

        for (String[] fila : filas) {
            String email = fila[0];
            String password = fila[1];

            System.out.println("Probando usuario: " + email);

            OnStage.theActorCalled("User").attemptsTo(
                    Login.conCredenciales(email, password)
            );

        }
    }

    @When("Inicia sesión con sus credenciales invalidas clave")
    public void iniciaSesionConSusCredencialesInvalidasClave() throws IOException {
        String rutaCsv = "src/test/resources/data/Login/credenciales-invvalidas-contrasena.csv";
        List<String[]> filas = CsvUtils.leer(rutaCsv);

        for (String[] fila : filas) {
            try {
                String email = fila[0];
                String password = fila[1];
                System.out.println("Probando usuario: " + email);

                OnStage.theActorCalled("User").attemptsTo(
                        Login.conCredenciales(email, password)
                );

            } catch (Exception e) {
                e.printStackTrace();
            }
        }}

    @When("Inicia sesión con sus credenciales correo en blanco")
    public void iniciaSesionConSusCredencialesCorreoEnBlanco() throws IOException {
        String rutaCsv = "src/test/resources/data/Login/sincorreo.csv";
        List<String[]> filas = CsvUtils.leer(rutaCsv);

        for (String[] fila : filas) {
            try {
                String email = fila[0];
                String password = fila[1];
                System.out.println("Probando usuario: " + email);

                OnStage.theActorCalled("User").attemptsTo(
                        Login.conCredenciales(email, password)
                );

            } catch (Exception e) {
                e.printStackTrace();
            }
        }}

    @When("Intenta Iniciar sesión con sus credenciales contrasena en blanco")
    public void intentaIniciarSesionConSusCredencialesContrasenaEnBlanco() throws IOException {
        System.out.println("=== Ejecutando login con contraseña en blanco ===");
        String rutaCsv = "src/test/resources/data/Login/sincontrasena.csv";
        List<String[]> filas = CsvUtils.leer(rutaCsv);

        for (String[] fila : filas) {
            try {
                if (fila.length < 1) {
                    System.out.println("Fila inválida: " + Arrays.toString(fila));
                    continue;
                }

                String email = fila[0].trim();
                String password = "";  // Aquí asignas contraseña vacía directamente

                System.out.println("Probando usuario: " + email + " con contraseña vacía");

                OnStage.theActorCalled("User").attemptsTo(
                        Login.conCredenciales(email, password)
                );

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



    @Then("Debe ver el mensaje de error {string} debajo de la contrasena")
    public void debeVerElMensajeDeErrorDebajoDeLaContrasena(String expectedErrorMessage) {
        theActorInTheSpotlight().should(seeThat(ErrorLogin.porFaltaDeContrasena(expectedErrorMessage)));
    }

}

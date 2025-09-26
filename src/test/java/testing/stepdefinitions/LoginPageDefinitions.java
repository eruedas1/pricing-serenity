package testing.stepdefinitions;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.questions.BotonCargarInformacion;
import testing.questions.ErrorLogin;
import testing.questions.PasoDosEsVisible;
import testing.questions.SuccessForm;
import testing.tasks.Background.Cotizador;
import testing.tasks.Background.Login;
import testing.tasks.Background.Pricing;
import testing.tasks.FormularioPasoUno.*;
import testing.ui.Background.PricingPage;
import testing.ui.FormularioPasoUno.FormularioPasoUnoPage;
import testing.utils.CsvUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


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
        theActorInTheSpotlight().should(
                seeThat(SuccessForm.conTexto(FormularioPasoUnoPage.FORMULARIO, "Cotizador"))
        );}
    @Given("Selecciono la opcion tipo de identificacion {string}")
    public void seleccionoLaOpcionTipoDeIdentificacion(String tipo) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTipoIdentificacion.como(tipo)
        );
    }
    @When("Escribo el numero de identificacion {string}")
    public void escriboElNumeroDeIdentificacion(String numero) {
        theActorInTheSpotlight().attemptsTo(
                IngresarNumeroIdentificacion.con(numero)
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

    @And("Dar click en el boton continuar en paso uno")
    public void darClickEnContinuarEnPasoUno() {
        theActorInTheSpotlight().attemptsTo(
                ClickEnContinuar.enPasoUno()
        );
    }
    @Then("Estoy en la pagina dos de cuatro del cotizador")
    public void estoyEnLaPaginaDosDeCuatroDelCotizador() {
        theActorInTheSpotlight().should(
                seeThat(PasoDosEsVisible.existe())
                        .orComplainWith(AssertionError.class, "No se encontró el PASO 2 DE 4 en el cotizador")
        );
    }
// outline
@When("completa el formulario con el NIT {string}")
public void completa_el_formulario_con_el_nit(String string) {
}

@And("Selecciono opciones requeridas {string} y {string} y {string} y {string} y {string} y {string} y {string}")
    public void seleccionoOpcionesRequeridas(String rolCliente, String tipoI, String numeroI, String ratinguno, String ratingdos, String ratingtres, String ratingcuatro) {
// Rol cliente
    if (rolCliente != null && !rolCliente.trim().isEmpty()) {
        theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byVisibleText(rolCliente).from(FormularioPasoUnoPage.TIPO_ClIENTE)
        );
    }
    // Tipo de identificación
    if (tipoI != null && !tipoI.trim().isEmpty()) {
        theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byVisibleText(tipoI).from(FormularioPasoUnoPage.SELECT_TIPO_IDENTIFICACION)
        );
    }
    // Número de identificación
    if (numeroI != null && !numeroI.trim().isEmpty()) {
        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(numeroI).into(FormularioPasoUnoPage.INPUT_NUMERO_IDENTIFICACION)
        );
    }
    // Dropdowns de rating
    if (ratinguno != null && !ratinguno.trim().isEmpty()) {
        theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byValue(ratinguno).from(FormularioPasoUnoPage.OBSERVADO_DROPDOWN)
        );
    }
    if (ratingdos != null && !ratingdos.trim().isEmpty()) {
        theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byValue(ratingdos).from(FormularioPasoUnoPage.PROYECTADOUNO_DROPDOWN)
        );
    }
    if (ratingtres != null && !ratingtres.trim().isEmpty()) {
        theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byValue(ratingtres).from(FormularioPasoUnoPage.PROYECTADODOS_DROPDOWN)
        );
    }
    if (ratingcuatro != null && !ratingcuatro.trim().isEmpty()) {
        theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byValue(ratingcuatro).from(FormularioPasoUnoPage.PROYECTADOTRES_DROPDOWN)
        );
    }
}

    // Casos de prueba de excepcion

    @Then("Debe entrar a la pagina del formulario")
    public void debeEntrarALaPaginaDelFormulario() {
        theActorInTheSpotlight().should(seeThat(SuccessForm.con(FormularioPasoUnoPage.FORMULARIO)));
    }

    @Then("Debe ver el mensaje de error {string}")
    public void debeVerElMensajeDeError(String expectedErrorMessage) {
        theActorInTheSpotlight().should(seeThat(ErrorLogin.porCredencialesInvalidas(expectedErrorMessage)));
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

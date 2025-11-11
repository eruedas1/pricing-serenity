package testing.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.questions.ErrorLogin;
import testing.questions.PasoDosEsVisible;
import testing.questions.SuccessForm;
import testing.tasks.Background.Cotizador;
import testing.tasks.Background.Login;
import testing.tasks.Background.Pricing;
import testing.tasks.FormularioPasoUno.*;
import testing.tasks.PasoDosCotizador.EscribValorGarantiaComisioNeg;
import testing.tasks.PasoDosCotizador.EscribirPasoDos;
import testing.tasks.PasoDosCotizador.IngresarValorOperacion;
import testing.ui.Background.PricingPage;
import testing.ui.Formulario.FormularioPasoDosPage;
import testing.ui.Formulario.FormularioPasoUnoPage;
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
        theActorInTheSpotlight().should(
                seeThat(SuccessForm.conTexto(FormularioPasoUnoPage.FORMULARIO, "Cotizador"))
        );
    }

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

    @And("Debe realizar el flujo de cargar información y continuar")
    public void debeRealizarFlujoCargarYContinuar() {
        theActorInTheSpotlight().attemptsTo(
                FlujoCargarYContinuar.ejecutar()
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
                System.out.println("Probando usuario: " + email + " con contraseña invalida");

                OnStage.theActorCalled("User").attemptsTo(
                        Login.conCredenciales(email, password)
                );

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

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
        }
    }

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


    @Given("que estoy en la pantalla de registro")
    public void estoyEnLaPantallaDeRegistro() {
        theActorInTheSpotlight().should(
                seeThat(SuccessForm.conTexto(FormularioPasoUnoPage.FORMULARIO, "Cotizador"))
        );
    }

    @When("Oprimo tipo de identificación {string}")
    public void oprimoTipoDeIdentificacion(String tipo) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTipoIdentificacion.como(tipo)
        );
    }

    @Then("debe seleccionar la opcion del tipo de identificación")
    public void debeSeleccionarLaOpcionDelTipoDeIdentificacion() {

    }

    @Given("elijo el tipo de identificación {string}")
    public void elijoTipoDeIdentificacion(String tipo) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTipoIdentificacion.como(tipo)
        );
    }

    @When("redacto el numero de identificacion {string}")
    public void redactoElNumeroDeIdentificacion(String numero) {
        theActorInTheSpotlight().attemptsTo(
                IngresarNumeroIdentificacion.con(numero)
        );
    }

    @Then("debe escribir el numero de identificacion")
    public void debeescribirelNumeroDeIdentificacion() {
    }


    @Given("tomo el tipo de identificación {string}")
    public void tomoTipoDeIdentificacion(String tipo) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTipoIdentificacion.como(tipo)
        );
    }

    @When("copi el numero de identificacion {string}")
    public void copiElNumeroDeIdentificacion(String numero) {
        theActorInTheSpotlight().attemptsTo(
                IngresarNumeroIdentificacion.con(numero)
        );
    }

    @And("selecciono la opción de rol de cliente {string}")
    public void SeleccionoLaOpcionDeRolDeCliente(String rolCliente) {
        if (rolCliente != null && !rolCliente.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byVisibleText(rolCliente).from(FormularioPasoUnoPage.TIPO_ClIENTE)
            );
        }
    }

    @Then("el sistema debe registrar correctamente el rating seleccionado")
    public void elSistemaDebeRegistrarCorrectamenteElRatingSeleccionado() {
    }

    @Then("el sistema debe registrar correctamente el rol seleccionado")
    public void elSistemaDebeRegistrarCorrectamenteElRolSeleccionado() {
    }

    @And("selecciono opciones {string} y {string}")
    public void seleccionoOpciones(String rolCliente, String tipoI) {
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
    }


    @And("selecciono opciones num {string} y {string} y {string}")
    public void seleccionoOpcionesNum(String rolCliente, String tipoI, String numeroI) {
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
    }

    @And("selecciono opciones ratinguno {string} y {string} y {string} y {string}")
    public void seleccionoOpcionesuno(String rolCliente, String tipoI, String numeroI, String ratinguno) {
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
        //Rating Uno
        if (ratinguno != null && !ratinguno.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byValue(ratinguno).from(FormularioPasoUnoPage.OBSERVADO_DROPDOWN)
            );
        }

    }

    @And("selecciono opciones ratingdos {string} y {string} y {string} y {string} y {string}")
    public void seleccionoOpcionesdos(String rolCliente, String tipoI, String numeroI, String ratinguno, String ratingdos) {
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
        //Rating Uno
        if (ratinguno != null && !ratinguno.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byValue(ratinguno).from(FormularioPasoUnoPage.OBSERVADO_DROPDOWN)
            );
        }

        //Rating Dos
        if (ratingdos != null && !ratingdos.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byValue(ratingdos).from(FormularioPasoUnoPage.PROYECTADOUNO_DROPDOWN)
            );
        }
    }

    @And("selecciono opciones ratingtres {string} y {string} y {string} y {string} y {string} y {string}")
    public void seleccionoOpcionesdos(String rolCliente, String tipoI, String numeroI, String ratinguno, String ratingdos, String ratingtres) {
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
        //Rating Uno
        if (ratinguno != null && !ratinguno.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byValue(ratinguno).from(FormularioPasoUnoPage.OBSERVADO_DROPDOWN)
            );
        }

        //Rating Dos
        if (ratingdos != null && !ratingdos.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byValue(ratingdos).from(FormularioPasoUnoPage.PROYECTADOUNO_DROPDOWN)
            );
        }
        //Rating Tres
        if (ratingtres != null && !ratingtres.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byValue(ratingtres).from(FormularioPasoUnoPage.PROYECTADODOS_DROPDOWN)
            );
        }
    }

    @Given("que estoy en la pagina dos del cotizador")
    public void que_estoy_en_la_pagina_dos_del_cotizador() {

    }

    @When("Registro el valor de la operacion {string}")
    public void registro_el_valor_de_la_operacion(String valorOperacion) {
        theActorInTheSpotlight().attemptsTo(
                IngresarValorOperacion.con(valorOperacion)
        );

    }

    @Then("Debe escrbir el valor de la operacion")
    public void Debe_escrbir_el_valor_de_la_operacion() {

    }

    @When("Selecciono el campos sustitucion y prorroga {string}")
    public void seleccionoElCamposSustitucionYProrroga(String SustiyProrroga) {
        if (SustiyProrroga != null && !SustiyProrroga.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byVisibleText(SustiyProrroga).from(FormularioPasoDosPage.SUSTITUCION_PRORROGA_DROPDOWN)
            );
        }
    }

    @Then("Debe seleccionar no en el campo sustitucion y prorroga")
    public void debeSeleccionarNoEnElCampoSustitucionYProrroga() {

    }

    @When("Selecciono el campo tipo de operacion {string}")
    public void seleccionoElCampoTipoDeOperacion(String tipoOperacion) {
        if (tipoOperacion != null && !tipoOperacion.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byVisibleText(tipoOperacion).from(FormularioPasoDosPage.TIPO_OPERACION_DROPDOWN)
            );
        }
    }

    @Then("Debe seleccionar constructor en el campo tipo de operacion")
    public void debeSeleccionarContructorEnElCampoTipoDeOperacion() {

    }

    @When("Selecciono el indice de referencia {string}")
    public void seleccionoElIndiceDeReferencia(String indiceReferencia) {
        if (indiceReferencia != null && !indiceReferencia.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byVisibleText(indiceReferencia).from(FormularioPasoDosPage.INDICE_REFERENCIA_DROPDOWN)
            );
        }
    }

    @Then("Debe seleccionar IPC en el campo indice de referencia")
    public void debeSeleccionarIPCEnElCampoIndiceDeReferencia() {

    }

    @When("Escribo el numero en el campo spread {string}")
    public void escribo_el_numero_en_el_campo_spread(String spread) {
        theActorInTheSpotlight().attemptsTo(
                EscribirPasoDos.soloSpread(spread)
        );

    }

    @Then("El sistema registra el numero spread correctamente")
    public void elSistemaRegistraElNumeroSpreadCorrectamente() {
    }

    @When("Escribo el plazo en meses {string}")
    public void escribo_el_plazo_en_meses(String plazoMeses) {
        theActorInTheSpotlight().attemptsTo(
                EscribirPasoDos.soloPlazo(plazoMeses));
    }

    @Then("El sistema registra el plazo en meses correctamente")
    public void elSistemaRegistraElPlazoEnMesesCorrectamente() {

    }

    @When("Escribo el periodo de gracia en meses {string}")
    public void escribo_el_periodo_de_gracia_en_meses(String periodoGraciaEnMeses) {
        theActorInTheSpotlight().attemptsTo(
                EscribirPasoDos.soloPeriodo(periodoGraciaEnMeses));
    }

    @Then("El sistema registra el periodo de gracia en meses correctamente")
    public void elSistemaRegistraElPeriodoDeGraciaEnMesesCorrectamente() {

    }

    @When("Selecciono el campo periodicidad de pago de intereses {string}")
    public void selecciono_el_campo_periodicidad_de_pago_de_intereses(String periodicidadPagoDeIntereses) {
        if (periodicidadPagoDeIntereses != null && !periodicidadPagoDeIntereses.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byVisibleText(periodicidadPagoDeIntereses).from(FormularioPasoDosPage.PERIODICIDAD_INTERES_DROPDOWN)
            );
        }
    }

    @Then("Selecciona el campo periodicidad pago de intereses correctamente")
    public void seleccionaElCampoPeriodicidadPagoDeInteresCorrectamente() {


    }

    @When("Selecciono el campo amortizacion de capital {string}")
    public void selecciono_el_campo_amortizacion_de_capital(String amortizacionDeCapital) {
        if (amortizacionDeCapital != null && !amortizacionDeCapital.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byVisibleText(amortizacionDeCapital).from(FormularioPasoDosPage.AMORTIZACION_CAPITAL_DROPDOWN)
            );
        }
    }

    @Then("Selecciona el campo amortizaion de capital correctamente")
    public void seleccionaElCampoAmortizaionDeCapitalCorrectamente() {

    }

    @When("Selecciono el tipo de garantia {string}")
    public void selecciono_el_tipo_de_garantia(String tipoDeGarantia) {
        if (tipoDeGarantia != null && !tipoDeGarantia.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byVisibleText(tipoDeGarantia).from(FormularioPasoDosPage.TIPO_GARANTIA_DROPDOWN)
            );
        }
    }

    @Then("Selecciona el tipo de garantia correctamente")
    public void seleccionaElTipoDeGarantiaCorrectamente() {
    }

    @When("Escribo el valor de la garantia {string}")
    public void escriboElValorDeLaGarantia(String valorGarantia) {
        theActorInTheSpotlight().attemptsTo(
                EscribValorGarantiaComisioNeg.soloValorGarantia(valorGarantia)
        );

    }

    @Then("El valor de la garantia se registra correctamente")
    public void elValorDeLaGarantiaSeRegistraCorrectamente() {

    }

    @When("Escribo el porcentaje de comisiones negociadas {string}")
    public void escriboElPorcentajeDeComisionesNegociadas(String comisionesNegociadas) {
        theActorInTheSpotlight().attemptsTo(
                EscribValorGarantiaComisioNeg.soloComisiones(comisionesNegociadas)
        );
    }

    @Then("Se registra el porcentaje de comisiones negociadas correctamente")
    public void seRegistraElPorcentajeDeComisionesNegociadasCorrectamente() {

    }

    @When("Selecciono el campo corresponde a una campana {string}")
    public void seleccionoElCampoCorrespondeAUnaCampana(String correspondeCampana) {
        if (correspondeCampana != null && !correspondeCampana.trim().isEmpty()) {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byVisibleText(correspondeCampana).from(FormularioPasoDosPage.CORRESPONDE_CAMPANA_DROPDOWN)
            );
        }
    }
}


















































































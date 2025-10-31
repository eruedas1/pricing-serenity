@all
Feature: Inicio de sesión y acceso a Pricing

  Background:
    Given "User" abre la página web
    When Inicia sesion con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    Then Estoy en la pagina uno de cuatro del cotizador

   #Caso 11
  @ValidCredentialsAndCotizador
   Scenario Outline: Seleccionar paso a paso cada item

    #Caso 11
    Given que estoy en la pantalla de registro
    When Oprimo tipo de identificación "<tipo>"
    Then debe seleccionar la opcion del tipo de identificación

   #Caso 12
    Given elijo el tipo de identificación "<tipo>"
    When redacto el numero de identificacion "<numero>"
    Then debe escribir el numero de identificacion

    #Caso 13
    Given copio el numero de identificacion "<numero>"
    When selecciono la opción de rol de cliente "<rolCliente>"
    Then el sistema debe registrar correctamente el rol seleccionado

    Examples:
      | tipo                  | numero     | rolCliente                  |
      | Cédula de Ciudadanía  | 9011654024 | Consorcio                   |




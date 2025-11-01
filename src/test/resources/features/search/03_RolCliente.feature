@rol
Feature: Inicio de sesión y acceso a Pricing

  Background:
    Given "User" abre la página web
    When Inicia sesion con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    Then Estoy en la pagina uno de cuatro del cotizador



   Scenario Outline: Seleccionar el Rol del cliente

    #Caso 3
    Given tomo el tipo de identificación "<tipo>"
    When copi el numero de identificacion "<numero>"
    And selecciono la opción de rol de cliente "<rolCliente>"
    Then el sistema debe registrar correctamente el rol seleccionado



   Examples:
     | tipo                  | numero     | rolCliente |
     | Cédula de Ciudadanía  | 9011654024 | Consorcio  |





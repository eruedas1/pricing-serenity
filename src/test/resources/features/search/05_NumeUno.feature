@numeuno
Feature: Inicio de sesión y acceso a Pricing

  Background:
    Given "User" abre la página web
    When Inicia sesion con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    Then Estoy en la pagina uno de cuatro del cotizador



   Scenario Outline: Escribir el segundp numero de identificacion

    #Caso 5
    Given tomo el tipo de identificación "<tipo>"
    When copi el numero de identificacion "<numero>"
    And selecciono opciones num "<rolCliente>" y "<tipoI>" y "<numeroI>"
    Then el sistema debe registrar correctamente el rol seleccionado



   Examples:
     | tipo | numero     | rolCliente | tipoI    | numeroI    |
     | Nit  | 9011654024 | Consorcio  | Nit      | 9011654024 |





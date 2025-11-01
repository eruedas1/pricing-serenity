@tipo
Feature: Inicio de sesión y acceso a Pricing

  Background:
    Given "User" abre la página web
    When Inicia sesion con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    Then Estoy en la pagina uno de cuatro del cotizador



   Scenario Outline: Seleccionar paso tipo identificacion Paso 1

    #Caso 1
    Given que estoy en la pantalla de registro
    When Oprimo tipo de identificación "<tipo>"
    Then debe seleccionar la opcion del tipo de identificación


   Examples:
     | tipo                  |
     | Cédula de Ciudadanía  |






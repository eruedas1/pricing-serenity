@numero
Feature: Inicio de sesión y acceso a Pricing

  Background:
    Given "User" abre la página web
    When Inicia sesion con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    Then Estoy en la pagina uno de cuatro del cotizador


   Scenario Outline: Escribir numero de identificacion Paso 1

   #Caso 2
    Given elijo el tipo de identificación "<tipo>"
    When redacto el numero de identificacion "<numero>"
    Then debe escribir el numero de identificacion


   Examples:
     | tipo                  | numero     |
     | Cédula de Ciudadanía  | 9011654024 |






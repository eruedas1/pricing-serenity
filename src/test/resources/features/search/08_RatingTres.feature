@ratitres
Feature: Inicio de sesión y acceso a Pricing

  Background:
    Given "User" abre la página web
    When Inicia sesion con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    Then Estoy en la pagina uno de cuatro del cotizador



   Scenario Outline: Seleccionar el Rating Tres

    #Caso 8
    Given tomo el tipo de identificación "<tipo>"
    When copi el numero de identificacion "<numero>"
    And selecciono opciones ratingtres "<rolCliente>" y "<tipoI>" y "<numeroI>" y "<ratinguno>" y "<ratingdos>" y "<ratingtres>"
    Then el sistema debe registrar correctamente el rating seleccionado

   Examples:
     | tipo | numero     | rolCliente | tipoI    | numeroI    | ratinguno | ratingdos | ratingtres |
     | Nit  | 9011654024 | Consorcio  | Nit      | 9011654024 | 1         | 9         | 5          |








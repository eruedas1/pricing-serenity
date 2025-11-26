@unitarios
Feature: Inicio de sesión y acceso a Pricing

  Background:
    Given "User" abre la página web
    When Inicia sesion con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    Then Estoy en la pagina uno de cuatro del cotizador

  Scenario: Seleccionar tipo de identificación - Cédula de Ciudadanía  ##Caso 1
    Given que estoy en la pantalla de registro
    When Oprimo tipo de identificación "Cedula de Ciudadanía"
    Then debe seleccionar la opcion del tipo de identificación


  Scenario: Escribir numero de identificacion Paso 1 ##Caso 2
    Given elijo el tipo de identificación "Cédula de Ciudadanía"
    When redacto el numero de identificacion "9011654024"
    Then debe escribir el numero de identificacion

  Scenario: Seleccionar el Rol del cliente     ##Caso 3
    Given tomo el tipo de identificación "Cédula de Ciudadanía"
    When copi el numero de identificacion "9011654024"
    And selecciono la opción de rol de cliente "Consorcio"
    Then el sistema debe registrar correctamente el rol seleccionado

  Scenario: Seleccionar tipo de indentificacion Dos   #Caso 4
    Given tomo el tipo de identificación "Cédula de Ciudadanía"
    When copi el numero de identificacion "9011654024"
    And selecciono opciones "Consorcio" y "Nit"
    Then el sistema debe registrar correctamente el rol seleccionado

  Scenario: Escribir el segundp numero de identificacion #Caso 5
    Given tomo el tipo de identificación "Cédula de Ciudadanía"
    When copi el numero de identificacion "9011654024"
    And selecciono opciones num "Consorcio" y "Nit" y "9011654024"
    Then el sistema debe registrar correctamente el rol seleccionado

  Scenario: Seleccionar el Rating Uno    #Caso 6
    Given tomo el tipo de identificación "Nit"
    When copi el numero de identificacion "9011654024"
    And selecciono opciones ratinguno "Consorcio" y "Nit" y "9011654024" y "1"
    Then el sistema debe registrar correctamente el rating seleccionado


  Scenario: Seleccionar el Rating Dos  #Caso 7
    Given tomo el tipo de identificación "Nit"
    When copi el numero de identificacion "9011654024"
    And selecciono opciones ratingdos "Consorcio" y "Nit" y "9011654024" y "1" y "9"
    Then el sistema debe registrar correctamente el rating seleccionado

  Scenario: Seleccionar el Rating Tres   #Caso 8
    Given tomo el tipo de identificación "Nit"
    When copi el numero de identificacion "9011654024"
    And selecciono opciones ratingtres "Consorcio" y "Nit" y "9011654024" y "1" y "9" y "5"
    Then el sistema debe registrar correctamente el rating seleccionado


  Scenario: Seleccionar el Rating Cuatro  #Caso 9
    Given tomo el tipo de identificación "Nit"
    When copi el numero de identificacion "9011654024"
    And Selecciono opciones requeridas "Consorcio" y "Nit" y "9011654024" y "1" y "9" y "5" y "4"
    Then el sistema debe registrar correctamente el rating seleccionado


  Scenario: Boton de cargar y continuar  #Caso 10
    Given tomo el tipo de identificación "Nit"
    When copi el numero de identificacion "9011654024"
    And Selecciono opciones requeridas "Consorcio" y "Nit" y "9011654024" y "1" y "9" y "5" y "4"
    And Debe realizar el flujo de cargar información y continuar
    Then el sistema debe registrar correctamente el rating seleccionado


  Scenario: Seleccionar tipo de identificación - Cédula de Ciudadanía  ##Caso 11
    Given que estoy en la pantalla de registro
    When Oprimo tipo de identificación "Nit"
    Then debe seleccionar la opcion del tipo de identificación


  Scenario: Seleccionar tipo de identificación - Cédula de Ciudadanía  ##Caso 12
    Given que estoy en la pantalla de registro
    When Oprimo tipo de identificación "Cédula de Extranjería"
    Then debe seleccionar la opcion del tipo de identificación

  Scenario: Seleccionar tipo de identificación - Cédula de Ciudadanía  ##Caso 13
    Given que estoy en la pantalla de registro
    When Oprimo tipo de identificación "Nit Persona Natural"
    Then debe seleccionar la opcion del tipo de identificación

  Scenario: Seleccionar tipo de identificación - Cédula de Ciudadanía  ##Caso 14
    Given que estoy en la pantalla de registro
    When Oprimo tipo de identificación "Registro Civil"
    Then debe seleccionar la opcion del tipo de identificación

  Scenario: Seleccionar tipo de identificación - Cédula de Ciudadanía  ##Caso 15
    Given que estoy en la pantalla de registro
    When Oprimo tipo de identificación "Nit Persona Extranjera"
    Then debe seleccionar la opcion del tipo de identificación

  Scenario: Seleccionar el Rol del cliente     ##Caso 16
    Given tomo el tipo de identificación "Nit"
    When copi el numero de identificacion "9011654024"
    And selecciono la opción de rol de cliente " Fideicomiso "
    Then el sistema debe registrar correctamente el rol seleccionado

  Scenario: Seleccionar el Rol del cliente     ##Caso 17
    Given tomo el tipo de identificación "Nit"
    When copi el numero de identificacion "9011654024"
    And selecciono la opción de rol de cliente "Patrimonio Autonomo"
    Then el sistema debe registrar correctamente el rol seleccionado

  Scenario: Seleccionar el Rol del cliente     ##Caso 18
    Given tomo el tipo de identificación "Nit"
    When copi el numero de identificacion "9011654024"
    And selecciono la opción de rol de cliente "Union Temporal"
    Then el sistema debe registrar correctamente el rol seleccionado

  Scenario: Seleccionar el Rol del cliente     ##Caso 19
    Given tomo el tipo de identificación "Nit"
    When copi el numero de identificacion "9011654024"
    And selecciono la opción de rol de cliente "No"
    Then el sistema debe registrar correctamente el rol seleccionado
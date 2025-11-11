@unitarios1
Feature: Flujo de cargar información y continuar

  Background:
    Given "User" abre la página web
    When Inicia sesion con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    And Estoy en la pagina uno de cuatro del cotizador
    And Selecciono la opcion tipo de identificacion "Nit"
    And Escribo el numero de identificacion "9011654024"
    And Selecciono opciones requeridas "Consorcio" y "Nit" y "9011654024" y "1" y "9" y "5" y "4"
    And Debe realizar el flujo de cargar información y continuar
    And Estoy en la pagina dos de cuatro del cotizador

  Scenario: Boton de valor de la operacion  #Caso 11
    Given Estoy en la pagina dos de cuatro del cotizador
    When Registro el valor de la operacion "100000000"
    Then Debe escrbir el valor de la operacion

  Scenario: Selecciono sustitucion y prorroga  #Caso 12
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    Then Debe seleccionar no en el campo sustitucion y prorroga

  Scenario: Selecciono el campo tipo de operacion  #Caso 13
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    And Selecciono el campo tipo de operacion "Constructor"
    Then Debe seleccionar constructor en el campo tipo de operacion

  Scenario: Selecciono el campo indice de referencia #Caso 14
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    And Selecciono el campo tipo de operacion "Constructor"
    And Selecciono el indice de referencia "IPC"
    Then Debe seleccionar IPC en el campo indice de referencia

  Scenario: Escribo el numero en el campo spread #Caso 15
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    And Selecciono todos los campos del paso dos "No" y "Constructor" y "IPC"
    And Escribo el numero en el campo spread "3"
    Then El sistema registra el numero spread correctamente

  Scenario: Escribo el plazo en meses  #Caso 16
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    And Selecciono todos los campos del paso dos "No" y "Constructor" y "IPC"
    And Escribo el numero en el campo spread "3"
    And Escribo el plazo en meses "36"
    Then El sistema registra el plazo en meses correctamente

  Scenario: Escribo el periodo de gracia en meses  #Caso 17
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    And Selecciono todos los campos del paso dos "No" y "Constructor" y "IPC"
    And Escribo el numero en el campo spread "3"
    And Escribo el plazo en meses "36"
    And Escribo el periodo de gracia en meses "0"
    Then El sistema registra el periodo de gracia en meses correctamente

  Scenario: Selecciona periodicidad pago de intereses #Caso 18
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    And Selecciono todos los campos del paso dos "No" y "Constructor" y "IPC"
    And Escribo en los campos requeridos "3" y "36" y "0"
    And Selecciono el campo periodicidad de pago de intereses "Mensual"
    Then Selecciona el campo periodicidad pago de intereses correctamente

  Scenario: Selecciona amortizacion de capital #Caso 19
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    And Selecciono todos los campos del paso dos "No" y "Constructor" y "IPC"
    And Escribo en los campos requeridos "3" y "36" y "0"
    And Selecciono el campo periodicidad de pago de intereses "Mensual"
    And Selecciono el campo amortizacion de capital "Mensual"
    Then Selecciona el campo amortizaion de capital correctamente

  Scenario: Selecciona el tipo de garantia #Caso 20
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    And Selecciono todos los campos del paso dos "No" y "Constructor" y "IPC"
    And Escribo en los campos requeridos "3" y "36" y "0"
    And Selecciono el campo periodicidad de pago de intereses "Mensual"
    And Selecciono el campo amortizacion de capital "Mensual"
    And Selecciono el tipo de garantia "Constructor"
    Then Selecciona el tipo de garantia correctamente

  Scenario: Escribo el valor de la garantia #Caso 21
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    And Selecciono todos los campos del paso dos "No" y "Constructor" y "IPC"
    And Escribo en los campos requeridos "3" y "36" y "0"
    And Selecciono todos los campos requeridos "Mensual" y "Mensual" y "Constructor"
    And Escribo el valor de la garantia "10000000"
    Then El valor de la garantia se registra correctamente

  Scenario: Escribo el porcentaje de comisiones negociadas #Caso 22
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    And Selecciono todos los campos del paso dos "No" y "Constructor" y "IPC"
    And Escribo en los campos requeridos "3" y "36" y "0"
    And Selecciono todos los campos requeridos "Mensual" y "Mensual" y "Constructor"
    And Escribo el valor de la garantia "10000000"
    And Escribo el porcentaje de comisiones negociadas "5"
    Then Se registra el porcentaje de comisiones negociadas correctamente

  Scenario: Selecciono corresponde a una campana #Caso 23
    Given Registro el valor de la operacion "100000000"
    When Selecciono el campos sustitucion y prorroga "No"
    And Selecciono todos los campos del paso dos "No" y "Constructor" y "IPC"
    And Escribo en los campos requeridos "3" y "36" y "0"
    And Selecciono todos los campos requeridos "Mensual" y "Mensual" y "Constructor"
    And Escribo en los siguientes campos "10000000" y "5"
    And Selecciono el campo corresponde a una campana "No"
    Then Doy click en continuar

















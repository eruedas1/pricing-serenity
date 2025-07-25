@all
Feature: Diligenciar Formato Cotizador

  @Formulario ##caso 7 Cotizador Paso 1 de 4  No
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar Cedula
    * Cliente Especial o Codeudor : seleccionar NO
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula.
    And Cliente Especial o Codeudor : seleccionar NO
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar


  @Formulario ##caso 8 Cotizador Paso 1 de 4  Consorcio
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar Cedula
    * Cliente Especial o Codeudor : seleccionar Consorcio
    * Tipo de Identificacion del consorciado: Cedula
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula.
    And Cliente Especial o Codeudor : seleccionar Consorcio
    And Tipo de Identificacion del consorciado: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar

  @Formulario ##caso 9 Cotizador Paso 1 de 4  Fidecomiso
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar Cedula
    * Cliente Especial o Codeudor : seleccionar Fidecomiso
    * Tipo de Identificacion del Fidecomitente: NIT.
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula.
    And Cliente Especial o Codeudor : seleccionar Fidecomiso
    And Tipo de Identificacion del Fidecomitente: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar

  @Formulario ##caso 10 Cotizador Paso 1 de 4   Patrimonio Autonomo
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar Cedula
    * Cliente Especial o Codeudor : seleccionar Patrimonio Autonomo
    * Tipo de Identificacion del Fidecomitente: Cedula
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula.
    And Cliente Especial o Codeudor : seleccionar Patrimonio Autonomo
    And Tipo de Identificacion del Fidecomitente: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar

  @Formulario ##caso 11 Cotizador Paso 1 de 4  Union Temporal
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar Cedula
    * Cliente Especial o Codeudor : seleccionar Union Temporal
    * Tipo de Identificacion Unionista: NIT
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula.
    And Cliente Especial o Codeudor : seleccionar Union Temporal
    And Tipo de Identificacion del Unionista: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar

  @Formulario ##caso 12 Cotizador Paso 1 de 4  Pagador
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar Cedula
    * Cliente Especial o Codeudor : seleccionar Pagador
    * Tipo de Identificacion Pagador: Cedula
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula.
    And Cliente Especial o Codeudor : seleccionar Pagador
    And Tipo de Identificacion del Pagador: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar

  @Formulario ##caso 13 Cotizador Paso 1 de 4  Codeudor
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar Cedula
    * Cliente Especial o Codeudor : seleccionar Codeudor
    * Tipo de Identificacion Codeudor: NIT
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula.
    And Cliente Especial o Codeudor : seleccionar Codeudor
    And Tipo de Identificacion del Codeudor: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar


  @Formulario ##caso 14 Cotizador Paso 2 de 4
  Scenario: Diligenciar el formato cotizador del paso 2 de 4 con cedula de ciudadania.
    Given Que en el paso 1 de 4 se dio click en continuar para pasar al paso 2 del formato cotizador
    When Se encuentre en el formato cotizador del paso 2 de 4
    And Diligencie todos los campos correctamente.
    Then Da click en continuar y ve el mensaje de Finalizado.

  @Formulario
  Scenario: ##caso 15 Mensaje Finalizado.
    Given Que en el paso 2 de 4 se dio click en continuar
    When Se encuentre el mensaje de finalizado
    Then Da click en continuar para pasar al paso 3 de 4 del formato cotizador.

  @Formulario
  Scenario: ##caso 16 Cotizador Paso 3 de 4
    Given Que en el mensaje de finalizado dio click en continuar
    When Se encuentre en el formato cotizador del paso 3 de 4
    And Seleccione la opcion Cotizacion 1
    Then Da click en guardar y continuar para pasar al mensaje solicitar aprobacion.

  @Formulario
  Scenario: ##caso 17 Solicitar Aprobacion
    Given Que en el paso 3 de 4 dio click en guardar y continuar
    When Se encuentre en el mensaje solicitar aprobacion
    And Diligencie un comentario
    Then Da click en guardar y continuar para pasar al formato DCC FOR 130.

  @Formulario
  Scenario: Diligenciar Formato DCC FOR 130 Paso 1 de 2      ##caso 18
    Given Que en el mensaje solicitar aprobacion se dio click en guardar y continuar
    When estemos en el paso 1 de 2 del formato DCC FOR 130
    And Diligenciemos los campos requeridos
    Then Da click en siguiente para pasar al paso 2 de 2 del formato DCC FOR 130

  @Formulario
  Scenario: Diligenciar Formato DCC FOR 130 Paso 2 de 2       ##caso 19
    Given Se dio click en siguiente para pasar al paso 2 de 2 del formato DCC FOR 130
    When estemos en el paso 2 de 2 del formato DCC FOR 130
    And Diligenciemos los campos requeridos
    Then Da click en siguiente para pasar al mensaje solicitud de cotizacion exitosa

  @Formulario
  Scenario: Solicitud de Cotizacion Exitosa         ##caso 20
    Given Se dio click en siguiente para pasar al mensaje solicitud de cotizacion exitosa
    When estemos en este recuadro donde se ven los correos a los que se enviara la solicitud
    Then Da click en siguiente para pasar al mensaje solicitud enviada.
@all
Feature: Diligenciar Formato Cotizador con Nit

  @Formulario ##caso 21 Cotizador Paso 1 de 4  No
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar NIT
    * Cliente Especial o Codeudor : seleccionar NO
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula.
    And Cliente Especial o Codeudor : seleccionar NO
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar


  @Formulario ##caso 22 Cotizador Paso 1 de 4  Consorcio
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar NIT
    * Cliente Especial o Codeudor : seleccionar Consorcio
    * Tipo de Identificacion del consorciado: Cedula
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula.
    And Cliente Especial o Codeudor : seleccionar Consorcio
    And Tipo de Identificacion del consorciado: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar

  @Formulario ##caso 23 Cotizador Paso 1 de 4  Fidecomiso
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar NIT
    * Cliente Especial o Codeudor : seleccionar Fidecomiso
    * Tipo de Identificacion del Fidecomitente: NIT.
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula.
    And Cliente Especial o Codeudor : seleccionar Fidecomiso
    And Tipo de Identificacion del Fidecomitente: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar

  @Formulario ##caso 24 Cotizador Paso 1 de 4   Patrimonio Autonomo
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar NIT
    * Cliente Especial o Codeudor : seleccionar Patrimonio Autonomo
    * Tipo de Identificacion del Fidecomitente: Cedula
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula.
    And Cliente Especial o Codeudor : seleccionar Patrimonio Autonomo
    And Tipo de Identificacion del Fidecomitente: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar

  @Formulario ##caso 25 Cotizador Paso 1 de 4  Union Temporal
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar NIT
    * Cliente Especial o Codeudor : seleccionar Union Temporal
    * Tipo de Identificacion Unionista: NIT
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula
    And Cliente Especial o Codeudor : seleccionar Union Temporal
    And Tipo de Identificacion del Unionista: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar

  @Formulario ##caso 26 Cotizador Paso 1 de 4  Pagador
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar NIT
    * Cliente Especial o Codeudor : seleccionar Pagador
    * Tipo de Identificacion Pagador: Cedula
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula
    And Cliente Especial o Codeudor : seleccionar Pagador
    And Tipo de Identificacion del Pagador: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar

  @Formulario ##caso 27 Cotizador Paso 1 de 4  Codeudor
  Scenario: En la pagina 1 de 4 Cotizador
    * Tipo de identificacion del cliente :seleccionar NIT
    * Cliente Especial o Codeudor : seleccionar Codeudor
    * Tipo de Identificacion Codeudor: NIT
    Given  Que estoy en la pagina 1 de 4 del cotizador
    When Diligencio el campo Tipo de identificacion del cliente: Cedula
    And Cliente Especial o Codeudor : seleccionar Codeudor
    And Tipo de Identificacion del Codeudor: Cedula o NIT
    And Rating Financiero Cliente: Seleccionar 4 numeros aleatorios
    And Doy click en Cargar Informacion
    Then Click en continuar


  @Formulario ##caso 28 Cotizador Paso 2 de 4
  Scenario: Diligenciar el formato cotizador del paso 2 de 4 con NIT.
    Given Se encuentre en el formato cotizador del paso 2 de 4
    When Diligencio el campo Valor Operacion
    And Seleccionar en el campo Sustitución y/o prórroga la opcion "SI"
    And Seleccionar en el campo Tipo de Operación "Constructor"
    And Seleccionar en el campo Índice de Referencia "DTF"
    And Diligenciar en el campo Tasa fija "30"
    And Diligenciar en el campo Plazo en meses "240"
    And Diligenciar en el campo Periodo de Gracia en meses "12"
    And Seleccionar en el campo Periodicidad pago de intereses "Mensual"
    And Seleccionar en el campo Amortización de capital "Mensual"
    And Seleccionar en el campo Tipo de garantía "Colateral Financiero"
    And Diligenciar en el campo Valor de la garantía "30000"
    And Diligenciar en el campo Comisiones negociadas "5"
    And Seleccionar en el campo Corresponde a una campaña "Si"
    And Seleccionar en el campo Campaña "Retencion"
    Then Da click en continuar con el mensaje de Finalizado.

  @Formulario
  Scenario: ##caso 29 Mensaje Finalizado.
    Given Que en el paso 2 de 4 se dio click en continuar
    When Se encuentre el mensaje de finalizado
    Then Da click en continuar para pasar al paso 3 de 4 del formato cotizador.

  @Formulario
  Scenario: ##caso 30 Cotizador Paso 3 de 4
    Given Que estoy en el paso 3 de 4 del formato cotizador
    When Seleccione la opcion Cotizacion 1
    Then Da click en guardar & continuar para pasar al mensaje solicitar aprobacion.



    ##
 # @Formulario
  ##Scenario: ##caso 31 Solicitar Aprobacion
   ## Given Que en el paso 3 de 4 dio click en guardar & continuar
   ## When Se encuentre en el mensaje solicitar aprobacion
  ##  And Diligencie un comentario "Listo"
  ##  Then Dar click en guardar & continuar para pasar al formato DCC FOR 130.

 ## @Formulario
 ## Scenario: ##caso 32 Diligenciar Formato DCC FOR 130 Paso 1 de 2      ##caso 18
  ##  Given Estemos en el paso 1 de 2 del formato DCC FOR 130
  ##  When Seleccionar en el campo Calificacion CIFIN "A"
  ##  And Seleccionar en el campo Semaforo "Amarillo"
  ##  And Seleccionar en el campo Tipo operacion "Anticipo de Leasing"
  ##  And Seleccionar en el campo Desembolso "Aumento de cupo"
   ## And Seleccionar en el campo Tasa anterior "DTF"
  ##  And Diligencar en el campo Spread anterior "5"
    ##And Diligenciar en el campo Num. credito anterior "10021459745"
   ## And Diligenciar en el campo Clase de Garantia "listo"
   ## Then Da click en siguiente para pasar al paso 2 de 2 del formato DCC FOR 130

 ## @Formulario
##  Scenario: ##caso 33 Diligenciar Formato DCC FOR 130 Paso 2 de 2       ##caso 19
  ##  Given Estemos en el paso 2 de 2 del formato DCC FOR 130
  ####  When Seleccionar en el campo Monto "Si"
  ##  And Seleccionar en el campo Nivel atribucion (Monto) "Gerente Comercial"
 ####   And Seleccionar en el campo Excepcion "No"
  ##  And Diligenciar en el campo LEA "1000000"
  ##  And Diligenciar en el campo Total Utilizado "1000000"
  ####  And Diligenciar en el campo Monto aprobado familia "1000000"
 ##   And Seleccionar en el campo Realizo visita comercial  "Si"
  ##  And Seleccionar en el campo Se revisi CIFIN  "Si"
  ##  And Diligenciar en el campo Fecha de corte  "21/07/2025"
   ## And Diligenciar en el campo Recomendación Comercial para el desembolso  "Si"
  ##  Then Da click en siguiente para pasar al mensaje solicitud de cotizacion exitosa

 ## @Formulario
 ## Scenario: ##caso 34 Solicitud de Cotizacion Exitosa         ##caso 20
  ##  Given Se dio click en siguiente para pasar al mensaje solicitud de cotizacion exitosa
  ##  When Estemos en este recuadro donde se ven los correos a los que se enviara la solicitud
  ##  Then Da click en siguiente para pasar al mensaje solicitud enviada.
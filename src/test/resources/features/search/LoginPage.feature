@all
Feature: Inicio de sesión y acceso a Pricing

  Background:
    Given "User" abre la página web
    When Inicia sesion con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    Then Estoy en la pagina uno de cuatro del cotizador


  @ValidCredentialsAndCotizador
  Scenario Outline: Registro de formulario uno de cotizador con tipo de identificacion
    # Paso 1
    Given Selecciono la opcion tipo de identificacion "<tipo>"
    When Escribo el numero de identificacion "<numero>"
    And Selecciono opciones requeridas "<rolCliente>" y "<tipoI>" y "<numeroI>" y "<ratinguno>" y "<ratingdos>" y "<ratingtres>" y "<ratingcuatro>"
    And Debe realizar el flujo de cargar información y continuar
    Then Estoy en la pagina dos de cuatro del cotizador

  # Paso 2
    Given Escribo el valor operacion "<valorOperacion>"
    When Selecciono todos los campos del paso dos "<SustiyProrroga>" y "<tipoOperacion>" y "<indiceReferencia>"
    And Escribo en los campos requeridos "<spread>" y "<plazoMeses>" y "<periodoGraciaEnMeses>"
    And Selecciono todos los campos requeridos "<periodicidadPagoDeIntereses>" y "<amortizacionDeCapital>" y "<tipoDeGarantia>"
    And Escribo en los siguientes campos "<valorGarantia>" y "<comisionesNegociadas>"
    And Selecciono en el campo "<correspondeCampana>"
    Then Doy click en continuar

    #Paso 3
    Given Selecciono el radiobutton con el texto  Cotizacion
    When Doy click en el boton Guardar y continuar del paso tres
    And Escribo un comentario opcional
    Then Doy nuevamente click al boton Guardar y Continuar

    #Paso DCC FOR 130
    Given Selecciono la opcion de Semaforo y CIFIN "<Semaforo>" y "<CIFIN>"
    When Selecciono el campo Tipo operacion "<TipoOperacion>"
    And Selecciono la opcion Desembolso "<Desembolso>"
    Then Doy click en el boton Siguiente

    #Paso2 DCC FOR 130
    Given Selecciono la opcion de Monto y Excepcion "<Monto>" y "<Exepcion>"
    When Escribo en el campo LEA y total utilizado y monto aprobado "<LEA>" y "<TotalUtilizado>" y "<MontoAprobado>"
    And Selecciono la opcion Desembolso Realizo visita comercial y reviso cifin y fecha de corte "<RealizoVisitaComercial>" y "<RevisoCifin>" y "<FechadeCorte>"
    And Escribo un comentario en Observaciones y Recomendacion
    And Doy click en el boton Siguiente para finalizar
    Then Doy click en continuar correos

    Examples:
      | tipo                  | numero     | rolCliente                  | tipoI    | numeroI    | ratinguno | ratingdos | ratingtres | ratingcuatro | valorOperacion | SustiyProrroga | tipoOperacion | indiceReferencia | spread | plazoMeses |periodoGraciaEnMeses |periodicidadPagoDeIntereses |amortizacionDeCapital |tipoDeGarantia |valorGarantia |comisionesNegociadas |correspondeCampana | Semaforo | CIFIN | TipoOperacion | Desembolso |Monto|Exepcion|LEA    |TotalUtilizado|MontoAprobado|RealizoVisitaComercial|RevisoCifin|FechadeCorte|
      | Nit                   | 9011654024 | Consorcio                   | Nit      | 9011654024 | 1         | 2         | 3          | 4            | 100000000      | No             | Constructor   | IPC              | 3      | 36         |0                    |Mensual                     |Mensual               |Constructor    |10000000      |5                    |No                 | Amarillo | A     |Bancoldex     | Nuevo       |No   | No     |1000000|  1000000     |1000000      |Si                    |Si         |09/10/2025  |
      | Nit                   | 9011654024 | Fideicomiso                 | Nit      | 9011654024 | 1         | 2         | 3          | 4            | 100000000      | No             | Constructor   | IPC              | 3      | 36         |0                    |Mensual                     |Mensual               |Constructor    |10000000      |5                    |No                 | Amarillo | A     |Bancoldex     | Nuevo       |No   | No     |1000000|  1000000     |1000000      |Si                    |Si         |09/10/2025  |
      | Nit                   | 9011654024 | Patrimonio Autonomo         | Nit      | 9011654024 | 1         | 2         | 3          | 4            | 100000000      | No             | Constructor   | IPC              | 3      | 36         |0                    |Mensual                     |Mensual               |Constructor    |10000000      |5                    |No                 | Amarillo | A     |Bancoldex     | Nuevo       |No   | No     |1000000|  1000000     |1000000      |Si                    |Si         |09/10/2025  |
      | Nit                   | 9011654024 | Union Temporal              | Nit      | 9011654024 | 1         | 2         | 3          | 4            | 100000000      | No             | Constructor   | IPC              | 3      | 36         |0                    |Mensual                     |Mensual               |Constructor    |10000000      |5                    |No                 | Amarillo | A     |Bancoldex     | Nuevo       |No   | No     |1000000|  1000000     |1000000      |Si                    |Si         |09/10/2025  |
      | Nit                   | 9011654024 | Pagador                     | Nit      | 9011654024 | 1         | 2         | 3          | 4            | 100000000      | No             | Constructor   | IPC              | 3      | 36         |0                    |Mensual                     |Mensual               |Constructor    |10000000      |5                    |No                 | Amarillo | A     |Bancoldex     | Nuevo       |No   | No     |1000000|  1000000     |1000000      |Si                    |Si         |09/10/2025  |
      | Cédula de Ciudadanía  | 91235325   | No                          |          |            | 1         | 2         | 3          | 4            | 100000000      | No             | Constructor   | IPC              | 3      | 36         |0                    |Mensual                     |Mensual               |Constructor    |10000000      |5                    |No                 | Amarillo | A     |Bancoldex     | Nuevo       |No   | No     |1000000|  1000000     |1000000      |Si                    |Si         |09/10/2025  |
      | Cédula de Ciudadanía  | 91235325   | Consorcio                   | Nit      | 9011654024 | 1         | 2         | 3          | 4            | 100000000      | No             | Constructor   | IPC              | 3      | 36         |0                    |Mensual                     |Mensual               |Constructor    |10000000      |5                    |No                 | Amarillo | A     |Bancoldex     | Nuevo       |No   | No     |1000000|  1000000     |1000000      |Si                    |Si         |09/10/2025  |
      | Cédula de Ciudadanía  | 91235325   | Fideicomiso                 | Nit      | 9011654024 | 1         | 2         | 3          | 4            | 100000000      | No             | Constructor   | IPC              | 3      | 36         |0                    |Mensual                     |Mensual               |Constructor    |10000000      |5                    |No                 | Amarillo | A     |Bancoldex     | Nuevo       |No   | No     |1000000|  1000000     |1000000      |Si                    |Si         |09/10/2025  |
      | Cédula de Ciudadanía  | 91235325   | Patrimonio Autonomo         | Nit      | 9011654024 | 1         | 2         | 3          | 4            | 100000000      | No             | Constructor   | IPC              | 3      | 36         |0                    |Mensual                     |Mensual               |Constructor    |10000000      |5                    |No                 | Amarillo | A     |Bancoldex     | Nuevo       |No   | No     |1000000|  1000000     |1000000      |Si                    |Si         |09/10/2025  |



















#📄 Documentación Archivo: LoginPage.feature
#
#📌 Descripción General:
#
#Este archivo define escenarios de prueba de comportamiento (BDD) para la funcionalidad de login del sistema HRM (Human Resource Management).
# Usa el lenguaje Gherkin, lo cual permite una lectura clara y estructurada tanto para testers como para stakeholders no técnicos.
#
#🎯 Propósito:
#Validar distintos comportamientos del sistema cuando un usuario intenta iniciar sesión con diferentes combinaciones de credenciales.
#⚙️ ¿Por qué se implementa?
#Se implementa para automatizar pruebas funcionales sobre el módulo de autenticación de la aplicación, asegurando que los mensajes y flujos de
# login se comporten correctamente con distintos tipos de entradas:
#Credenciales válidas.
#Usuario inválido.
#Usuario vacío.
#Contraseña vacía.
#
#🧩 Estructura y Dependencias:
#
#Cada paso (Given, When, Then) está vinculado con métodos en clases Java conocidas como Step Definitions, las cuales implementan la
# lógica que ejecuta lo descrito en los escenarios. Estas definiciones están escritas normalmente en clases como:
#
#LoginPageDefinitions.java
#
#LoginActions.java
#
#LoginValidation.java
#
#
#Además, interactúa con clases de Screenplay como:
#
#Tasks → para acciones como abrir la página o iniciar sesión.
#
#Questions → para validar resultados esperados.
#
#UI Elements → para ubicar campos de usuario, contraseña y mensajes de error.
#
#
#
#---
#
#📚 Escenarios definidos:
#
#✅ @ValidCredentials
#
#Objetivo: Verificar que el usuario pueda iniciar sesión exitosamente con las credenciales correctas.
#
#❌ @InValidCredentials
#
#Objetivo: Validar que el sistema muestre el mensaje de error "Invalid credentials" si se ingresa un usuario o contraseña incorrecta.
#
#⚠️ @BlankUsername
#
#Objetivo: Validar que el sistema exija el nombre de usuario cuando se deja en blanco y muestre "Required" debajo del campo de usuario.
#
#⚠️ @BlankPassword
#
#Objetivo: Validar que el sistema exija la contraseña cuando se deja en blanco y muestre "Required" debajo del campo de contraseña.
#
#
#---
#
#🔗 Clases relacionadas:
#
#Este archivo .feature depende de:
#
#LoginPageDefinitions.java → Implementa los pasos Given, When, Then.
#
#OpenWebPage, DoLogin, ValidateErrorMessages → Clases Task y Question que modelan la lógica del login.
#
#LoginPage.java → Clase PageObject que contiene los localizadores de elementos web.
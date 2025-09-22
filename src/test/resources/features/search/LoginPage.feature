@all
Feature: Inicio de sesión y acceso a Pricing

  Background:
    Given "User" abre la página web
    When Inicia sesion con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    Then Estoy en la pagina uno de cuatro del cotizador

<<<<<<< HEAD
  @ValidCredentialsAndCotizador  ##caso 7
  Scenario Outline: Registro de formulario uno de cotizador con tipo de identificacion nit
    Given Selecciono la opcion tipo de identificacion "<tipo>"
    When Escribo el numero de identificacion "<numero>"
    And Selecciono si es Cliente Especial o Codeudor "<rolCliente>"
    And Selecciono opciones requeridas "<tipoI>" y "<numeroI>"
=======
  ##caso 7
  Scenario: Registro de formulario uno de cotizador con tipo de identificacion nit
    Given Selecciono la opcion tipo de identificacion
    When Escribo el numero de identificacion "9011654024"
    And Selecciono si es Cliente Especial o Codeudor
>>>>>>> origin/main
    And En Rating Financiero Cliente selecciono los campos indicados
    And Debe darle click al boton en  Cargar información
    And Debe verificar que existen los campos
    And Dar click en el boton continuar en paso uno
    Then Estoy en la pagina dos de cuatro del cotizador

<<<<<<< HEAD
    Examples:
      | tipo | numero     | rolCliente          | tipoI                | numeroI    |
      | Nit  | 9011654024 | No                  |                      |            |
      | Nit  | 9011654024 | Consorcio           | Nit                  | 9011654024 |
      | Nit  | 9011654024 | Fideicomiso         | Nit                  | 9011654024 |
      | Nit  | 9011654024 | Patrimonio Autonomo | Nit                  | 9011654024 |
      | Nit  | 9011654024 | Union Temporal      | Nit                  | 9011654024 |
      | Nit  | 9011654024 | Pagador             | Nit                  | 9011654024 |


=======
  ##caso 8 Scenario: Registro de formulario uno de cotizador con tipo de identificacion nit
    Given Escribo el valor operacion "100000000"
    When Selecciono sustitucion o prorroga
    And Selecciono el tipo de operacion
    And Selecciono el indice de referencia
    And Escribo el spread "3.10"
    And Escribo el plazo en meses "36"
    And Escribo el periodo de gracia "2"
    And Selecciono la periodicidad pago de intereses
    And Selecciono amortizacion de capital
    And Selecciono tipo de garantia
    And Escribo el valor de la garantia "50000000"
    And Escribo el valor de las comisiones negociadas "10"
    And Selecciono corresponde a una campana
    And Doy click en continuar
    Then Aparece mensaje finalizado
>>>>>>> origin/main




























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
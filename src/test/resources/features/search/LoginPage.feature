@all
Feature: Inicio de sesión y acceso a Pricing

  @ValidCredentialsAndCotizador @ignore  #caso 1 @ignore
  Scenario: Inicio de  sesión con credenciales validas
    Given "User" abre la página web
    When Inicia sesión con sus credenciales
    And Debe darle click al boton de pricing
    Then Debe iniciar sesion correctamente a pricing

  @ValidCredentialsAndCotizador @ignore  ##caso 2
  Scenario: Inicio de  sesión con correo invalido
    Given "User" abre la página web
    When Inicia sesión con sus credenciales invalidas correo
    Then Debe ver el mensaje de error "Invalid credentials"

  @ValidCredentialsAndCotizador @ignore  ##caso 3
  Scenario: Inicio de  sesión con clave invalida
    Given "User" abre la página web
    When Inicia sesión con sus credenciales invalidas clave
    Then Debe ver el mensaje de error "Invalid credentials"

  @ValidCredentialsAndCotizador  @ignore  ##caso 4
  Scenario: Inicio de sesión con nombre de usuario en blanco
    Given "User" abre la página web
    When Inicia sesión con sus credenciales correo en blanco
    Then Debe ver el mensaje de error "Required" debajo del nombre de usuario

  @ValidCredentialsAndCotizador @ignore ##caso 5
  Scenario: Inicio de  sesión con clave en blanco
    Given "User" abre la página web
    When Intenta Iniciar sesión con sus credenciales contrasena en blanco
    Then Debe ver el mensaje de error "Required" debajo de la contrasena


  @ValidCredentialsAndCotizador @ignore ##caso 6
  Scenario: Usuario inicia sesion  accede al formulario
    Given "User" abre la página web
    When Inicia sesión con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    Then Debe entrar a la pagina del formulario



  @ValidCredentialsAndCotizador ##caso 7
  Scenario: Registro de formulario uno de cotizador con tipo de identificacion nit
    Given "User" abre la página web
    When Inicia sesión con sus credenciales
    And Debe iniciar sesion correctamente
    And Debe darle click al boton de pricing
    And Debe darle click al boton de cotizador
    And Estoy en la pagina uno de cuatro del cotizador
    And Selecciono la opcion tipo de identificacion
    And Escribo el numero de identificacion "9011654024"
    And Selecciono si es Cliente Especial o Codeudor
    And En Rating Financiero Cliente selecciono los campos indicados
    And Debe darle click al boton en Cargar Informacion
   # Then Dar Click en continuar























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
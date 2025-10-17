@all
Feature: Inicio de sesión y acceso a Pricing


  @ValidCredentialsAndCotizador ##caso 1
  Scenario: Inicio de  sesión con correo invalido
    Given "User" abre la página web
    When Inicia sesión con sus credenciales invalidas correo
    Then Debe ver el mensaje de error "Invalid credentials"

  @ValidCredentialsAndCotizador ##caso 2
  Scenario: Inicio de  sesión con clave invalida
    Given "User" abre la página web
    When Inicia sesión con sus credenciales invalidas clave
    Then Debe ver el mensaje de error "Invalid credentials"

  @ValidCredentialsAndCotizador ##caso 3
  Scenario: Inicio de sesión con nombre de usuario en blanco
    Given "User" abre la página web
    When Inicia sesión con sus credenciales correo en blanco
    Then Debe ver el mensaje de error "Required" debajo del nombre de usuario

  @ValidCredentialsAndCotizador ##caso 4
  Scenario: Inicio de  sesión con clave en blanco
    Given "User" abre la página web
    When Intenta Iniciar sesión con sus credenciales contrasena en blanco
    Then Debe ver el mensaje de error "Required" debajo de la contrasena

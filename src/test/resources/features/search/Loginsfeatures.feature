@excep
Feature: Inicio de sesión y acceso a Pricing

 # Caso 30

  Scenario: Inicio de  sesión con correo invalido
    Given "User" abre la página web
    When Inicia sesión con sus credenciales invalidas correo
    Then Debe ver el mensaje de error "Invalid credentials"
 # Caso 31

  Scenario: Inicio de  sesión con clave invalida
    Given "User" abre la página web
    When Inicia sesión con sus credenciales invalidas clave
    Then Debe ver el mensaje de error "Invalid credentials"
# Caso 32

  Scenario: Inicio de sesión con nombre de usuario en blanco
    Given "User" abre la página web
    When Inicia sesión con sus credenciales correo en blanco
    Then Debe ver el mensaje de error "Required" debajo del nombre de usuario
# Caso 33

  Scenario: Inicio de  sesión con clave en blanco
    Given "User" abre la página web
    When Intenta Iniciar sesión con sus credenciales contrasena en blanco
    Then Debe ver el mensaje de error "Required" debajo de la contrasena


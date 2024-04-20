Feature: Validacion de funcionalidades de pagina automationpractice


  #1. Validar en la pagina pricincipal en el footer se visualice la información de direccion, telefono, email para contacto de la empresa

  #2. Validar en pantalla principal el correcto funcionamiento el buscador Search al realizar una busqueda

  #3. Validar el funcionamiento de boton sign in visualizando el form de creación de una cuenta Resolve

  #4. Validar el funcionamiento de boton Forgot your pass visualizando el form recuperación

  # todos se colfgaaorn en el examen de autoamtización :XD

  Background: Validar el funcionamiento de boton sign in visualizando el form de creación de una cuenta


  @tercerTest
  Scenario: ingresar a sing in validar formulario
    Given Marlon Ingresa a la pagina automationpractice
    When realiza clic en Sign in
    Then se debe visualizar el formualrio de creación de cuenta

  @segundoTest
  Scenario: Validar el funcionamiento del buscador
    Given Sebastian Ingresa a la pagina automationpracticee
    When realiza un busqueda
    Then se debe visualizar la pantalla de resultados


  @primerTest
  Scenario: Validar los elementos del footer
    Given Clara Ingresa a la pagina automationpractice
    When hace scroll hasta el footer de la pagina
    Then se muestran los elementos del footer
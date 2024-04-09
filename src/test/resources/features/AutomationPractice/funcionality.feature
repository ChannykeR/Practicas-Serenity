Feature: Validacion de funcionalidades de pagina automationpractice


  #1. Validar en la pagina pricincipal en el footer se visualice la información de direccion, telefono, email para contacto de la empresa

  #2. Validar en pantalla principal el correcto funcionamiento el buscador Search al realizar una busqueda

  #3. Validar el funcionamiento de boton sign in visualizando el form de creación de una cuenta Resolve

  #4. Validar el funcionamiento de boton Forgot your pass visualizando el form recuperación

  # todos se colfgaaorn en el examen de autoamtización :XD

 #Background: Validar en pantalla principal el correcto funcionamiento

  @tercerTest
  Scenario: ingresar a sing in validar formulario
    Given Miguel  Ingresa a la pagina automationpractice
    When realiza una busqueda
    Then se debe visualizar los resultados de la busqueda

  @TercerTest
  Scenario:
    Given Marlon Ingresa a la pagina automationpractice
    When realiza clic en Sign in
    Then se debe visualizar el formualrio de creación de cuenta



  @ForgotYourPass
  Scenario: Validar el funcionamiento de boton Forgot your pass visualizando el form recuperación
    Given pepito Ingresa a la pagina automationpractice
    When  quieres recuperar la clave
    And   Da clic en  el botón forgot your password
    #Then  Visualiza el formulario para la recuperación de la contraseña
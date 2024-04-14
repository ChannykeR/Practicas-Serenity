Feature: Validacion de funcionalidades de pagina automationpractice

  descripcion adicional


  #1. Validar en la pagina pricincipal en el footer se visualice la información de direccion, telefono, email para contacto de la empresa

  #2. Validar en pantalla principal el correcto funcionamiento el buscador Search al realizar una busqueda

  #3. Validar el funcionamiento de boton sign in visualizando el form de creación de una cuenta Resolve

  #4. Validar el funcionamiento de boton Forgot your pass visualizando el form recuperación

  # todos se colfgaaorn en el examen de autoamtización :XD

  Background: Validar el funcionamiento de boton sign in visualizando el form de creación de una cuenta


  @tercerTest @test
  Scenario: ingresar a sing in validar formulario automationpractice
    Given Marlon Ingresa a la pagina "http://www.automationpractice.pl/index.php"
    When realiza clic en Sign in
    Then se debe visualizar el formualrio de creación de cuenta

  @tercerTest @test
  Scenario: ingresar a sing in validar formulario demoqa
    Given Lorena Ingresa a la pagina "https://demoqa.com/"






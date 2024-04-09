Feature: Automatizar todos los flujos que inician desde el home.


  @FailedCredentials
  Scenario: Validar el mensaje de error por ingreso de credenciales fallidas
    Given Pepita ingresa a la pagina automationpractice
    When  Se ingresa las credenciales incorrecta
    Then  Mostrará el pop up de error
Feature: Validacion de los diferentes escenarios en la seccion de Elements

  Background: Ingresar al Home de la pagina
    Given PepeQa tiene acceso a la pagina DemoQa


  @CompleteFormTextBox
  Scenario: validar los campos de la sección de TextBox
    And direcciona a la seccion de TextBox
    When completa los campos solicitados
    Then valida la informacion llenada
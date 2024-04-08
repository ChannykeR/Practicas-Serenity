Feature: Búsqueda en Google

  Background: Búsqueda en Google
    Given Ingreso al navegador Google chrome

  @Test
  Scenario Outline: Busqueda simple en Google
    When Se introduce la palabra de búsqueda <texto>
    Then Se muestra la búsqueda de  <texto>
    Examples:
      | texto         |
      | Uso de GitHub |
      | Clima         |

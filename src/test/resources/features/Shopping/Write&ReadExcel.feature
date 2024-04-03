Feature: Ingresar a la web y realizar búsqueda en el cuador de texto

  @SearchTextWithExcel
  Scenario: Validar búsqueda ingresando texto el el cuadro de busqueda
    Given Ana ingresa a la tienda online
    When ingresa el texto en el cuadro de búsqueda
    Then se debe mostrar la cantidad de resultados encontrado sea igual a 7


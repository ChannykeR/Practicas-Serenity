Feature: Automatizaciones sobre la pantalla del Home


 Background: validar tatata
   Given Laura ingresa a la pagina de automationpractice


  @RedirectionToTshirtButton
  Scenario: Validar la seleccion de TSHIRT y su correcta redireccion
    When da clic al boton de TSHIRTS
    Then que se muestre la pantalla esperada

  @searchDress
  Scenario: Validar busqueda en el Home
    When se realiza una busqueda de Dress en el cuadro de busqueda
    Then Se muestre la pantalla con los resultados esperados

  @laura
  Scenario: Validar boton Best Sellers
    When  Se da clic al boton de Best sellers
    Then Se desplazan las diferentes opciones




















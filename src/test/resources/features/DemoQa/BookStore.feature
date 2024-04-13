Feature: Automatizacion sobre los flujos de el modulo de Books Store Application

  @ValidateTableResults
  Scenario Outline: Realizar valicacion de los resultados del modulo de Book Store
    Given Fernanda tiene acceso a la pagina de DemoQa
    When da clic en la seccion de BookStore
  #  Then se valida que en la lista bajo cada cabecera <Imagen>, <Title>, <Author>, <Publisher>
    Examples:
      | Imagen                                   | Title            | Author               | Publisher      |
      | https://demoqa.com/images/bookimage0.jpg | Git Pocket Guide | Richard E. Silverman | O'Reilly Media |
    #  | https://demoqa.com/images/bookimage1.jpg | Learning JavaScript Design Patterns | Addy Osmani          | O'Reilly Media |



Feature: Validar la lista de Book Store

  @ValidateBookStore
  Scenario Outline: Realizar validacion de los resultados del modulo de Book Store
    Given Maria tiene acceso a la pagina de DemoQA
    When Da clic en la secció de BookStore
    Then se valida que en la lista bajo cada cabecera <Imagen>, <Title>, <Author>, <Publisher>
    Examples:
      | Imagen                                   | Title                                      | Author             | Publisher      |
      | https://demoqa.com/images/bookimage2.jpg | TDesigning Evolvable Web APIs with ASP.NET | Glenn Block et al. | O'Reilly Media |
      | https://demoqa.com/images/bookimage3.jpg | Speaking JavaScript                        | Axel Rauschmayer   | O'Reilly Media |


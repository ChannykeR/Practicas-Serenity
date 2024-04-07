Feature: Validacion de flujos generales en la pangina de MyShop

    Background: Ingresar a la pagina en zona publica
      Given Pepe tiene acceso a la pagina


    @ValidateContactsCompany
      Scenario: Validar el email, correo y direccion de la empresa
        When dirige a la seccion de datos de contacto
        Then valida datos de contacto de la empresa

    @BasicSearch
      Scenario: Realizar una busqueda basica en la pagina
      When realizar la busqueda del producto desdeado
      Then validar el resultado de la busqueda




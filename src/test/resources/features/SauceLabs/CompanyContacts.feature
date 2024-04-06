Feature: Validacion de los datos de contacto de la empresa

    @ValidateContactsCompany
      Scenario: Validar el email, correo y direccion de la empresa
        Given Pepe tiene acceso a la pagina
        When direcciona a la seccion de datos de la empresa
        Then validar los datos de contacto





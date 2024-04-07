Feature: Validacion de los datos de contacto de la empresa

    @ValidateContactsCompany
      Scenario: Validar el email, correo y direccion de la empresa
        Given Pepe tiene acceso a la pagina
        When dirige a la seccion de datos de contacto
        Then valida datos de contacto de la empresa






Feature: Validacion de flujos generales en la pangina de MyShop

    Background: Ingresar a la pagina en zona publica
      Given Pepe tiene acceso a la pagina


    @ValidateContactsCompany
      Scenario: Validar el email, correo y direccion de la empresa
        When dirige a la seccion de datos de contacto
        Then valida datos de contacto de la empresa

 #   @BasicSearch
 #     Scenario: Realizar una busqueda basica en la pagina
 #     When realiza la busqueda del producto deseado
 #     Then valida el resultado de la busqueda

 #   @ValidateRegistrationForm
 #     Scenario: Realizar la validacion del formulario de registro
 #       When dirige al formulario de registro
 #       Then valida el formulario de registro

 #   @RecuperationRecuperationForm
 #     Scenario: Realizar la validacion del formulario de recuperacion de contraseña
 #     When dirige al formulario de recuperacion de contraseña
 #     Then valida el fomulario de recuperacion
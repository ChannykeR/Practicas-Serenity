Feature: Validacion de los diferentes escenarios en la seccion de Elements

  Background: Ingresar al Home de la pagina
    Given PepeQa tiene acceso a la pagina DemoQa


  @CompleteFormTextBox
    Scenario: validar los campos de la seccion de TextBox
      And direcciona a la seccion de TextBox
      When completa los campos solicitados
      Then valida la informacion llenada

  #INCOMPLETE
  #@SelectOptionsFromCheckBox
  #  Scenario: validar los seleccionables de la seccion CheckBox
  #    And direcciona a la seccion de CheckBox
  #    When completa las selecciones de los campos
  #    Then valida los campos seleccionados


  @SelectButtonsRadioButton
    #Falta validar que un boton no sea seleccionable
    Scenario: validar la seleccion de los botones de RadioButton
        And direcciona a la seccion de RadioButton
        When selecciona los botones
        Then valida los textos de los botones



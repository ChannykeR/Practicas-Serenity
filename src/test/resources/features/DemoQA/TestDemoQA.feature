Feature: Evalución de automatización sobre pagina DemoQA

  # 1. Validar el accionamiento de checkbox y resultado para el modulo Elements - Checkbox <-- Lorena
  # 2. Validar radiobuttons activos y no activos y resultado para el modulo Elements - Radio Button <-- Laura
  # 3. Validar se visualice el formulario de registro al accionar e botón ADD del Elements <-- Web tables
  # 4. Validar campos required para el formulario Practice Form <-- Marlon
  # 5. Validar registro en formulario Practice form solo con campos required <-- Santiago


  @testprueba

    Scenario: Validar radiobuttons activos y no activos y resultado para el modulo Elements
    Given Juana ingreso a la pagina DemoQA
    When doy clic en Elements
    And selecciono Radio Button
    Then Valido los radiobuttons activos y no activos
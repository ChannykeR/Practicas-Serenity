package starter.stepdefinitions.DemoQa;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.task.DemoQa.OptionsCheckBoxTask;
import starter.ui.DemoQa.SectionElementsUI;
import starter.ui.DemoQa.SectionHomeUI;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectOptionsCheckBoxSteps {

    @And("^direcciona a la seccion de CheckBox$")
    public void SectionCheckBox(){
        theActorInTheSpotlight().attemptsTo(
                Scroll.to(SectionHomeUI.BUTTON_ELEMENTS),
                Click.on(SectionHomeUI.BUTTON_ELEMENTS),
                Click.on(SectionElementsUI.BUTTON_CHECK_BOX)
        );
    }



    @When("^completa las selecciones de los campos$")
    public void CompleteCamps(){

        new OptionsCheckBoxTask();

    }

    @Then("^valida los campos seleccionados$")
    public void ValidateSlections(){

    }

}

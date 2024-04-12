package starter.stepdefinitions.DemoQa;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.questions.DemoQa.SectionElementsQuestion;
import starter.ui.DemoQa.SectionElementsUI;
import starter.ui.DemoQa.SectionHomeUI;
import static org.hamcrest.Matchers.equalTo;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectButtonsRadioButtonSteps {

    @And("^direcciona a la seccion de RadioButton$")
    public void SectionRadioButton() {
        theActorInTheSpotlight().attemptsTo(
                Scroll.to(SectionHomeUI.BUTTON_ELEMENTS),
                Click.on(SectionHomeUI.BUTTON_ELEMENTS),
                Click.on(SectionElementsUI.BUTTON_RADIO_BUTTON)
        );

    }

    @When("^selecciona los botones$")
    public void SelectionButtonYes() {
        theActorInTheSpotlight().attemptsTo(
                Scroll.to(SectionElementsUI.TITLE_RADIO_BUTTON),
                Click.on(SectionElementsUI.BUTTON_YES_RADIO_BUTTON),
                WaitUntil.the(SectionElementsUI.TEXT_BUTTON_SELECTED_RADIO_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SectionElementsUI.BUTTON_IMPRESSIVE_RADIO_BUTTON),
                WaitUntil.the(SectionElementsUI.TEXT_BUTTON_SELECTED_RADIO_BUTTON, isVisible()).forNoMoreThan(10).seconds()
        );

    }


    @Then("^valida los textos de los botones$")
    public void ValidateTextButtons() {
        String TitleRadioButton = "Radio Button";
        String TextExplanatory = "Do you like the site?";
        String TextRadioButtonYes = "Yes";
        String TextRadioButtonImpressive = "Improssive";
        String TextRadioButtonImpressiveOn = "You have selected Impressive";
    }

}

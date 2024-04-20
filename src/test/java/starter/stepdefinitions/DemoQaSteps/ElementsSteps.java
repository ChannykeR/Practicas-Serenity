package starter.stepdefinitions.DemoQaSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.questions.DemoQA.ElementsQuestions;
import starter.ui.AutomationPracticeUI.SignInUI;
import starter.ui.DEMOQA.ElementsUI;
import static org.hamcrest.core.IsEqual.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ElementsSteps {

    @Given("{actor} ingreso a la pagina DemoQA")
    public void on_the_login_page(Actor actor) {
        actor.attemptsTo(
                Open.url("https://demoqa.com/")
        );
    }

    @When("doy clic en Elements")
    public void clicElements(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(ElementsUI.BUTTON_ELEMENTS, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(ElementsUI.BUTTON_ELEMENTS),
                Click.on(ElementsUI.BUTTON_ELEMENTS)
        );
    }

    @And("selecciono Radio Button")
    public void radioButton(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(ElementsUI.RADIO_BUTTON),
                WaitUntil.the(ElementsUI.RADIO_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(ElementsUI.TITTLE_RADIO_BUTTON)
        );
    }

    @When("Valido los radiobuttons activos y no activos")
    public void validation(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(ElementsUI.RADIO_BUTTON_YES));
        OnStage.theActorInTheSpotlight().should(
                seeThat("Boton Yes", ElementsQuestions.testYes(),equalTo("Yes"))
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(ElementsUI.RADIO_BUTTON_IMPRESSIVE));
        OnStage.theActorInTheSpotlight().should(
                seeThat("boton Impressive",ElementsQuestions.textImpressive(),equalTo("Impressive"))
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(ElementsUI.BUTTON_NO).isDisabled());

    }




}

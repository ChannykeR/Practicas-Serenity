package starter.stepdefinitions.automationpracticeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import starter.questions.AutomationPracticeQuestions.SearchsQuestions;
import starter.ui.AutomationPracticeUI.HomeUI;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SelectBottonTshirtSteps {

    @Given("{actor} ingresa a la pagina de automationpractice")
    public void IngressWeb(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.AutomationPractice")
        );

    }
    @When("da clic al boton de TSHIRTS")
    public void Clicbotton(){
    theActorInTheSpotlight().attemptsTo(
            Click.on(HomeUI.BUTTON_TSHIRT)
    );
    }

    @Then("que se muestre la pantalla esperada")
    public void ExpectedScreen(){
        String TextCatalog = "CATALOG";
    theActorInTheSpotlight().should(
            seeThat("titulo de catalogo", SearchsQuestions.catalogtittle(),equalTo(TextCatalog))
    );
    }
}

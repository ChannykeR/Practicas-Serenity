package starter.stepdefinitions.automationpracticeSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import starter.questions.AutomationPracticeQuestions.SignInQuestions;
import starter.ui.AutomationPracticeUI.HomeUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class BottonBestSellersSteps {

    @When("Se da clic al boton de Best sellers")
    public void Bottonbest(){
        theActorInTheSpotlight().attemptsTo(
                Click.on(HomeUI.BUTTON_BESTSELLERS)
        );
    }


    @Then("Se desplazan las diferentes opciones")
    public void Fielname(){
        String lau = "BEST SELLERS";
        String blusa = "Blouse";
        theActorInTheSpotlight().should(
                seeThat("titulo de boton", SignInQuestions.ButtonBestSellers(),equalTo(lau)),
        seeThat("texto de blusa", SignInQuestions.Namebluose(),equalTo(blusa))
        );

    }
}

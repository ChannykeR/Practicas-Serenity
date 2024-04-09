package starter.stepdefinitions.automationpracticeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.questions.AutomationPracticeQuestions.LoginOrRegisteredQuestions;
import starter.ui.AutomationPracticeUI.HomeUI;
import starter.ui.AutomationPracticeUI.LoginOrRegisteredUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.core.IsEqual.equalTo;

public class InvalidCredentialsSteps {
    @Given("{actor} ingresa a la pagina automationpractice")
    public void AccessPage (Actor lorena){
        lorena.attemptsTo(
                Open.url("http://www.automationpractice.pl/index.php"),
                WaitUntil.the(HomeUI.BUTTON_SIGNIN, isPresent()).forNoMoreThan(45).seconds()

        );

    }
    @When("Se ingresa las credenciales incorrecta")
    public void EnterCredentials (){
        theActorInTheSpotlight().attemptsTo(
                Click.on(HomeUI.BUTTON_SIGNIN),
                Scroll.to(LoginOrRegisteredUI.FIELD_EMAIL),
                Enter.keyValues("ybohorquezp@ucentral.edu.co").into(LoginOrRegisteredUI.FIELD_EMAIL),
                Enter.keyValues("lunera2").into(LoginOrRegisteredUI.FIELD_PASSWORD),
                Click.on(LoginOrRegisteredUI.BUTTON_SIGNIN)
        );
    }
    @Then("Mostrará el pop up de error")
    public void ErrorMessage (){
        String IncorrectCredentials = "There is 1 error";
        theActorInTheSpotlight().should(
        seeThat("Error de credenciales invalidas", LoginOrRegisteredQuestions.ErrorMessage(),equalTo(IncorrectCredentials))
        );

    }
}

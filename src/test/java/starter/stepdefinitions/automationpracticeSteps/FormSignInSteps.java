package starter.stepdefinitions.automationpracticeSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.questions.AutomationPracticeQuestions.SignInQuestions;
import starter.task.AutomationPracticeTask.ClicSignIn;
import starter.task.AutomationPracticeTask.ScrollTitle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.core.IsEqual.equalTo;

public class FormSignInSteps {

    @Given("{actor} Ingresa a la pagina {string}")
    public void IngressWeb(Actor actor, String url, DataTable dataTable) {
        actor.attemptsTo(
                Open.url(url)
        );

    }
    /*
    @Given("^(.*) Ingresa a la pagina automationpractice$")
    public void Ingress(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.AutomationPractice")
        );

    }
    */

    @When("realiza clic en Sign in")
    public void ClicSignIn() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new ClicSignIn(),
                new ScrollTitle()
        );
    }

    @Then("se debe visualizar el formualrio de creación de cuenta")
    public void CreateAccount() {
        String ExpectTitle = "CREATE AN ACCOUNT";
        OnStage.theActorInTheSpotlight().should(
                seeThat("View Text Title", SignInQuestions.titleForm(), equalTo(ExpectTitle)),
                seeThat("View Text Subtitle", SignInQuestions.titleSubtitle(), equalTo("Please enter your email address to create an account.")),
                seeThat("View Text Email", SignInQuestions.textEmail(), equalTo("Email address")),
                seeThat("View Text Button", SignInQuestions.ButtonCreate(), equalTo(""))
        );

    }


}

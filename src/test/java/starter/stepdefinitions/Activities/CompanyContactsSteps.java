package starter.stepdefinitions.Activities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.questions.Activities.CompanyContactsQuestions;
import starter.ui.ShoppinUI.Activities.CompanyContactsUI;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompanyContactsSteps {
    @Given("{actor} tiene acceso a la pagina")
    public void on_the_login_page(Actor actor) {
        actor.attemptsTo(
                Open.url("http://www.automationpractice.pl/index.php")
        );
    }

    @When("direcciona a la seccion de datos de la empresa")
    public void RedirectionDataSection() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Scroll.to(CompanyContactsUI.ADDRESS)
        );
    }

    @Then("validar los datos de contacto")
    public void ValidatecContacts() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(CompanyContactsQuestions.AdressQuestion()).containsElementsFrom(CompanyContactsUI)
        );
    }
}

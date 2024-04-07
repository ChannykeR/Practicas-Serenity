package starter.stepdefinitions.Activities;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.questions.Activities.SemanaUnoQuestions;
import starter.task.Activities.CompanyContactsTask;
import starter.ui.ShoppinUI.Activities.SemanaUnoUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.Matchers.equalTo;

public class CompanyContactsSteps {

    @Given("{actor} tiene acceso a la pagina")
        public void OpenNavegator(Actor actor) {
            actor.attemptsTo(
                    Open.url("http://www.automationpractice.pl/index.php"),
                    WaitUntil.the(SemanaUnoUI.ADDRESS, isPresent()).forNoMoreThan(5).seconds()
            );
    }
    @When("^dirige a la seccion de datos de contacto$")
    public void DirectionContacts() {
        theActorInTheSpotlight().attemptsTo(
                new CompanyContactsTask()
        );

    }

    @Then("^valida datos de contacto de la empresa$")
    public void ValidateData() {
        String Address = "My Company, 42 avenue des Champs Elysées 75000 Paris France";
        String Phone = "0123-456-789";
        String Email = "sales@yourcompany.com";
        theActorInTheSpotlight().should(
                seeThat("direccion de la empresa", SemanaUnoQuestions.AddressQuestion(), equalTo(Address))
        );
        theActorInTheSpotlight().should(
                seeThat("numero de la empresa", SemanaUnoQuestions.PhoneQuestion(), equalTo(Phone))
        );
        theActorInTheSpotlight().should(
                seeThat("correo de la empresa", SemanaUnoQuestions.EmailQuestion(), equalTo(Email))
        );
    }
}

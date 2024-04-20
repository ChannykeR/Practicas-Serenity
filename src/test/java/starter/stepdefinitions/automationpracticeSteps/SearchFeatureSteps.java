package starter.stepdefinitions.automationpracticeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.text.IsEqualIgnoringCase;
import starter.questions.AutomationPracticeQuestions.SearchQuestions;
import starter.task.AutomationPracticeTask.SearchSomething;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SearchFeatureSteps {
    @Given("{actor} Ingresa a la pagina automationpracticee")
    public void Ingressweb2(Actor actor){
        actor.attemptsTo(
                Open.url("http://www.automationpractice.pl/index.php")
        );
    }

    @When("realiza un busqueda")
    public void MakeASearch(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                new SearchSomething()
        );
    }

    @Then("se debe visualizar la pantalla de resultados")
    public void SearchResults(){
        String expectedDress = "\"DRESS\"";
        String expectedResult = "7 results have been found.";
        OnStage.theActorInTheSpotlight().should(
                seeThat("View quantity of product", SearchQuestions.labelDress(), new IsEqualIgnoringCase(expectedDress)),
                seeThat("View type of result", SearchQuestions.resultsQuantity(),equalTo(expectedResult))
        );
    }
}

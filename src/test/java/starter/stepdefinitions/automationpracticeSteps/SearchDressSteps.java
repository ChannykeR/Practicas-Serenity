package starter.stepdefinitions.automationpracticeSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.questions.AutomationPracticeQuestions.SearchsQuestions;
import starter.ui.AutomationPracticeUI.HomeUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class SearchDressSteps {

    @When("se realiza una busqueda de Dress en el cuadro de busqueda")
    public void Searchdress(){
        theActorInTheSpotlight().attemptsTo(
                Enter.keyValues("Dress").into(HomeUI.SEARCH_BOX),
                Click.on(HomeUI.BUTTON_SEARCH)

        );


    }

    @Then("Se muestre la pantalla con los resultados esperados")
    public void Resultsdress(){
        String TextSearch = "Showing 1 - 7 of 7 items";
        theActorInTheSpotlight().should(
                seeThat("titulo de search", SearchsQuestions.titulodebusqueda(),equalTo(TextSearch)));

    }
}

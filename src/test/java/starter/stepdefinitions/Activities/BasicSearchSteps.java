package starter.stepdefinitions.Activities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.ui.ShoppinUI.Activities.SemanaUnoUI.SEARCH_BAR;
import static starter.ui.ShoppinUI.Activities.SemanaUnoUI.SEARCH_BUTTON;


public class BasicSearchSteps {

    @When("^realiza la busqueda del producto deseado$")
    public void SearchProduct(){
        theActorInTheSpotlight().attemptsTo(
                Click.on(SEARCH_BAR),
                Enter.keyValues("Dress").into(SEARCH_BAR),
                Click.on(SEARCH_BUTTON)
        );
    }

    @Then("^el resultado de la busqueda debe ser$")
    public void ViewResults(List<Campo> campos){
        for (Campo campo : campos) {
            String campoNombre = campo.getGarmentName();
            String Value = campo.getValue();
        }
    }
}

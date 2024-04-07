package starter.stepdefinitions.Activities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class BasicSearchSteps {

    @When("^realizar la busqueda del producto deseado$")
    public void SearchProduct(Actor Pepe){
        Pepe.attemptsTo(

        );
    }

    @Then("^validar el resultado de la busqueda$")
    public void ViewResults(){

    }
}

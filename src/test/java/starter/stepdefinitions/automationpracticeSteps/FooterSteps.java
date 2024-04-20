package starter.stepdefinitions.automationpracticeSteps;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;


public class FooterSteps {
    @Given("{actor} Ingresa a la pagina automationpractice")
    public void IngressWeb(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.AutomationPractice")

        );
    }

    @Then("hace scroll hasta el footer de la pagina")
    public void Scroll(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                
        );
    }
}

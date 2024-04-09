package starter.stepdefinitions.automationpracticeSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.task.AutomationPracticeTask.ClicForgotYourPass;
import starter.task.AutomationPracticeTask.ClicSignIn;

public class ForgotYourPass {
    @When("quieres recuperar la clave")
    public void recupera_la_clave() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new ClicSignIn()

        );
    }
    @And ("Da clic en  el botón forgot your password")
    public void dar_clic_en_el_boton(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                new ClicForgotYourPass()
        );
    }
    @Then("Visualiza el formulario para la recuperación de la contraseña")
    public void visualizar_formulario() {}

}


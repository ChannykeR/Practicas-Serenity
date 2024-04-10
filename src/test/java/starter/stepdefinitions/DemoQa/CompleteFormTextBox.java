package starter.stepdefinitions.DemoQa;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.questions.DemoQa.SectionElementsQuestion;
import starter.ui.DemoQa.SectionHomeUI;
import starter.ui.DemoQa.SectionElementsUI;
import starter.task.DemoQa.FormTextBoxTask;
import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompleteFormTextBox {
    @Given("{actor} tiene acceso a la pagina DemoQa")
    public void AccessPagesDemoQa(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.DemoQa")
        );
    }

    @And("^direcciona a la seccion de TextBox$")
    public void SectionTextBo() {
        theActorInTheSpotlight().attemptsTo(
                Scroll.to(SectionHomeUI.BUTTON_FORM),
                Click.on(SectionHomeUI.BUTTON_FORM),
                Click.on(SectionElementsUI.BUTTON_TEXTO_BOX)
        );
    }

    @When("^completa los campos solicitados$")
    public void CompleteFields() {
        theActorInTheSpotlight().attemptsTo(
                new  FormTextBoxTask()
        );
    }

    @Then("^valida la informacion llenada$")
    public void ValidateResult() {
        String TitleTextBox = "Text Box";
        String TextFullNameTextBox = "Full Name";
        String TextEmailTextBox = "Email";
        String TextCurrentAddressTextBox = "Current Address";
        String TextPermanentAddressTextBox = "Permanent Address";
        String ResultNameTextBox = "Name:Pepe Gonzales";
        String ResultEmailTextBox = "Email:pepegonzales@gmail.com";
        String ResultCurrentAddressTextBox = "Current Address :Direccion de pepe recurrente";
        String ResultPermanentAddressTextBox = "Permananet Address :Direccion de pepe permanente";
        theActorInTheSpotlight().should(
                seeThat("titulo text box", SectionElementsQuestion.TitleTextBox(), equalTo(TitleTextBox)),
                seeThat("texto nombre", SectionElementsQuestion.TextFullNameTextBox(),equalTo(TextFullNameTextBox)),
                seeThat("texto email", SectionElementsQuestion.TextEmailTextBox(),equalTo(TextEmailTextBox)),
                seeThat("texto direccion recurrente", SectionElementsQuestion.TextCurrentAddressTextBox(),equalTo(TextCurrentAddressTextBox)),
                seeThat("texto direccion permanente", SectionElementsQuestion.TextPermanentAddressTextBox(),equalTo(TextPermanentAddressTextBox)),
                seeThat("resultado de nombre", SectionElementsQuestion.ResultNameTextBox(),equalTo(ResultNameTextBox)),
                seeThat("resultado de email", SectionElementsQuestion.ResultEmailTextBox(),equalTo(ResultEmailTextBox)),
                seeThat("resultado direccion recurrente", SectionElementsQuestion.ResultCurrentAddressTextBox(),equalTo(ResultCurrentAddressTextBox)),
                seeThat("resultado direccion permanente", SectionElementsQuestion.ResultPermanentAddressTextBox(),equalTo(ResultPermanentAddressTextBox))

        );

    }


}

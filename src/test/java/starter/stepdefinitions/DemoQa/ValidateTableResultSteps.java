package starter.stepdefinitions.DemoQa;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.questions.DemoQa.SectionBookStoreQuestion;
import starter.task.DemoQa.IngresToBooksStoreTask;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.equalTo;

public class ValidateTableResultSteps {

    @Given("^(.*) tiene acceso a la pagina de DemoQa$")
    public void AccessPages(String Actor){
        theActorCalled(Actor).attemptsTo(
                Open.browserOn().thePageNamed("pages.DemoQa")
        );
    }

    @When("^da clic en la seccion de BookStore$")
    public void SectionBooksSote(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                new IngresToBooksStoreTask()
        );
    }

    @Then("^se valida que en la lista bajo cada cabecera (.*), (.*), (.*), (.*)$")
    public void ValidateTable(String Image, String Title, String Author, String Publisher){
        OnStage.theActorInTheSpotlight().should(
          seeThat("Imagen del primer libro", SectionBookStoreQuestion.ImageBookOne(),equalTo(Image)),
                seeThat("Titulo del primer libro", SectionBookStoreQuestion.TitleBookOne(),equalTo(Title)),
                seeThat("Autor del primer libro", SectionBookStoreQuestion.AuthorBookOne(),equalTo(Author)),
                seeThat("Editor del primer libro", SectionBookStoreQuestion.PublisherBookOne(),equalTo(Publisher))
        );
    }
}

package starter.stepdefinitions.ShoppingSteps;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.By;
import starter.questions.ShoppingQuestions;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingSteps {

    private WriteExcelFile writeExcelFile;
    private ReadExcelFile readExcelFile;

    String filePath = "src/main/java/starter/Utils/Data.xlsx";

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        writeExcelFile = new WriteExcelFile();
        readExcelFile = new ReadExcelFile();
    }

    @Given("{actor} ingresa a la tienda online")
    public void ingressWeb(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.AutomationPractice")
        );
    }

    @When("ingresa el texto en el cuadro de búsqueda")
    public void ingresa_el_texto_en_el_cuadro_de_búsqueda() throws IOException {

        String searchText = readExcelFile.getCellValue(filePath, "Search", 0, 0);

        OnStage.theActorInTheSpotlight().attemptsTo(
                //Enter.theValue(searchText).into(By.id("search_query_top")).thenHit(Keys.ENTER),
                Enter.theValue(searchText).into(By.id("search_query_top")),
                Click.on(By.name("submit_search"))

        );

    }

    @Then("se debe mostrar la cantidad de resultados encontrado sea igual a {int}")
    public void se_debe_mostrar_la_cantidad_de_resultados_encontrados(int expectCountResult) throws IOException {
        String resultsText = theActorInTheSpotlight().asksFor(ShoppingQuestions.numbersOfResultsText());

        OnStage.theActorInTheSpotlight().should(
                seeThat("Resultado encontrado", ShoppingQuestions.numbersOfResults(), equalTo(expectCountResult))
        );
        writeExcelFile.writeCellValue(filePath, "Search", 0, 1, resultsText);

        readExcelFile.readExcel(filePath, "Search");
    }
}



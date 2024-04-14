package starter.stepdefinitions.automationpracticeSteps;


import io.cucumber.java.en.*;
import starter.Utils.IsItFriday;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stepdefs {

    private String today;
    private String actualAnswer;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Friday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
        System.out.println("viene de la definicion de la funcion" + actualAnswer);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        System.out.println("viene de la definicion de la Gherkin" + expectedAnswer);
        assertEquals(expectedAnswer, actualAnswer);
    }

}
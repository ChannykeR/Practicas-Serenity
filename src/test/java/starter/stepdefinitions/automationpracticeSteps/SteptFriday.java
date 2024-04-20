package starter.stepdefinitions.automationpracticeSteps;

import io.cucumber.java.en.*;
import starter.Utils.Itsfriday;

import static org.junit.Assert.assertEquals;

public class SteptFriday {

        private String today;

        private String actualAnswer;

        @Given("today is {string}")
        public void today_is(String today) {
            this.today = today;
        }

        @When("I ask whether it's Friday yet")
        public void i_ask_whether_it_s_Friday_yet() {
            actualAnswer = Itsfriday.isItFriday(today);
        }

        @Then("I should be told {string}")
        public void i_should_be_told(String expectedAnswer) {
            assertEquals(expectedAnswer, actualAnswer);
        }
}

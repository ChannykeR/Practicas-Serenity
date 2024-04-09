package starter.task.AutomationPracticeTask;

import io.cucumber.java.sk.Tak;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.ui.AutomationPracticeUI.SignInUI;

public class ClicForgotYourPass implements Task {

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Scroll.to(SignInUI.TITLE_AUTHENTICATION),
                    Click.on(SignInUI.BUTTON_FORGOT));}

}

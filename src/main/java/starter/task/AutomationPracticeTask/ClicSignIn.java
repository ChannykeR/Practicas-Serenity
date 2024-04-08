package starter.task.AutomationPracticeTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.AutomationPracticeUI.SignInUI;

public class ClicSignIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignInUI.BUTTON_SIGNIN)
        );
    }
}

package starter.task.AutomationPracticeTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.AutomationPracticeUI.SignInUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ScrollTitle implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SignInUI.TITLE_FORM, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SignInUI.TITLE_FORM)
        );

    }
}

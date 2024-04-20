package starter.task.AutomationPracticeTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.AutomationPracticeUI.SearchUI;

public class SearchSomething implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchUI.SEARCH_FIELD));
        actor.attemptsTo(Enter.theValue("dress").into(SearchUI.SEARCH_FIELD));
        actor.attemptsTo(Click.on(SearchUI.SEARCH_BUTTON));
    }
}

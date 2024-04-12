package starter.task.Functionalities;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickCheckBoxTask implements Task {

    private final String checkboxLocator;

    public ClickCheckBoxTask(String checkboxLocator) {
        this.checkboxLocator = checkboxLocator;
    }

    public static ClickCheckBoxTask withLocator(String checkboxLocator) {
        return instrumented(ClickCheckBoxTask.class, checkboxLocator);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(checkboxLocator)
        );

    }
}

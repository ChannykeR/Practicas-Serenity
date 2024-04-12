package starter.task.DemoQa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.task.Functionalities.ClickCheckBoxTask;
import starter.ui.DemoQa.SectionElementsUI;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OptionsCheckBoxTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(SectionElementsUI.TEXT_CHECK_BOX, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(SectionElementsUI.CHECK_OFF_TEXT_HOME_CHECK_BOX),
                Click.on(SectionElementsUI.CHECK_OFF_TEXT_HOME_CHECK_BOX.waitingForNoMoreThan(Duration.ofSeconds(20))),
                Scroll.to(SectionElementsUI.CHECK_OFF_TEXT_HOME_CHECK_BOX)
        );

    }

}

package starter.task.Activities;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.ShoppinUI.Activities.CompanyContactsUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class CompanyContactsTask implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CompanyContactsUI.ADDRESS),
                WaitUntil.the(CompanyContactsUI.ADDRESS, isPresent()).forNoMoreThan(5).seconds()
        );
    }

}

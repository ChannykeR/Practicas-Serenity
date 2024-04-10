package starter.task.DemoQa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.DemoQa.SectionElementsUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class FormTextBoxTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SectionElementsUI.TITLE_TEXT_BOX, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(SectionElementsUI.FIELD_FULL_NAME_TEXT_BOX),
                Enter.theValue("Pepe Gonzales").into(SectionElementsUI.FIELD_FULL_NAME_TEXT_BOX),
                Enter.theValue("pepegonzales@gmail.com").into(SectionElementsUI.FIELD_EMAIL_TEXT_BOX),
                Enter.theValue("Direccion de pepe recurrente").into(SectionElementsUI.FIELD_CURRENT_ADDRESS_TEXT_BOX),
                Scroll.to(SectionElementsUI.FIELD_PERMANENT_ADDRESS_TEXT_BOX),
                Enter.theValue("Direccion de pepe permanente").into(SectionElementsUI.FIELD_PERMANENT_ADDRESS_TEXT_BOX),
                Click.on(SectionElementsUI.BUTTON_SUBMIT_TEXT_BOX)
        );

    }
}

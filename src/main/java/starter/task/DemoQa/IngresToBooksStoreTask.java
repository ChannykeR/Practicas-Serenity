package starter.task.DemoQa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.ui.DemoQa.SectionBooksStoreUI;

public class IngresToBooksStoreTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Scroll.to(SectionBooksStoreUI.CARD_BUTTON_BOOK_STORE),
                Click.on(SectionBooksStoreUI.CARD_BUTTON_BOOK_STORE),
                Scroll.to(SectionBooksStoreUI.SECTION_BOOK_STORE_APPLICATION),
                Click.on(SectionBooksStoreUI.OPTION_BOOK_STORE)
         //       Scroll.to(SectionBooksStoreUI.ONE_BOOK_IMAGE)
        );
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package starter.questions.DemoQa;

import net.serenitybdd.screenplay.Question;
import starter.ui.DemoQa.SectionBooksStoreUI;

public class SectionBookStoreQuestion {

    public static Question<String> ImageBookOne(){
        return actor -> SectionBooksStoreUI.ONE_BOOK_IMAGE.resolveFor(actor).getAttribute("src");
    }
    public static Question<String> TitleBookOne(){
        return actor -> SectionBooksStoreUI.ONE_BOOK_TITLE.resolveFor(actor).getText().trim();
    }
    public static Question<String> AuthorBookOne(){
        return actor -> SectionBooksStoreUI.ONE_BOOK_AUTHOR.resolveFor(actor).getText().trim();
    }
    public static Question<String> PublisherBookOne(){
        return actor -> SectionBooksStoreUI.ONE_BOOK_PUBLISHER.resolveFor(actor).getText().trim();
    }

}

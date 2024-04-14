package starter.questions.AutomationPracticeQuestions;

import net.serenitybdd.screenplay.Question;
import starter.ui.AutomationPracticeUI.SearchsUI;

import static starter.ui.AutomationPracticeUI.SignInUI.TITLE_FORM;

public class SearchsQuestions {
    public static Question<String> catalogtittle() {
        return actor -> SearchsUI.CATALOG_TITTLE.resolveFor(actor).getText().trim();
    }

    public static Question<String> categorysearch() {
        return actor -> SearchsUI.CATEGORY_SEARCH.resolveFor(actor).getText().trim();
    }

    public static Question<String> titulodebusqueda() {
        return actor -> SearchsUI.CATEGORY_SEARCH.resolveFor(actor).getText().trim();
    }

}

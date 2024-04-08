package starter.questions.AutomationPracticeQuestions;

import net.serenitybdd.screenplay.Question;
import starter.ui.AutomationPracticeUI.SearchsUI;

import static starter.ui.AutomationPracticeUI.SignInUI.TITLE_FORM;

public class SearchsQuestions {
    public static Question<String> catalogtittle() {
        return actor -> SearchsUI.CATALOG_TITTLE.resolveFor(actor).getText().trim();
    }
}

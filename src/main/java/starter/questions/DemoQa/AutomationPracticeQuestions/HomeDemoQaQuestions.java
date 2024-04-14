package starter.questions.DemoQa.AutomationPracticeQuestions;

import net.serenitybdd.screenplay.Question;
import starter.ui.AutomationPracticeUI.SearchsUI;
import starter.ui.DemoQAUI.HomeDemoQaUI;

public class HomeDemoQaQuestions {

    public static Question<String> bottunbookstore() {
        return actor -> HomeDemoQaUI.BUTTON_BOOKSTORE.resolveFor(actor).getText().trim();
    }
}

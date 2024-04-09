package starter.questions.AutomationPracticeQuestions;

import net.serenitybdd.screenplay.Question;
import starter.ui.AutomationPracticeUI.LoginOrRegisteredUI;

import static starter.ui.AutomationPracticeUI.SignInUI.TITLE_FORM;

public class LoginOrRegisteredQuestions {

    public static Question<String> ErrorMessage(){ return actor -> LoginOrRegisteredUI.ERROR_MESSAGE.resolveFor(actor).getText().trim();
    }
}

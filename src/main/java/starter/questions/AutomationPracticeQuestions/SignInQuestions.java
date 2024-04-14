package starter.questions.AutomationPracticeQuestions;

import net.serenitybdd.screenplay.Question;
import starter.ui.AutomationPracticeUI.HomeUI;

import static starter.ui.AutomationPracticeUI.SignInUI.*;

public class SignInQuestions {

    public static Question<String> titleForm() {
        return actor -> TITLE_FORM.resolveFor(actor).getText().trim();
    }
    public static Question<String> titleSubtitle() {
        return actor -> TEXT_SUBTITLE.resolveFor(actor).getText().trim();
    }
    public static Question<String> textEmail() {
        return actor -> TEXT_EMAIL.resolveFor(actor).getText().trim();
    }
    public static Question<String> ButtonCreate() {
        return actor -> BUTTON_CREATE_ACCOUNT.resolveFor(actor).getText().trim();}

        public static Question<String> ButtonBestSellers() {
            return actor -> HomeUI.BUTTON_BESTSELLERS.resolveFor(actor).getText().trim();}

    public static Question<String> fieldname(){
        return actor -> HomeUI.FIELD_NAME.resolveFor(actor).getText().trim();}

    public static Question<String> Namebluose(){
        return actor -> HomeUI.NAME_BLOUSE.resolveFor(actor).getText().trim();}

    public static Question<String> Addbutton(){
        return actor -> HomeUI.ADD_BUTTON.resolveFor(actor).getText().trim();}

                }



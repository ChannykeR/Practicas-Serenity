package starter.questions.DemoQA;

import net.serenitybdd.screenplay.Question;
import starter.ui.DEMOQA.ElementsUI;

import static starter.ui.AutomationPracticeUI.SignInUI.TITLE_FORM;

public class ElementsQuestions {

    public static Question<String> buttonElements() {
        return actor -> ElementsUI.BUTTON_ELEMENTS.resolveFor(actor).getText().trim();
    }

    public static Question<String> radioButton() {
        return actor -> ElementsUI.RADIO_BUTTON.resolveFor(actor).getText().trim();
    }

    public static Question<String> radioButtonYes() {
        return actor -> ElementsUI.RADIO_BUTTON_YES.resolveFor(actor).getText().trim();
    }

    public static Question<String> testYes() {
        return actor -> ElementsUI.TEXT_YES.resolveFor(actor).getText().trim();
    }

    public static Question<String> radioButtonImpressive() {
        return actor -> ElementsUI.RADIO_BUTTON_IMPRESSIVE.resolveFor(actor).getText().trim();
    }

    public static Question<String> textImpressive() {
        return actor -> ElementsUI.TEXT_IMPRESSIVE.resolveFor(actor).getText().trim();
    }

    public static Question<String> tittleradio() {
        return actor -> ElementsUI.TITTLE_RADIO_BUTTON.resolveFor(actor).getText().trim();
    }



}


package starter.questions.DemoQa;

import net.serenitybdd.screenplay.Question;
import starter.ui.DemoQa.SectionElementsUI;

public class SectionElementsQuestion {

    public static Question<String> TitleTextBox(){
        return actor -> SectionElementsUI.TITLE_TEXT_BOX.resolveFor(actor).getText().trim();
    }

    public static Question<String> TextFullNameTextBox(){
        return actor -> SectionElementsUI.TEXT_FULL_NAME_TEXT_BOX.resolveFor(actor).getText().trim();
    }

    public static Question<String> TextEmailTextBox(){
        return actor -> SectionElementsUI.TEXT_EMAIL_TEXT_BOX.resolveFor(actor).getText().trim();
    }

    public static Question<String > TextCurrentAddressTextBox(){
        return actor -> SectionElementsUI.TEXT_CURRENT_ADDRESS_TEXT_BOX.resolveFor(actor).getText().trim();
    }

    public static Question<String> TextPermanentAddressTextBox(){
        return actor -> SectionElementsUI.TEXT_PERMANENT_ADDRESS_TEXT_BOX.resolveFor(actor).getText().trim();
    }

    public static Question<String> ResultNameTextBox(){
        return actor -> SectionElementsUI.RESULT_NAME_TEXT_BOX.resolveFor(actor).getText().trim();
    }

    public static Question<String> ResultEmailTextBox(){
        return actor -> SectionElementsUI.RESULT_EMAIL_TEXT_BOX.resolveFor(actor).getText().trim();
    }

    public static Question<String> ResultCurrentAddressTextBox(){
        return actor -> SectionElementsUI.RESULT_CURRENT_ADDRESS_TEXT_BOX.resolveFor(actor).getText().trim();
    }

    public static Question<String> ResultPermanentAddressTextBox(){
        return actor -> SectionElementsUI.RESULT_PERMANENT_ADDRESS_TEXT_BOX.resolveFor(actor).getText().trim();
    }
}

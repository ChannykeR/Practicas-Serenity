package starter.questions.Activities;

import net.serenitybdd.screenplay.Question;
import starter.ui.ShoppinUI.Activities.SemanaUnoUI;

public class SemanaUnoQuestions {

    public static Question<String> AddressQuestion(){
        return actor -> SemanaUnoUI.ADDRESS.resolveFor(actor).getText().trim();
    }

    public static Question<String> PhoneQuestion(){
        return actor -> SemanaUnoUI.PHONE.resolveFor(actor).getText().trim();
    }

    public static Question<String> EmailQuestion(){
        return actor -> SemanaUnoUI.EMAIL.resolveFor(actor).getText().trim();
    }

}

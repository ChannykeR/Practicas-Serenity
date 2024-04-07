package starter.questions.Activities;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.ui.ShoppinUI.Activities.CompanyContactsUI;

public class CompanyContactsQuestions {

    public static Question<String> AddressQuestion(){
        return actor -> CompanyContactsUI.ADDRESS.resolveFor(actor).getText().trim();
    }

    public static Question<String> PhoneQuestion(){
        return actor -> CompanyContactsUI.PHONE.resolveFor(actor).getText().trim();
    }

    public static Question<String> EmailQuestion(){
        return actor -> CompanyContactsUI.EMAIL.resolveFor(actor).getText().trim();
    }

}

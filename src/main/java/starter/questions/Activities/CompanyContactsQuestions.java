package starter.questions.Activities;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.ui.ShoppinUI.Activities.CompanyContactsUI;

public class CompanyContactsQuestions {

    public static Question<String> Address(){
        return actor -> CompanyContactsUI.ADDRESS.resolveFor(actor).getText().trim();
    }

}

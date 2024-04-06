package starter.questions.Activities;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompanyContactsQuestions {

    public static Question<Integer> CurrenlyDisplayed() {
        return Text.of(".shopping_cart_badge").asInteger();
    }

}

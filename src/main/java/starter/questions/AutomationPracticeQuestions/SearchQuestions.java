package starter.questions.AutomationPracticeQuestions;

import net.serenitybdd.screenplay.Question;

import static starter.ui.AutomationPracticeUI.SearchUI.*;

public class SearchQuestions {

   /* public static Question<String> product(){
       return actor -> PRODUCTT.resolveFor(actor).getElement();"
    } */

    public static Question<String> labelDress(){
        return actor -> LABEL_DRESS.resolveFor(actor).getText().trim();
    }

    public static Question<String> resultsQuantity(){
        return actor -> RESULTS_QUANTITY.resolveFor(actor).getText().trim();
    }

}

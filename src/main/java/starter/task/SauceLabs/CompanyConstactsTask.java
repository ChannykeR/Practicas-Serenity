package starter.task.SauceLabs;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.models.Users;
import starter.questions.CompanyContactsQuestions;

public class CompanyConstactsTask {

    public static void Performable (Users users) {
        return Task.where(
                Ensure.that(CompanyContactsQuestions.AdressQustion())
                        .isEqualTo()
        )
    }
}

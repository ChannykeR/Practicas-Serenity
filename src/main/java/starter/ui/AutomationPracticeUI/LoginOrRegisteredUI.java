package starter.ui.AutomationPracticeUI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class LoginOrRegisteredUI {

    public static final Target FIELD_EMAIL = Target.the("Campo Email address")
            .located(By.xpath("//*[@id=\'email\']"));
    public static final Target FIELD_PASSWORD = Target.the("Campo Password")
            .located(By.xpath("//*[@id=\'passwd\']"));
    public static final Target BUTTON_SIGNIN = Target.the("Boton sign in")
            .located(By.xpath("//*[@id='SubmitLogin']/span"));
    public static final Target ERROR_MESSAGE = Target.the("Texto de error por credenciales invalidas")
            .located(By.xpath("//*[@id=\'center_column\']/div[1]/p"));
}

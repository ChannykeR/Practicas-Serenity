package starter.ui.AutomationPracticeUI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignInUI {

    public static final Target BUTTON_SIGNIN = Target.the("Button Sign In")
            .located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

    public static final Target TITLE_FORM = Target.the("Text title CREATE AN ACCOUNT")
            .located(By.xpath("//*[@id=\"create-account_form\"]/h3"));

    public static final Target TEXT_SUBTITLE = Target.the("Text View Please enter your email address to create an account.")
            .located(By.xpath("//*[@id='create-account_form']/div/p"));

    public static final Target TEXT_EMAIL = Target.the("Text Email")
            .located(By.xpath("//*[@id='create-account_form']/div/div[2]/label"));

    public static final Target BUTTON_CREATE_ACCOUNT = Target.the("Button Create Account")
            .located(By.xpath("//*[@id=\"SubmitCreate\"]/span/i"));

}

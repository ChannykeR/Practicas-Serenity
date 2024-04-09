package starter.ui.AutomationPracticeUI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class ForgotYourPassUI {
    public static final  Target TITLE_FORGOT = Target.the("Título olvido de contraseña")
            .located(By.xpath("//*[@id=\"center_column\"]/div/h1"));
    public static final  Target SUBTITLE = Target.the("Subtitulo")
            .located(By.xpath("//*[@id=\"center_column\"]/div/p"));
    public static final  Target TEXT_EMAIL = Target.the("Texto Email Address")
            .located(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/div/label"));
    public static final  Target FIELD_EMAIL = Target.the("Campo email")
            .located(By.id("email"));
    public static final  Target BUTTON_RETRIEVE = Target.the("Boton recuperar contraseña")
            .located(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p"));
}
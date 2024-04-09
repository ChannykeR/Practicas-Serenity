package starter.ui.AutomationPracticeUI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class HomeUI {

    public static final Target BUTTON_SIGNIN = Target.the("Botón Sign ing")
            .located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));


}
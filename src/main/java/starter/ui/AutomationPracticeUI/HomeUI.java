package starter.ui.AutomationPracticeUI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {
    public static final Target BUTTON_TSHIRT = Target.the("Boton TSHIRT")
            .located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
}

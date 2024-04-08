package starter.ui.AutomationPracticeUI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class SearchsUI {
    public static final Target CATALOG_TITTLE = Target.the("Titulo de catalogo")
            .located(By.className("title_block active"));
}

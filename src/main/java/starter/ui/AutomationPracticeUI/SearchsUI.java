package starter.ui.AutomationPracticeUI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class SearchsUI {
    public static final Target CATALOG_TITTLE = Target.the("Titulo de catalogo")
            .located(By.xpath("//*[@id=\"layered_block_left\"]/p"));

    public static final Target CATEGORY_SEARCH = Target.the("Categoria Search")
            .located(By.xpath("//*[@id=\"center_column\"]/div[1]/div[2]/div[2]"));

}

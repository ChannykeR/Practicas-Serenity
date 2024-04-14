package starter.ui.DemoQAUI;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class HomeDemoQaUI {

    public static final Target TITTLE_BOOK3 = Target.the("Titulo del tercer libro")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[2]"));

    public static final Target AUTOR_BOOK3 = Target.the("Autor del tercer libro")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[3]"));

    public static final Target PUBLISHER_BOOK3 = Target.the("publicado libro")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[4]"));

    public static final Target BUTTON_BOOKSTORE = Target.the("Botón Book Store")
            .located(By.xpath("//*[@id=\"item-2\"]/span"));
}

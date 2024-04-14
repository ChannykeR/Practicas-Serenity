package starter.ui.AutomationPracticeUI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {
    public static final Target BUTTON_TSHIRT = Target.the("Boton TSHIRT")
            .located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));

    public static final Target SEARCH_BOX = Target.the("Cuadro de busqueda")
            .located(By.id("search_query_top"));

    public static final Target BUTTON_SEARCH = Target.the("boton de busqueda")
            .located(By.xpath("//*[@id='searchbox']/button"));

    public static final Target BUTTON_BESTSELLERS = Target.the("boton de mas vendidos")
            .located(By.xpath("//*[@id=\"home-page-tabs\"]/li[2]/a"));

    public static final Target FIELD_NAME = Target.the("campo del nombre")
            .located(By.xpath("//*[@id=\"blockbestsellers\"]/li[1]/div/div[2]/h5"));

    public static final Target NAME_BLOUSE = Target.the("Nombre del producto")
            .located(By.xpath("//*[@id=\"blockbestsellers\"]/li[1]/div/div[2]/h5/a"));

    public static final Target ADD_BUTTON = Target.the("Boton añadir al carrito")
            .located(By.xpath("//*[@id=\"blockbestsellers\"]/li[1]/div/div[2]/div[2]"));
}

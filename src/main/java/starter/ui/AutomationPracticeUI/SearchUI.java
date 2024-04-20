package starter.ui.AutomationPracticeUI;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchUI {

    public static final Target SEARCH_FIELD = Target.the("Search label")
            .located(By.xpath("//*[@id=\"search_query_top\"]"));

    public static final Target SEARCH_BUTTON = Target.the("Search button")
            .located(By.xpath("//*[@id=\"searchbox\"]/button"));

    public static final Target PRODUCTT = Target.the("Product")
            .located(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div"));

    public static final Target LABEL_DRESS = Target.the("Label Dress")
            .located(By.xpath("//*[@id='center_column']/h1/span[1]"));

    public static final Target RESULTS_QUANTITY = Target.the("Result quantity")
            .located(By.xpath("//*[@id=\"center_column\"]/h1/span[2]"));


}

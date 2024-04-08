package starter.ui.ShoppinUI.Activities;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SemanaUnoUI {

    public static final Target ADDRESS = Target.the("Direccion de la empresa")
            .located(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[1]"));

    public static final Target PHONE = Target.the("Telefono de contacto")
            .located(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[2]/span"));

    public static final Target EMAIL = Target.the("Email de trabajo")
            .located(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[3]/span/a"));

    public static final Target SEARCH_BAR = Target.the("Barra de busqueda")
            .located(By.id("search_query_top"));

    public static final Target SEARCH_BUTTON = Target.the("Barra de busqueda")
            .located(By.xpath("//*[@id=\"searchbox\"]/button"));



}
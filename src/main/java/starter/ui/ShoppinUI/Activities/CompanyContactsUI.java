package starter.ui.ShoppinUI.Activities;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompanyContactsUI {

    public static final Target ADDRESS = Target.the("Direccion de la empresa")
            .located(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[1]"));

    public static final Target PHONE = Target.the("Telefono de contacto")
            .located(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[2]/span"));

    public static final Target EMAIL = Target.the("Email de trabajo")
            .located(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[3]/span/a"));
}

package starter.ui.AutomationPracticeUI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FooterUI {

    public static final Target Direction = Target.the("Direction")
            .located(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[1]/text()\n"));

    public static final Target Phone = Target.the("Phone")
            .located(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[2]/span"));

    public static final Target Email = Target.the("Email")
            .located(By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[3]/span/a"));

}

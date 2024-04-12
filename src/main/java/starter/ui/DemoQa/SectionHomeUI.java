package starter.ui.DemoQa;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SectionHomeUI {

    public static final Target BUTTON_ELEMENTS = Target.the("")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));

}

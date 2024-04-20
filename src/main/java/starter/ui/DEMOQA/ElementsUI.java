package starter.ui.DEMOQA;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementsUI {
    public static final net.serenitybdd.screenplay.targets.Target BUTTON_ELEMENTS = Target.the("Botón elementos")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));

    public static final net.serenitybdd.screenplay.targets.Target RADIO_BUTTON = Target.the("Botón rdio boton")
            .located(By.xpath("//*[@id=\"item-2\"]"));
    public static final net.serenitybdd.screenplay.targets.Target RADIO_BUTTON_YES = Target.the("Botón yes")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/label"));
    public static final net.serenitybdd.screenplay.targets.Target TEXT_YES = Target.the("testo yess")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/p/span"));

    public static final net.serenitybdd.screenplay.targets.Target RADIO_BUTTON_IMPRESSIVE = Target.the("boton impressive")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/label"));

    public static final net.serenitybdd.screenplay.targets.Target TEXT_IMPRESSIVE = Target.the("testo impressive")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/p/span"));

    public static final net.serenitybdd.screenplay.targets.Target BUTTON_NO = Target.the("Botón no")
            .located(By.id("noRadio"));

    public static final net.serenitybdd.screenplay.targets.Target TITTLE_RADIO_BUTTON = Target.the("titulo radio button")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/h1 "));
}

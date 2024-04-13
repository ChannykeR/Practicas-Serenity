package starter.ui.DemoQa;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SectionBooksStoreUI {

    //Esta mal ubicado mover a donde corresponde ya que pertenece al Home
    public static final Target CARD_BUTTON_BOOK_STORE = Target.the("Card books tore aplication")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]"));

    //Esta mal ubicado mover a donde corresponde ya que pertenece al Home
    public static final Target OPTION_BOOK_STORE = Target.the("opcion de BooksTore de la seccion BookSotreAplication")
            .located(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[6]/div/ul/li[2]"));

    public static final Target SECTION_BOOK_STORE_APPLICATION = Target.the("seccion de BookStoreApplication")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[6]/span/div/div[1]"));

    public static final Target ONE_BOOK_IMAGE = Target.the("imagen del libro 1 de la seccion de BookStoreApplication")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/img"));

    public static final Target ONE_BOOK_TITLE = Target.the("titulo del libro 1 de la seccion de BookStoreApplication")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div"));
    public static final Target ONE_BOOK_AUTHOR = Target.the("autor del libro 1 de la seccion de BookStoreApplication")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[3]"));
    public static final Target ONE_BOOK_PUBLISHER = Target.the("editor del libro 1 de la seccion de BookStoreApplication")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[4]"));
    public static final Target TWO_BOOK_IMAGE = Target.the("imagen del libro 2 de la seccion de BookStoreApplication")
            .located(By.xpath(""));
    public static final Target TWO_BOOK_TITLE = Target.the("titulo del libro 2 de la seccion de BookStoreApplication")
            .located(By.xpath("//*[@id=\"item-2\"]"));
    public static final Target TWO_BOOK_AUTHOR = Target.the("autor del libro 2 de la seccion de BookStoreApplication")
            .located(By.xpath("//*[@id=\"item-2\"]"));
    public static final Target TWO_BOOK_PUBLISHER = Target.the("editor del libro 2 de la seccion de BookStoreApplication")
            .located(By.xpath("//*[@id=\"item-2\"]"));
}

package starter.ui.DemoQa;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SectionElementsUI {


    public static final Target BUTTON_TEXTO_BOX = Target.the("boton de text box")
            .located(By.id("item-0"));

    public static final Target TITLE_TEXT_BOX = Target.the("titulo de text box")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/h1"));

    public static final Target TEXT_FULL_NAME_TEXT_BOX = Target.the("texto de nombre completo de la pantalla textbox")
            .located(By.id("userName-label"));

    public static final Target FIELD_FULL_NAME_TEXT_BOX = Target.the("campo de nombre completo de la pantalla textbox")
            .located(By.id("userName"));

    public static final Target TEXT_EMAIL_TEXT_BOX = Target.the("texto de email de la pantalla textbox")
            .located(By.xpath("//*[@id=\"userEmail-label\"]"));

    public static final Target FIELD_EMAIL_TEXT_BOX = Target.the("campo de email de la pantalla textbox")
            .located(By.id("userEmail"));

    public static final Target TEXT_CURRENT_ADDRESS_TEXT_BOX = Target.the("texto de direccion actual de la pantalla textbox")
            .located(By.id("currentAddress-label"));

    public static final Target FIELD_CURRENT_ADDRESS_TEXT_BOX = Target.the("campo de direccion actual de la pantalla texbox")
            .located(By.id("currentAddress"));

    public static final Target TEXT_PERMANENT_ADDRESS_TEXT_BOX = Target.the("texto de direccion permanente de la pantalla textbox")
            .located(By.xpath("//*[@id=\"permanentAddress-label\"]"));

    public static final Target FIELD_PERMANENT_ADDRESS_TEXT_BOX = Target.the("campo de direccion pernanente de la pantalla textbox")
            .located(By.id("permanentAddress"));

    public static final Target BUTTON_SUBMIT_TEXT_BOX = Target.the("botón de enviar de la pantalla textbox")
            .located(By.id("submit"));

    public static final Target RESULT_NAME_TEXT_BOX = Target.the("resultado del nombre del formulario de la pantalla textbox")
            .located(By.id("name"));

    public static final Target RESULT_EMAIL_TEXT_BOX = Target.the("resultado del email del formulario de la pantalla textbox")
            .located(By.id("email"));

    public static final Target  RESULT_CURRENT_ADDRESS_TEXT_BOX = Target.the("resultado de la direccion actual del formulario de la pantalla textbox")
            .located(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div/p[3]"));



    public static final Target RESULT_PERMANENT_ADDRESS_TEXT_BOX = Target.the("resultado de la direccion permanente del fomulario de la pantalla textbox")
            .located(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div/p[4]"));

}
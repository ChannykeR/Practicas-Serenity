package starter.ui.DemoQa;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SectionElementsUI {


    public static final Target BUTTON_TEXT_BOX = Target.the("boton de text box")
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

    public static final Target BUTTON_CHECK_BOX = Target.the("boton de checkbox")
            .located(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[2]"));

    public static final Target TEXT_CHECK_BOX = Target.the("texto de checkbox")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/h1"));


    public static final Target CHECK_OFF_TEXT_HOME_CHECK_BOX = Target.the("check sin seleccionar del texto home en la pantalla de checkbox")
            .located(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/span/label/span[1]"));

    /*
    public static final Target CHECK_ON_TEXT_HOME_CHECK_BOX = Target.the("check seleccionado del boton home en la pantalla de chekbox")
            .located(By.className());
     */

    public static final Target BUTTON_RADIO_BUTTON = Target.the("boton de RadioButton")
            .located(By.xpath("//*[@id=\"item-2\"]"));

    public static final Target TITLE_RADIO_BUTTON = Target.the("titulo de RadioButton")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/h1"));

    public static final Target BUTTON_YES_RADIO_BUTTON = Target.the("texto y boton de si de la pantalla RadioButton")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/label"));


    public static final Target BUTTON_IMPRESSIVE_RADIO_BUTTON = Target.the("texto y boton de impressive de la pantalla RadioButton")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/label"));

    public static final Target TEXT_BUTTON_SELECTED_RADIO_BUTTON = Target.the("texto que se visualiza al seleccionar los botones de la pantalla RadioButton")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/p"));

}
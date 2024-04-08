package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;

public class NavigateTo {
    public static Performable theSearchHomePage() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(DuckDuckGoHomePage.class));
    }

    public static Performable toTheCatalog() {
        return Open.url("https://www.saucedemo.com/inventory.html");
    }

    public static Performable automatioPractice() {
        return Open.url("http://www.automationpractice.pl/index.php");
    }

    public static Performable toTheshoppingCart() {
        return Click.on(".shopping_cart_link");
    }
}

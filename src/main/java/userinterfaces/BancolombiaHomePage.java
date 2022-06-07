package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.className;

@DefaultUrl("https://www.bancolombia.com/personas")


public class BancolombiaHomePage extends PageObject {
    public static final Target POP_UP = the("pop up")
            .located(className("modal-prehome-fenix-header-info-close"));
}

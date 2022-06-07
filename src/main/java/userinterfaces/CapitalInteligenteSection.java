package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.*;

public class CapitalInteligenteSection extends PageObject {

    public static final Target ACTIVIDAD_ECONOMICA_BUTTOM = the("pop up")
            .located(xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a"));
    public static final Target GRID_BUTTOM = the("pop up")
            .located(id("btnGrid"));
    public static final Target NEWS_BUTTOM = the("pop up")
            .located(xpath("//div[@id=\"capital_inteligente\"]/div[2]/div[52]/h2/a"));
    public static final Target DOWNLOAD_BUTTOM = the("pop up")
            .located(xpath("//div[@id=\"main-content\"]/div[2]/div[1]/div/div[1]/p[10]/a"));
}

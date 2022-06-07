package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class BancolombiaEmpresasSection extends PageObject {

    public static final Target EMPRESAS_BUTTOM = the("where we can click on empresas buttom")
            .located(id("header-empresas"));
    public static final Target CAPITAL_INTELIGENTE_BUTTOM = the("where we can click on capital inteligente buttom")
            .located(xpath("//div[@class='menu-inferior']/nav/ul/li[5]/a"));

}

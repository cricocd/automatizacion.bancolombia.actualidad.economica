package tasks;

import interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.BancolombiaEmpresasSection;
import userinterfaces.CapitalInteligenteSection;

import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static userinterfaces.BancolombiaEmpresasSection.*;
import static userinterfaces.CapitalInteligenteSection.*;

public class SearchNewsEconomic implements Task {


    public static SearchNewsEconomic andDownload(){
        return Tasks.instrumented(SearchNewsEconomic.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                the(EMPRESAS_BUTTOM, isVisible()).forNoMoreThan(10).seconds(),
                on(EMPRESAS_BUTTOM),
                on(CAPITAL_INTELIGENTE_BUTTOM),
                SwitchToNewWindow.switchToNewTab(),
                on(ACTIVIDAD_ECONOMICA_BUTTOM),
                on(GRID_BUTTOM),
                on(NEWS_BUTTOM),
                on(DOWNLOAD_BUTTOM)
        );

    }
}

package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Set;


import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SwitchToNewWindow implements Task {

    public static SwitchToNewWindow switchToNewTab(){
        return Instrumented.instanceOf(SwitchToNewWindow.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        for(String window : allWindows){
            if(!window.contentEquals(currentWindow)){
                getDriver().switchTo().window(window);
                break;
            }
        }
    }


}



package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterfaces.BancolombiaHomePage;

import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Open.browserOn;
import static userinterfaces.BancolombiaHomePage.*;

public class Open implements Task {

    private BancolombiaHomePage bancolombiaHomePage;

    public static Open bancolombiaHomePage() {

        return Tasks.instrumented(Open.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                browserOn(bancolombiaHomePage),
                on(POP_UP)
        );
    }
}

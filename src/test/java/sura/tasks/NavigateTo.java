package sura.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import sura.ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateTo implements Task {


    @Override
    @Step("{0} abre la aplicación")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(LoginPage.class));
    }

    public static Performable mainPage() {
        return instrumented(NavigateTo.class);
    }
}

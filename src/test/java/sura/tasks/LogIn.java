package sura.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import sura.enumerators.User;
import sura.ui.LoginPage;

public class LogIn implements Task {

    private User user;

    LogIn (User user){
        this.user = user;
    }
    public static Performable as(User user) {
        return Instrumented.instanceOf(LogIn.class).withProperties(user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getUsuario()).into(LoginPage.USERNAME),
                Enter.theValue(user.getClave()).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BTN));
    }



}

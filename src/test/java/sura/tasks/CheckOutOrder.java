package sura.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import sura.models.PersonalInfo;
import sura.ui.CheckOutPage;

import static sura.ui.CheckOutPage.*;

public class CheckOutOrder implements Task {

    private PersonalInfo infoData;

    CheckOutOrder (PersonalInfo infoData){
        this.infoData = infoData;
    }

    public static Performable fillInForm (PersonalInfo infoData){
        return Instrumented.instanceOf(CheckOutOrder.class).withProperties(infoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(infoData.getFirstName()).into(FIRST_NAME_INPUT),
                Enter.theValue(infoData.getLastName()).into(LAST_NAME_INPUT),
                Enter.theValue(infoData.getZipCode()).into(ZIPCODE_INPUT)
        );
    }
}

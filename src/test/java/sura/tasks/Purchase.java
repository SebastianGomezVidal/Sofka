package sura.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import sura.interactions.AddOrRemoveFromCart;

public class Purchase implements Task {

    private Integer itemNumber;

    Purchase (Integer itemNumber) { this.itemNumber = itemNumber; }

    public static Performable item (Integer itemNumber){
        return Instrumented.instanceOf(Purchase.class).withProperties(itemNumber);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( AddOrRemoveFromCart.productNumber(itemNumber));
    }
}

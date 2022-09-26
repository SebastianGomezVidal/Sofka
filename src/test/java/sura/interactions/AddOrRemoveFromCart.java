package sura.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class AddOrRemoveFromCart implements Interaction {

    private Integer itemNumber;

    AddOrRemoveFromCart(Integer itemNumber) { this.itemNumber = itemNumber; }

    public static Performable productNumber(Integer itemNumber) {
        return Instrumented.instanceOf(AddOrRemoveFromCart.class).withProperties(itemNumber);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on(ListOfProducts.itemButton(actor, itemNumber)));
    }
}

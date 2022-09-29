package sura.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import sura.interactions.ClickFrom;

public class SelectFromCatalogue implements Task {

    private final Integer itemNumber;

    SelectFromCatalogue(Integer itemNumber) { this.itemNumber = itemNumber; }

    public static Performable item (Integer itemNumber){
        return Instrumented.instanceOf(SelectFromCatalogue.class).withProperties(itemNumber);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( ClickFrom.catalogueProductButtonWithPosition(itemNumber));
    }
}

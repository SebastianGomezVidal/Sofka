package sura.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import sura.interactions.Sort;
import sura.enumerators.Option;

public class OrganizeProducts implements Task {
    private Option option;

    OrganizeProducts(Option option){
        this.option = option;
    }

    public static Performable orderedBy(Option option) {
        return Instrumented.instanceOf(OrganizeProducts.class).withProperties(option);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Sort.itemsBy(option));
    }
}

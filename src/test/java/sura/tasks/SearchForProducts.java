package sura.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import sura.interactions.Sort;
import sura.enumerators.Option;

public class SearchForProducts implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Sort.itemsBy(option)
        );
    }

    private Option option;

    SearchForProducts(Option option){
        this.option = option;
    }

    public static Performable ordered (Option option) {
        return Instrumented.instanceOf(SearchForProducts.class).withProperties(option);
    }
}

package sura.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import sura.enumerators.Option;
import sura.ui.ProductPage;

public class Sort implements Interaction {

    private Option option;

    Sort(Option option) {
        this.option = option;
    }

    public static Performable itemsBy(Option option) {
        return Instrumented.instanceOf(Sort.class).withProperties(option);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ProductPage.SORT_MENU),
                SelectFromOptions.byValue(option.getOption()).from(ProductPage.SORT_MENU)
        );
    }
}

package sura.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import sura.ui.CataloguePage;

import static sura.ui.CataloguePage.*;
import static sura.ui.CataloguePage.ITEM_BUTTON;

public class ClickFrom {
    public static Performable catalogueProductButtonWithPosition(int itemNumber) {
        return Task.where(
                Click.on(ITEM_BUTTON.of(String.valueOf(itemNumber))));
    }

    public static Performable catalogueProductTitleWithPosition(int itemNumber) {
        return Task.where(
                Click.on(ITEM_TITLE.of(String.valueOf(itemNumber))));
    }

    public static Performable catalogueProductImageWithPosition(int itemNumber) {
        return Task.where(
                Click.on(ITEM_IMAGE.of(String.valueOf(itemNumber))));
    }

    public static Performable listProductTitleWithPosition(int itemNumber) {
        return Task.where(
                Click.on(ITEM_IMAGE.of(String.valueOf(itemNumber))));
    }

}

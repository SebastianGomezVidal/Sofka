package sura.interactions;

import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import sura.ui.ProductListPage;

import static sura.ui.CataloguePage.*;
import static sura.ui.CataloguePage.ITEM_BUTTON;
import static sura.ui.ProductListPage.LISTED_PRODUCT_BUTTON;
import static sura.ui.ProductListPage.LISTED_PRODUCT_TITLE;

public class ClickFrom {
    public static Performable catalogueProductButtonWithPosition(int itemNumber) {
        return Task.where(
                WaitUntil.the(ITEM_BUTTON.of(String.valueOf(itemNumber)),
                                WebElementStateMatchers.isVisible()),
                Click.on(ITEM_BUTTON.of(String.valueOf(itemNumber))));
    }

    public static Performable catalogueProductTitleWithPosition(int itemNumber) {
        return Task.where(
                WaitUntil.the(ITEM_TITLE.of(String.valueOf(itemNumber)),
                        WebElementStateMatchers.isVisible()),
                Click.on(ITEM_TITLE.of(String.valueOf(itemNumber))));
    }

    public static Performable catalogueProductImageWithPosition(int itemNumber) {
        return Task.where(
                WaitUntil.the(ITEM_IMAGE.of(String.valueOf(itemNumber)),
                        WebElementStateMatchers.isVisible()),
                Click.on(ITEM_IMAGE.of(String.valueOf(itemNumber))));
    }

    public static Performable listProductButtonWithPosition(int itemNumber) {
        return Task.where(
                WaitUntil.the(LISTED_PRODUCT_BUTTON.of(String.valueOf(itemNumber)),
                        WebElementStateMatchers.isVisible()),
                Click.on(LISTED_PRODUCT_BUTTON.of(String.valueOf(itemNumber+2))));
    }
    public static Performable listProductTitleWithPosition(int itemNumber) {
        return Task.where(
                WaitUntil.the(LISTED_PRODUCT_TITLE.of(String.valueOf(itemNumber)),
                        WebElementStateMatchers.isVisible()),
                Click.on(LISTED_PRODUCT_TITLE.of(String.valueOf(itemNumber))));
    }
}

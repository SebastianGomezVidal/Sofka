package sura.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import sura.ui.ProductPage;

import java.util.List;

public class ListOfProducts {
    public static String firstItemTitle(Actor actor) {
        List<WebElementFacade> allProducts = BrowseTheWeb.as(actor).findAll(ProductPage.INVENTORY_LIST);
        return allProducts.get(0).getText();
    }

    public static WebElementFacade itemButton (Actor actor, Integer number) {
        List<WebElementFacade> allButtons = BrowseTheWeb.as(actor).findAll(ProductPage.ITEM_BUTTONS);
        return allButtons.get(number-1);
    }
}

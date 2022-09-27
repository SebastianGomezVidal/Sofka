package sura.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import sura.ui.ProductPage;

import java.util.List;

public class ProductItem {
    public static String itemTitleText(Actor actor, Integer itemNumber) {
        List<WebElementFacade> allTitles = BrowseTheWeb.as(actor).findAll(ProductPage.TITLES_LIST);
        return allTitles.get(itemNumber-1).getText();
    }
    public static WebElementFacade titleElement(Actor actor, Integer itemNumber) {
        List<WebElementFacade> allTitleElements = BrowseTheWeb.as(actor).findAll(ProductPage.TITLES_LIST);
        return allTitleElements.get(itemNumber-1);
    }
    public static WebElementFacade buttonElement(Actor actor, Integer  itemNumber) {
        List<WebElementFacade> allButtons = BrowseTheWeb.as(actor).findAll(ProductPage.ITEM_BUTTONS_LIST);
        return allButtons.get(itemNumber-1);
    }
    public static WebElementFacade imageElement(Actor actor, Integer  itemNumber) {
        List<WebElementFacade> allImages = BrowseTheWeb.as(actor).findAll(ProductPage.ITEM_IMAGES_LIST);
        return allImages.get(itemNumber-1);
    }
}

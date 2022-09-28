package sura.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import sura.ui.ProductListPage;

import java.util.List;

import static sura.ui.ProductListPage.ALL_PRODUCTS_LISTED;

public class ListedItems {

    public static Integer numberOfProductListed(Actor actor) {
        List<WebElementFacade> listed = BrowseTheWeb.as(actor).findAll(ALL_PRODUCTS_LISTED);
        return listed.size()-2;
    }
}


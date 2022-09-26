package sura.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class ProductPage {

    public static final By INVENTORY_LIST = By.cssSelector(".inventory_list");
    public static final By ITEM_BUTTONS = By.cssSelector(".inventory_item_description>.pricebar:last-child") ;
    public static final Target HEADING_TEXT_TITLE =
            Target
                    .the("product title")
                    .locatedBy(".header_secondary_container>.title");
    public static final Target SORT_MENU =
            Target
                    .the("dropdown menu")
                    .locatedBy("[data-test ='product_sort_container']");

    public static final Target CART_BADGE =
            Target
                    .the("Badge Showing the total of added products to cart")
                    .locatedBy("#shopping_cart_container .shopping_cart_badge ");



}

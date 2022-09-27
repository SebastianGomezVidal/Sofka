package sura.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
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
                    .locatedBy("#shopping_cart_container .shopping_cart_badge");

    public static final By TITLES_LIST = By.cssSelector(".inventory_item .inventory_item_name");
    public static final By ITEM_BUTTONS_LIST = By.cssSelector(".inventory_item_description>.pricebar:last-child") ;

    public static final Target ITEM_IMAGES_LIST =
            Target
                    .the("Images of all displayed products")
                    .locatedBy(".inventory_item_img .inventory_item_img");

}

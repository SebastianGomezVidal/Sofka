package sura.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductListPage {

    public static final Target ALL_PRODUCTS_LISTED =
            Target
                    .the("products added to the list")
                    .locatedBy("div.cart_list");
    public static final Target PRODUCTS_LISTED =
            Target
                    .the("products added to the list")
                    .locatedBy("div.cart_list>div:nth-child({0})");

    public static final Target LISTED_PRODUCT_BUTTON =
            Target
                    .the("listed product button")
                    .locatedBy("div.cart_list>div:nth-child({0})>.cart_item_label>.item_pricebar:last-child");

    public static final Target LISTED_PRODUCT_TITLE =
            Target
                    .the("listed product title")
                    .locatedBy("div.cart_list>div:nth-child({0})>.cart_item_label .inventory_item_name");

    public static final Target CONTINUE_SHOPPING_BUTTON =
            Target
                    .the("cart continue shopping button")
                    .locatedBy("[data-test='continue-shopping']");

    public static final Target CHECKOUT_BUTTON =
            Target
                    .the("checkout button")
                    .locatedBy("[data-test='checkout']");




}

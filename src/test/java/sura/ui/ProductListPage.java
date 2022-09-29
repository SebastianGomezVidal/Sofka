package sura.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage {

    public static final Target ALL_PRODUCTS_LISTED =
            Target
                    .the("products added to the list")
                    .locatedBy("div.cart_list .cart_item");

    public static final Target LISTED_PRODUCT_TITLE =
            Target
                    .the("listed product button")
                    .locatedBy("div.cart_list>div:nth-child({0}) .inventory_item_name");

    public static final Target LISTED_PRODUCT_BUTTON =
            Target
                    .the("products added to the list")
                    .locatedBy(".cart_list>div:nth-child({0}) .item_pricebar:last-child");

    public static final Target CONTINUE_SHOPPING_BUTTON =
            Target
                    .the("cart continue shopping button")
                    .locatedBy("[data-test='continue-shopping']");

    public static final Target CHECKOUT_BUTTON =
            Target
                    .the("checkout button")
                    .locatedBy("[data-test='checkout']");




}

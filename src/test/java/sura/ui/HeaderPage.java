package sura.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HeaderPage {

    public static final Target HEADING_TEXT_TITLE =
            Target
                    .the("product title")
                    .locatedBy(".header_secondary_container>.title");

    public static final Target CART_BADGE =
            Target
                    .the("Badge pressable icon")
                    .locatedBy("#shopping_cart_container .shopping_cart_link");

    public static final Target CART_BADGE_NUMBER =
            Target
                    .the("Badge number of items")
                    .locatedBy("#shopping_cart_container .shopping_cart_link .shopping_cart_badge");



}

package sura.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target HEADING_TEXT_TITLE =
            Target
                    .the("cart title")
                    .locatedBy(".header_secondary_container>.title");

    public static final Target CHECK_OUT_BUTTON =
            Target
                    .the("cart checkout button")
                    .locatedBy("[data-test='checkout']");

    public static final Target CONTINUE_SHOPPING_BUTTON =
            Target
                    .the("cart continue shopping button")
                    .locatedBy("[data-test='continue-shopping']");

    public static final By TITLES_LIST = By.cssSelector(".cart_item_label .inventory_item_name");

    public static final By ITEM_BUTTONS_LIST = By.cssSelector(".item_pricebar:last-child");
}

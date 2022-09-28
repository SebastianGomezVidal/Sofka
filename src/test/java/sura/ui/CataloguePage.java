package sura.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CataloguePage {

    public static final Target ITEM_BUTTON =
            Target.the("catalogue product button")
                    .locatedBy(".inventory_list>div.inventory_item:nth-child({0}) .pricebar:last-child");

    public static final Target ITEM_TITLE =
            Target.the("catalogue product item")
                    .locatedBy(".inventory_list>div.inventory_item:nth-child({0}) .inventory_item_name");

    public static final Target ITEM_IMAGE =
            Target.the("catalogue product image")
                    .locatedBy(".inventory_list>.inventory_item:nth-child({0}) .inventory_item_img:last-child");
    public static final Target SORT_MENU =
            Target
                    .the("catalogue dropdown menu")
                    .locatedBy("[data-test ='product_sort_container']");





}

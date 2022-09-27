package sura.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductDetailsPage {

    public static final Target DETAILED_ITEM_TITLE =
            Target
                    .the("Title of selected detailed product")
                    .locatedBy(".inventory_details .inventory_details_name.large_size");

    public static final Target DETAILED_ITEM_IMAGE =
            Target
                    .the("Images of selected display product")
                    .locatedBy(".inventory_details .inventory_details_img");

    public static final Target DETAILED_ITEM_BUTTON =
            Target
                    .the("Add or remove Button")
                    .locatedBy(".inventory_details_desc_container:last-child");

    public static final Target DETAILED_ITEM__BACK_BUTTON =
            Target
                    .the("Add or remove Button")
                    .locatedBy("[data-test='back-to-products']");


}

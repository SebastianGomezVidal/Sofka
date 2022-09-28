package sura.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckOutPage {

    public static Target FIRST_NAME_INPUT = Target
            .the("first name textbox")
            .locatedBy("[data-test='firstName']");

    public static Target LAST_NAME_INPUT = Target
            .the("last name textbox")
            .locatedBy("[data-test='lastName']");

    public static Target ZIPCODE_INPUT = Target
            .the("zipcode textbox")
            .locatedBy("[data-test='postalCode']");

    public static Target CANCEL_BUTTON = Target
            .the("cancel button")
            .locatedBy("data-test='cancel'");

    public static Target CONTINUE_BUTTON = Target
            .the("cancel button")
            .locatedBy("[data-test='continue']");

}

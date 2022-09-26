package sura.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https:/saucedemo.com")
public class LoginPage extends PageObject {

    public static final Target USERNAME = Target
            .the("UsernameTextBox")
            .locatedBy("[data-test ='username']");

    public static final Target PASSWORD = Target
            .the("PasswordTextBox")
            .locatedBy("[data-test='password']");

    public static final Target LOGIN_BTN = Target
            .the("LogIn Button")
            .locatedBy("[data-test='login-button']");

    public static final Target ERROR_MESSAGE = Target
            .the("User is locked out")
            .locatedBy("[data-test='error']");
}

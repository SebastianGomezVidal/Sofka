package sura.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class FooterPage {

    @FindBy(css = ".footer .social_twitter")
    WebElement twitterAnchor;

    @FindBy(css = ".footer .social_facebook")
    WebElement facebookAnchor;

    @FindBy(css = ".footer .social_linkedin")
    WebElement linkedinAnchor;

    @FindBy(css = ".footer>.footer_copy")
    WebElement copyRightAnchor;
}

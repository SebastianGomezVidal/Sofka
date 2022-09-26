package sura.stepDefinitions;

import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import sura.tasks.LogIn;
import sura.tasks.NavigateTo;
import sura.utils.Tools;

public class SharedBackgroundSteps extends PageObject {

    @Dado("que {actor} ingresa con una cuenta valida como la de {string} a Swaglabs")
    public void ingresaConUnaCuentaValidaASwaglabs(Actor actor, String userType) {
        actor.attemptsTo(
                NavigateTo.mainPage(),
                LogIn.as(Tools.getUserType(userType))
        );
    }
}

package sura.stepDefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import sura.models.PersonalInfo;
import sura.tasks.CheckOutOrder;
import sura.ui.HeaderPage;

import static sura.ui.CheckOutPage.CONTINUE_BUTTON;
import static sura.ui.HeaderPage.HEADING_TEXT_TITLE;

public class CheckOutSteps {

    @Dado("{actor} ingresa {string}, {string} y {string}")
    public void ingresaDatosPersonales(Actor actor, String firstName, String lastName, String zip) {
        actor.attemptsTo(CheckOutOrder.fillInForm(new PersonalInfo (firstName, lastName, zip)));
    }
    @Dado("{actor} hace click en el boton de continuar")
    public void clickEnCheckOut(Actor actor) {
        actor.attemptsTo(Click.on(CONTINUE_BUTTON));
    }
    @Entonces("{actor} es redirigida a la pagina de {string}")
    public void paginaDeOverview(Actor actor, String term) {
        actor.attemptsTo(Ensure.that(HEADING_TEXT_TITLE).text().contains(term));
    }
}

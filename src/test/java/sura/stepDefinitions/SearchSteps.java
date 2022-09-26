package sura.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import sura.interactions.ListOfProducts;
import sura.tasks.LogIn;
import sura.tasks.NavigateTo;
import sura.tasks.SearchForProducts;
import sura.utils.Tools;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchSteps {

    @Managed
    WebDriver driver;

    SharedBackgroundSteps background;

    @Cuando("{actor} selecciona la opcion {string} del menu desplegable")
    public void seleccionaLaOpcionDelMenuDesplegable(Actor actor, String opcion) {
        actor.attemptsTo(
                SearchForProducts.ordered(Tools.getDropDownValue(opcion))
        );
    }
    @Entonces("{actor} ve que el primer articulo contiene la palabra {string}")
    public void anaVeQueElPrimerArticuloContieneLaPalabraJacket(Actor actor, String term) {
        Ensure.that(ListOfProducts.firstItemTitle(actor)).contains(term);
    }

}

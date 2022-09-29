package sura.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import sura.tasks.OrganizeProducts;
import sura.ui.CataloguePage;
import sura.utils.Enumerator;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static sura.ui.CataloguePage.ITEM_TITLE;

public class SortProductsSteps {

    @Cuando("{actor} selecciona la opcion {string} del menu desplegable")
    public void seleccionaLaOpcionDelMenuDesplegable(Actor actor, String opcion) {
        actor.attemptsTo(
                OrganizeProducts.orderedBy(Enumerator.getDropDownValue(opcion))
        );
    }
    @Entonces("{actor} nota que el {string} articulo contiene la palabra {string}")
    public void notaQueElPrimerArticuloContieneLaPalabra(Actor actor, String itemNumber, String term) {
        actor.attemptsTo(Ensure.that(ITEM_TITLE.of(itemNumber)).text().contains(term));
    }

}

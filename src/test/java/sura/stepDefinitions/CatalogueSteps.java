package sura.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import sura.tasks.SelectFromCatalogue;
import sura.ui.HeaderPage;
import sura.ui.ProductListPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static sura.ui.HeaderPage.*;
import static sura.ui.HeaderPage.CART_BADGE_NUMBER;

public class CatalogueSteps {

    @Cuando("{actor} hace click en el boton del {int} articulo")
    public void haceClickEnElBotonDelArticulo(Actor actor,Integer number) {
        actor.attemptsTo(SelectFromCatalogue.item(number));
    }

    @Cuando("{actor} hace click en el boton del carrito")
    public void haceClickEnElBotonDelCarrito(Actor actor) {
        actor.attemptsTo(Click.on(CART_BADGE));
    }

    @Entonces("{actor} ve {string} items en el icono del carrito de compras")
    public void veQueElIconoDelCarritoMuestraProductosEnLaBolsa(Actor actor, String term) {
        actor.attemptsTo(Ensure.that(CART_BADGE).text().contains(term));
    }

    @Entonces("{actor} pasa a la pagina {string} de listado de compras")
    public void pasaALaPaginaDeListadoDeDompras(Actor actor, String term) {
        actor.attemptsTo(Ensure.that(HEADING_TEXT_TITLE).text().contains(term));
    }
}

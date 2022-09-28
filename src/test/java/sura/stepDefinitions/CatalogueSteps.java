package sura.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
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

public class CatalogueSteps {

    @Cuando("{actor} hace click en el boton del {int} articulo")
    public void haceClickEnElBotonDelArticulo(Actor actor,Integer number) {
        actor.attemptsTo( SelectFromCatalogue.item(number));
    }

    @Cuando("{actor} hace click en el boton del carrito")
    public void haceClickEnElBotonDelCarrito(Actor actor) {
        actor.attemptsTo(Click.on(HeaderPage.CART_BADGE));
    }

    @Entonces("{actor} ve {string} items en el icono del carrito de compras")
    public void veQueElIconoDelCarritoMuestraProductosEnLaBolsa(Actor actor, String term) {
        Ensure.that(HeaderPage.CART_BADGE_NUMBER).hasText(term);
    }

    @Entonces("pasa a la pagina {string} de listado de compras")
    public void pasaALaPaginaDeListadoDeDompras(String term) {
        Ensure.that(HeaderPage.HEADING_TEXT_TITLE).hasText(term);
    }
}

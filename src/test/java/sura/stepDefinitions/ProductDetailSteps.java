package sura.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import sura.interactions.ClickFrom;
import sura.tasks.SelectFromCatalogue;
import sura.ui.HeaderPage;
import sura.ui.ProductDetailsPage;

import static sura.ui.HeaderPage.CART_BADGE;

public class ProductDetailSteps {

    @Cuando("{actor} hace click en el titulo del {int} articulo en catalogo")
    public void haceClickEnElTituloDelArticuloEnCatalogo(Actor actor, Integer productNumber) {
        actor.attemptsTo(
                ClickFrom.catalogueProductTitleWithPosition(productNumber)
        );
    }
    @Cuando("{actor} hace click en la imagen del {int} articulo en catalogo")
    public void haceClickEnLaImagenDelArticuloEnCatalogo(Actor actor, Integer productNumber) {
        actor.attemptsTo(
                ClickFrom.catalogueProductImageWithPosition(productNumber)
        );
    }
    @Cuando("{actor} añade el {int} articulo del catalogo")
    public void ana_anade_el_articulo_del_catalogo(Actor actor,Integer number) {
        actor.attemptsTo(SelectFromCatalogue.item(number));
    }

    @Cuando("{actor} hace click en el icono del carro de compras")
    public void haceClickEnElIconoDelCarroDeCompras(Actor actor) {
        actor.attemptsTo(
                Click.on(CART_BADGE)
        );
    }
    @Cuando("{actor} hace click en el titulo del {int} articulo de la lista de productos")
    public void haceClickEnElTituloDelArticuloEnLista(Actor actor, Integer listNumber) {
        actor.attemptsTo(
                ClickFrom.listProductTitleWithPosition(1)
        );
    }

    @Entonces("ella es redirigido a los detalles del articulo con titulo {string}")
    public void esRedirigidoALosDetallesDelArticuloConTitulo(String term) {
            Ensure.that(ProductDetailsPage.DETAILED_ITEM_TITLE).hasText(term);
    }


}

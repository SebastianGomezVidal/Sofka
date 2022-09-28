package sura.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import sura.tasks.SelectFromCatalogue;
import sura.ui.CataloguePage;
import sura.ui.HeaderPage;
import sura.ui.ProductListPage;
import sura.utils.ListedItems;


import static sura.ui.ProductListPage.PRODUCTS_LISTED;

public class ListOfProductsSteps {

    @Cuando("{actor} adiciona el {int} item a la lista de compras")
    public void adicionaItemAlaListaDeCompras(Actor actor, Integer productNumber) {
        actor.attemptsTo(SelectFromCatalogue.item(productNumber));
    }
    @Cuando("{actor} hace click en el icono de compras")
    public void haceClickEnElIconoDeCompras(Actor actor) {
        actor.attemptsTo(Click.on(HeaderPage.CART_BADGE));
    }

    @Cuando("{actor} remueve el {int} articulo de la lista")
    public void HaceClickEnElBotonRemover(Actor actor, int removerPosicion) {
        actor.attemptsTo(Click.on(PRODUCTS_LISTED.of(String.valueOf(removerPosicion+2))));
    }

    @Cuando("{actor} hace click en el boton de continuar comprando")
    public void haceClickEnElBotonDeContinuarComprando(Actor actor) {
        actor.attemptsTo(Click.on(ProductListPage.CONTINUE_SHOPPING_BUTTON));
    }


    @Cuando("{actor} hace click en el boton de checkout")
    public void HaceClickEnElBotonDeCheckout(Actor actor) {
        actor.attemptsTo(Click.on(ProductListPage.CHECKOUT_BUTTON));
    }
    @Entonces("{actor} ve que la lista de compras contiene {int} articulo")
    public void veQueLaListaDeComprasContieneArticulos(Actor actor, int totalProducts) {
        Ensure.that(ListedItems.numberOfProductListed(actor)).isEqualTo(totalProducts);
    }

    @Entonces("{actor} ve que la lista de compras esta vacia")
    public void veQueLaListaDeComprasEstaVacia(Actor actor) {
        Ensure.that(ListedItems.numberOfProductListed(actor)).isEqualTo(0);
    }

    @Entonces("ve que regresa al catalogo {string}")
    public void veQueRegresaAlCatalogo(String term) {
        Ensure.that(HeaderPage.HEADING_TEXT_TITLE).hasText(term);
    }


}

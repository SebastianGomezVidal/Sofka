package sura.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import sura.interactions.ClickFrom;
import sura.tasks.SelectFromCatalogue;
import sura.ui.ProductListPage;


import static sura.ui.HeaderPage.*;
import static sura.ui.ProductListPage.ALL_PRODUCTS_LISTED;

public class ListOfProductsSteps {

    @Cuando("{actor} adiciona el {int} item a la lista de compras")
    public void adicionaItemAlaListaDeCompras(Actor actor, Integer productNumber) {
        actor.attemptsTo(SelectFromCatalogue.item(productNumber));
    }
    @Cuando("{actor} hace click en el icono de compras")
    public void haceClickEnElIconoDeCompras(Actor actor) {
        actor.attemptsTo(Click.on(CART_BADGE));
    }

    @Cuando("{actor} remueve el {int} articulo de la lista de compras")
    public void HaceClickEnElBotonRemover(Actor actor, int removerPosicion) {
        actor.attemptsTo(ClickFrom.listProductButtonWithPosition(removerPosicion));
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
            actor.attemptsTo(Ensure.thatAmongst(ALL_PRODUCTS_LISTED).hasSize(totalProducts));
    }

    @Entonces("{actor} ve que regresa al catalogo {string}")
    public void veQueRegresaAlCatalogo(Actor actor, String term) {
        actor.attemptsTo(Ensure.that(HEADING_TEXT_TITLE).text().contains(term));
    }


}

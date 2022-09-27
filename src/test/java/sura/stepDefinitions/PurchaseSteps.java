package sura.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import sura.tasks.Purchase;
import sura.ui.CartPage;
import sura.ui.ProductPage;

public class PurchaseSteps {

    @Managed
    WebDriver driver;

    SharedBackgroundSteps background;

    @Cuando("{actor} hace click en el boton del {int} articulo")
    public void haceClickEnElBotonDelArticulo(Actor actor,Integer number) {
        actor.attemptsTo( Purchase.item(number) );
    }

    @Cuando("{actor} hace click en el boton del carrito")
    public void haceClickEnElBotonDelCarrito(Actor actor) {
        actor.attemptsTo(Click.on(ProductPage.CART_BADGE));
    }

    @Entonces("ve {string} items en el icono del carrito de compras")
    public void veQueElIconoDelCarritoMuestraProductosEnLaBolsa(String totalItemsOnCart) {
        Ensure.that(ProductPage.CART_BADGE).hasText(totalItemsOnCart);
    }


    @Entonces("pasa a la pagina {string} de listado de compras")
    public void pasaALaPaginaDeListadoDeDompras(String term) {
        Ensure.that(CartPage.HEADING_TEXT_TITLE).hasText(term);
    }
}

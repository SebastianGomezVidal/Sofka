package sura.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import sura.interactions.ListOfProducts;
import sura.tasks.LogIn;
import sura.tasks.NavigateTo;
import sura.tasks.Purchase;
import sura.tasks.SearchForProducts;
import sura.ui.ProductPage;
import sura.utils.Tools;

public class PurchaseSteps {

    @Managed
    WebDriver driver;

    SharedBackgroundSteps background;

    @Cuando("{actor} hace click en el boton del {int} articulo")
    public void haceClickEnElBotonDelArticulo(Actor actor,Integer number) {
        actor.attemptsTo( Purchase.item(number) );
    }
    @Entonces("ve {string} items en el icono del carrito de compras")
    public void veQueElIconoDelCarritoMuestraProductosEnLaBolsa(String totalItemsOnCart) {
        Ensure.that(ProductPage.CART_BADGE).hasText(totalItemsOnCart);
    }
}

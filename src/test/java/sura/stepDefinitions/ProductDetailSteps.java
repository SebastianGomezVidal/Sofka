package sura.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import sura.tasks.GetProductFurtherDetails;
import sura.ui.ProductDetailsPage;

public class ProductDetailSteps {

    @Managed
    WebDriver driver;
    SharedBackgroundSteps context;

    @Cuando("{actor} hace click en el titulo del {int} articulo")
    public void haceClickEnElTituloDelArticulo(Actor actor, Integer productNumber) {
        actor.attemptsTo(
                GetProductFurtherDetails.onProductTitle(actor, productNumber)
        );
    }

    @Cuando("{actor} hace click en la imagen del {int} articulo")
    public void haceClickEnLaImagenDelArticulo(Actor actor, Integer productNumber) {
        actor.attemptsTo(
                GetProductFurtherDetails.onProductImage(actor, productNumber)
        );
    }

    @Entonces("el es redirigido a los detalles del articulo con titulo {string}")
    public void esRedirigidoALosDetallesDelArticuloConTitulo(String term) {
            Ensure.that(ProductDetailsPage.DETAILED_ITEM_TITLE).hasText(term);
    }


}

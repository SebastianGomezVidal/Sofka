package sura.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import sura.tasks.LogIn;
import sura.tasks.NavigateTo;
import sura.ui.ProductPage;
import sura.utils.Tools;

import static org.hamcrest.CoreMatchers.is;

public class LoginSteps {

    @Managed
    WebDriver driver;

    @Dado("{actor} quiere consultar articulos deportivos en la web de la marca Swag")
    public void albertoQuiereConsultarArticulosDeportivosEnLaWebDeLaMarcaSwag(Actor actor) {
        actor.attemptsTo(NavigateTo.mainPage());
    }
    @Cuando("{actor} se autentica como un usuario de tipo {string}")
    public void elSeAutenticaComoUnUsuario(Actor actor, String userType) {
       actor.attemptsTo(LogIn.as(Tools.getUserType(userType)));
    }
    @Entonces("{actor} debe ser redirigido a la pagina de {string}")
    public void elDebeSerRedirigidoALaPaginaDe(Actor actor, String term) {
      actor.attemptsTo(
              Ensure.that(ProductPage.HEADING_TEXT_TITLE).hasText(term)
      );
    }

    @Entonces("a {actor} se le deniega el ingreso mostrando el mensaje {string}")
    public void laAplicacionDenegaIngresoMostrandoMensaje(Actor actor, String term) {

    }

}

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
import sura.ui.HeaderPage;
import sura.ui.LoginPage;
import sura.utils.Enumerator;

import static org.hamcrest.CoreMatchers.is;

public class LoginSteps {
    @Dado("{actor} quiere consultar articulos deportivos en la web de la marca Swag")
    public void quiereConsultarArticulosDeportivosEnLaWebDeLaMarcaSwag(Actor actor) {
        actor.attemptsTo(NavigateTo.mainPage());
    }
    @Cuando("{actor} se autentica como un usuario de tipo {string}")
    public void elSeAutenticaComoUnUsuario(Actor actor, String userType) {
       actor.attemptsTo(LogIn.as(Enumerator.getUserType(userType)));
    }
    @Entonces("{actor} debe ser redirigido a la pagina de {string}")
    public void elDebeSerRedirigidoALaPaginaDe(Actor actor, String term) {
        actor.attemptsTo(Ensure.that(HeaderPage.HEADING_TEXT_TITLE).text().contains(term));
    }

    @Entonces("a {actor} se le deniega el ingreso mostrando el mensaje {string}")
    public void laAplicacionDenegaIngresoMostrandoMensaje(Actor actor, String term) {
        actor.attemptsTo(Ensure.that(LoginPage.ERROR_MESSAGE).text().contains(term));
    }

}

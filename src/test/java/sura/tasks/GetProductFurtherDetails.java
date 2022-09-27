package sura.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import sura.utils.ProductItem;

public class GetProductFurtherDetails {

    public static Task onProductTitle (Actor actor, Integer productNumber){
        return Task.where( Click.on(ProductItem.titleElement(actor, productNumber)));
    }

    public static Task onProductImage (Actor actor, Integer productNumber){
        return Task.where( Click.on(ProductItem.imageElement(actor, productNumber)));
    }
}

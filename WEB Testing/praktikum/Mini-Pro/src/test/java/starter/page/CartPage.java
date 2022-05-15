package starter.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    private By clickBayar(){return By.cssSelector("#button-bayar > span");}
    @Step
    public void iconBayar(){$(clickBayar()).click();}
}


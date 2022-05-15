package starter.page;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By clickButtonLogin(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span/i");
    }
    private By clickButtonDetail(){return By.cssSelector("#\\31 578 > div > div.v-card__actions.d-block > div.mt-3 > button:nth-child(1)");}
    private By giveRating(){return By.cssSelector("#app > div > main > div > div > div > div > div > div > div > button:nth-child(5)");}
    private By buyProduct(){return By.xpath("//*[@id=\"1468\"]/div/div[3]/div[2]/button[2]");}
    private By iconCart(){return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]");}
    private By iconCategory(){return By.xpath("//*[@class=\"v-select__slot\"]/div[3]/div/i");}
    private By categoryHealth(){return By.xpath("//*[@class=\"v-list-item v-list-item--link theme--light\"][4]/div/div");}
    private By showCategory(){return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[2]");}
    @Step
    public void clickLogin(){$(clickButtonLogin()).click();}
    @Step
    public void clickDetail(){$(clickButtonDetail()).click();}
    @Step
    public void clickRating(){$(giveRating()).click();}
    @Step
    public void validateRating(){$(giveRating()).isDisplayed();}
    @Step
    public void clickBuyProduct(){$(buyProduct()).click();}
    @Step
    public void clickCart() {$(iconCart()).click();}
    @Step
    public void clickCategory() {$(iconCategory()).click();}
    @Step
    public void clickHealth(){$(categoryHealth()).click();}
    @Step
    public void seeHealth(){$(showCategory()).isDisplayed();}
}
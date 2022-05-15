package starter.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By submitEmail() {
        return By.xpath("//*[@id=\"input-7728\"]");
    }
    private By submitPassword(){
        return By.xpath("//*[@id=\"input-7731\"]");
    }
    private By clickLogin(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button/span");
    }
    private By errorAlert(){return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]");}
    private By buttonReg(){return By.cssSelector("#app > div > main > div > div > div > div.v-card__text > div.mt-3.text-center > a");}
    private By inLogin(){return By.cssSelector("#app > div > main > div > div > div > div.v-card__title");}
    @Step
    public void submitformEmail(String email){
        $(submitEmail()).type(email);
    }
    @Step
    public void submitformPassword(String pass){
        $(submitPassword()).type(pass);
    }
    @Step
    public void clickbuttonLogin(){
        $(clickLogin()).click();
    }
    @Step
    public void showError(){$(errorAlert()).isDisplayed();}
    @Step
    public void clickButtonReg(){$(buttonReg()).click();}
    @Step
    public void validateLogin(){$(inLogin()).isDisplayed();}
}

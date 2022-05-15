package starter.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By submitName(){return By.xpath("//form//input[1]");}
    private By submitEmail(){
        return By.xpath("(//form//input)[2]");
    }
    private By submitPassword(){
        return By.xpath("(//form//input)[3]");
    }
    private By registerButton(){
        return By.cssSelector("#app > div > main > div > div > div > div.v-card__text > form > div.text-center > button > span");
    }
    @Step
    public void inputName(String nama){
        $(submitName()).type(nama);
    }
    @Step
    public void inputEmail(String email){
        $(submitEmail()).type(email);
    }
    @Step
    public void inputPassword(String pass){
        $(submitPassword()).type(pass);
    }
    @Step
    public void clickButtonRegister(){
        $(registerButton()).click();
    }
}

package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By loginButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By emailField() {
        return MobileBy.xpath("//android.view.View//android.widget.EditText[1]");
    }

    private By passwordField() {
        return MobileBy.xpath("//android.view.View//android.widget.EditText[2]");
    }

    @Step
    public void inputEmail(String email) {
        onType(emailField(), email);
    }

    @Step
    public void inputPassword(String password) {
        onType(passwordField(), password);
    }

    @Step
    public void tapLoginButton() {
        onClick(loginButton());
    }

}

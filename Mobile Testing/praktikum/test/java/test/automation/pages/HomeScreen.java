package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class HomeScreen extends BasePageObject {
    private By homeScreen() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Products\"]\n");
    }

    private By buttonLogin() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By beliButton(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }
    private By cartButton(){
        return  MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
    }


    @Step
    public boolean showHomeScreen() {
        return waitUntilPresence(homeScreen()).isDisplayed();
    }
    @Step
    public void tapLoginButton() {
        onClick(buttonLogin());
    }
    @Step
    public void clickBeli(){onClick(beliButton());}
    @Step
    public void clickCart(){onClick(cartButton());}
}
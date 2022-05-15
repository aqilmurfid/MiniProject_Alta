package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.HomeScreen;
import test.automation.pages.LoginScreen;


public class LoginSteps {
    @Steps
    LoginScreen loginScreen;
    @Steps
    HomeScreen homeScreen;

    @Given("android user on homescreen")
    public void androidUserOnLandingScreen() {
        boolean actual = homeScreen.showHomeScreen();
        Assert.assertTrue(actual);
    }

    @When("android user click button login")
    public void androidUserClickLogin() {homeScreen.tapLoginButton();
        }

    @And("android user input valid email")
    public void androidUserInputEmail(){loginScreen.inputEmail("murfidaqil8@gmail.com");}

    @And("android user input valid pasword")
    public void androidUserTapLoginButton() {
        loginScreen.inputPassword("12345678");
    }

    @And("android user click login")
    public void androidUserInputPassword() {
        loginScreen.tapLoginButton();
    }

    @Then("android user go to homepage")
    public void androidUserOnHomeScreen() {
        boolean actual = homeScreen.showHomeScreen();
        Assert.assertTrue(actual);
    }
}

package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.page.HomePage;
import starter.page.LoginPage;
import starter.page.RegisterPage;

public class RegisterSteps {
    @Steps
    HomePage homePage;
    @Steps
    LoginPage loginPage;
    @Steps
    RegisterPage registerPage;
    @Given("I am at homePage")
    public void iAmAtHomePage() {homePage.open();
    }

    @When("I click login item")
    public void iClickLoginItem() {homePage.clickLogin();
    }

    @And("I click register")
    public void iClickRegister() {loginPage.clickButtonReg();
    }

    @And("I fill my full name {string}, email {string}, password {string}")
    public void iFillMyFullNameEmailPassword(String arg0, String arg1, String arg2) {
        registerPage.inputName(arg0);
        registerPage.inputEmail(arg1);
        registerPage.inputPassword(arg2);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registerPage.clickButtonRegister();
    }

    @Then("I succes and move to login page")
    public void iSuccesAndMoveToLoginPage() {
        loginPage.validateLogin();
    }
}

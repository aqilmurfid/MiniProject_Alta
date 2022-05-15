package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.page.CartPage;
import starter.page.HomePage;
import starter.page.LoginPage;

public class BuySteps {
    @Steps
    HomePage homePage;
    @Steps
    LoginPage loginPage;
    @Steps
    CartPage cartPage;
    @Given("I'm at home page")
    public void iMAtHomePage() {
        homePage.open();
    }

    @When("I click beli button")
    public void iClickBeliButton() {
        homePage.clickBuyProduct();
    }

    @And("I click cart button")
    public void iClickCartButton() {
        homePage.clickCart();
    }

    @And("I am bayar")
    public void iAmBayar() {
    cartPage.iconBayar();
    }

    @Then("I go to login page")
    public void iReturnToLoginPage() {
        loginPage.validateLogin();
    }
}

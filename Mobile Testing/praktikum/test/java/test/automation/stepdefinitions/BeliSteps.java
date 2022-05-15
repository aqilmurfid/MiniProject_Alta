package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.HomeScreen;

public class BeliSteps {
    @Steps
    HomeScreen homeScreen;

    @Given("android user on the homescreen")
    public void androidUserOnTheHomescreen() {
        boolean actual = homeScreen.showHomeScreen();
        Assert.assertTrue(actual);
    }

    @When("android user click beli")
    public void androidUserClickBeli() {
        homeScreen.clickBeli();
    }

    @And("android user click cart")
    public void androidUserClickCart() {
        homeScreen.clickCart();
    }
}

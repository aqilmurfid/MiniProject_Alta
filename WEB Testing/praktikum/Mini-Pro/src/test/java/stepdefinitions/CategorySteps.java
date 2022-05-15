package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.page.HomePage;

public class CategorySteps {
    @Steps
    HomePage homePage;
    @Given("I am in Homepage")
    public void iAmAtHomepage() {
        homePage.open();
    }

    @When("I click category button")
    public void iClickCategoryButton() {
        homePage.clickCategory();
    }

    @And("I choose kesehatan option")
    public void iChooseKesehatanOption() {
        homePage.clickHealth();
    }

    @Then("Web show kesehatan stuff")
    public void webShowKesehatanStuff() {
        homePage.seeHealth();
    }
}

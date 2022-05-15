package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.page.HomePage;

public class RatingSteps {
    @Steps
    HomePage homepage;
    @Given("I am at the homepage")
    public void atTheHomePage(){homepage.open();}
    @When("I click detail product cincin emas")
    public void iclickDetail(){homepage.clickDetail();}
    @And("I give a star")
    public void iclickRating(){homepage.clickRating();}
    @Then("Product show my rating")
    public void myValidateRating(){homepage.validateRating();}}
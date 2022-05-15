package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.page.HomePage;
import starter.page.LoginPage;

public class LoginSteps {
@Steps
LoginPage login;
@Steps
HomePage homepage;
    @Given("I am on the login page")
    public void onTheSigninPage(){homepage.clickLogin();
    }
    @When("I input my username and password correctly")
    public void enterUsernameAndPassword(){login.submitformEmail("murfidaqil8@gmail.com");
        login.submitformPassword("12345678");
    }
    @And("I click login button")
    public void clickLoginButton(){login.clickbuttonLogin();
    }
    @Then("I am on the homepage")
    public void onTheHomePage(){login.clickbuttonLogin();
    }
    @Given("I am on login page")
    public void onTheLoginPage(){homepage.clickLogin();
    }
    @When("I input my username correctly and wrong password")
    public void enterUsernameandPassword(){login.submitformEmail("murfidaqil8@gmail.com");
        login.submitformPassword("1234567");
    }
    @And("I click login")
    public void clickLogin(){login.clickbuttonLogin();
    }
    @Then("Show error message")
    public void showErrorMessage(){login.showError();}
}

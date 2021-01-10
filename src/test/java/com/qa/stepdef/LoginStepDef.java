package com.qa.stepdef;

import com.qa.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;

public class LoginStepDef extends BaseTest {

    private BaseTest base;
    public LoginStepDef(BaseTest base){
        this.base =base;
    }


    @When("^user enters username as \"([^\"]*)\"$")
    public void userEntersUsernameAs(String username) {

        new LoginPage().enterUserName(username);
    }

    @When("^user enters password as \"([^\"]*)\"$")
    public void userEntersPasswordAs(String password) {

        new LoginPage().enterPassword(password);
    }

    @When("^User clicks on login button$")
    public void userClicksOnLoginButton() {

        new LoginPage().pressLoginButton();
    }

    @Then("^Error message is displayed \"([^\"]*)\"$")
    public void errorMessageIsDisplayed(String err) {

        Assert.assertEquals(err,new LoginPage().getErrorText());
    }


    @Then("^app navigates to the welcome page and displays \"([^\"]*)\"$")
    public void app_navigates_to_the_welcome_page_and_displays(String WlcmMesage) {

        Assert.assertEquals(WlcmMesage,new WelcomePage().getWelcomeTxt());

    }


}

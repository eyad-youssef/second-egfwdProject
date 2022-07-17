package org.example.Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.ResetPasswordPage;

public class ResetPasswordDefinition extends ResetPasswordPage {

    @Given("user go to forget password page")
    public void clicking_ForgetPassword(){
        click_Forget_Password().click();
    }
     @When("user reenter email")
     public void entering_Recovery_Email(){
         enter_Recovery_Email().sendKeys("g4@g.com");
     }
    @Then("user clicks recover button")
    public void entering_Recover(){
        click_Recover().click();
    }

}

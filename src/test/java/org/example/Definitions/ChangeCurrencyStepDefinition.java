package org.example.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.ChangeCurrencyPage;

public class ChangeCurrencyStepDefinition extends ChangeCurrencyPage {
    @Given("user goes to login page first")
    public void gettinglogged(){
        clickLoginButton3().click();
    }
    @When("user logs in")
    public  void gettinglogindetails(){
        enter_Email3().sendKeys("g4@g.com");
        enter_Password3().sendKeys("asd123");
        click_Final_Login3().click();

    }


    @Then("user clicks on the needed currency")
    public void getcuurencylist(){
        selectCurrency();
        selectCurrency2();
        selectCurrency();
    }
}

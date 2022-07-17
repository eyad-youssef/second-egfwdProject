package org.example.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.AddItemsToCompareListPage;

public class AddItemsToComparelistStepDefinition extends AddItemsToCompareListPage {
    @Given("user logged in first")
    public void Logging(){
        clickLoginButton7().click();
        enter_Email7().sendKeys("g4@g.com");
        enter_Password7().sendKeys("asd123");
        click_Final_Login7().click();
    }

    @When("user get a product")
    public  void Getting_Product(){
        getItemsPage3();
    }

    @Then("user finalises adding product to comparelist")
    public void Last_Adding(){
        clickAddToCompareList().click();
    clickAddToCompareList_Again().click();
    }

}

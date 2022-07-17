package org.example.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SelectCategoriesPage;

public class SelectCategoriesStepDefinition extends SelectCategoriesPage {
    @Given("user is in the loginpage first")
    public void gettinglogin(){
        clickLoginButton4().click();

    }
    @And("user puts login details")
    public void gettinglogindetails(){
        enter_Email4().sendKeys("g4@g.com");
        enter_Password4().sendKeys("asd123");
        click_Final_Login4().click();

    }
    @When("user hovers over one category")
    public void choosecategory(){
        gettMainList1();
        getSubList1();
    }
    @Then("user hovers over another category")
    public void getanothercategory(){
        getOtherSubList1();
        getSubList1();
    }
}

package org.example.Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.FilterByColorPage;

public class FilterByColorStepDefinition extends FilterByColorPage {

    @Given("user  is logged")
    public  void getLogged(){
        clickLoginButton4().click();
        enter_Email4().sendKeys("g4@g.com");
        enter_Password4().sendKeys("asd123");
        click_Final_Login4().click();
    }
    @When("user chooses product")
    public  void getproduct(){
        gettMainList2();
        getSubList2();
        getItem2();

    }
    @Then("user select the color")
    public  void selectfiltercolor(){
        filter().click();

    }

}

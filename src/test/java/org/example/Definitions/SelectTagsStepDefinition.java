package org.example.Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SelectTagPage;

public class SelectTagsStepDefinition extends SelectTagPage {
     @Given("user logged in")
     public void logging(){
         clickLoginButton5().click();
         enter_Email5().sendKeys("g4@g.com");
         enter_Password5().sendKeys("asd123");
         click_Final_Login5().click();
     }
    @When("user get product")
    public  void gettingproduct(){
         gettMainList3();
         getSubList3();
         getItem3();
    }
    @Then("user set a tag")
    public  void settingtag(){
         getTagsList();
         getTagItem1();
    }
}

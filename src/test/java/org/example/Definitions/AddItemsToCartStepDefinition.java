package org.example.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_lol.AN;
import org.example.pages.AddItemsToCartPage;

public class AddItemsToCartStepDefinition extends AddItemsToCartPage {

    @Given("user has logged in")
    public  void Logging(){
        clickLoginButton6().click();
        enter_Email6().sendKeys("g4@g.com");
        enter_Password6().sendKeys("asd123");
        click_Final_Login6().click();

    }
    @When("user chooses a product")
    public  void GettingProduct(){
        getItemsPage();
    }
    @And("user adds to cart")
    public  void FirstAdding(){
        click_AddToCart_Button().click();
    }
    @And("user adds product details")
    public  void AddDetails(){
        selectSize();
        selectColor();
        selectPrint();
    }
    @Then("user finalises adding product")
    public  void LastAdding(){
        clickFinaLAddButton().click();
    }
}

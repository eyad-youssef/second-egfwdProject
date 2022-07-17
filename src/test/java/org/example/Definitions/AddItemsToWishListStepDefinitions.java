package org.example.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.AddItemsToWishListPage;

public class AddItemsToWishListStepDefinitions extends AddItemsToWishListPage {
    @Given("user has loggedin")
    public void Logging(){
        clickLoginButton6().click();
        enter_Email6().sendKeys("g4@g.com");
        enter_Password6().sendKeys("asd123");
        click_Final_Login6().click();
    }

    @When("user choose a product")
    public  void GettingProduct(){
        getItemsPage2();
    }
    @And("user adds to wishlist")
    public  void FirstAdding(){

        clickAddToWishList().click();
    }
    @And("user add product details")
    public  void gettingDetils(){
        selectSize();
        selectColor();
        selectPrint();
    }
    @Then("user finalises adding product to wishlist")
    public void LastAdding(){
        getbuttonlist1();
        clickFinalWishListButton().click();
    }
}

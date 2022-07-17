package org.example.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MakeOrderPage;

public class MakeOrderStepDefinition extends MakeOrderPage {
    @Given("user has been logged in")
    public void first_Login(){
        clickLoginButton8().click();
        enter_Email8().sendKeys("g4@g.com");
        enter_Password8().sendKeys("asd123");
        click_Final_Login8().click();

    }
    @And("user adds product to cart")
    public void getting_Product(){
        getItemsPage4();
        click_AddToCart_Button2().click();
        selectSize2();
        selectColor2();
        selectPrint2();
        clickFinaLAddButton2().click();
    }
    @And("user has a product")
    public void adding_Product(){
        getbuttonlist2();
        closepanel();
        clickshopingcartButton().click();

    }
    @And("user checks out product")
    public  void checking_Product(){
        checkAgreeButton().click();
        clickCheckButton().click();
    }
//    @When("user logsin again")
//     public void login_Again(){
//
//    }
    @When("user add address details")
    public void address_Details() throws InterruptedException {
        // selectCountry();
         billingaddress().click();
    }
    @And("user add shipping details")
    public void shipping(){
        addshipingDetails();
    }

    @And("user addes payment details")
    public  void payment(){
        addPaymentDetails();
    }



    @Then("user confirms operation")
    public void confirming(){
        click_Confirm_Button().click();
    }
}

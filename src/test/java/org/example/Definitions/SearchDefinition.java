package org.example.Definitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SearchInhomePage;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.processing.Generated;
import java.time.Duration;

import static org.testng.Assert.*;

public class SearchDefinition extends SearchInhomePage {

@Given("user goes to login page")
public void click_login(){
    clickLoginButton().click();

}
@And("user enters email again")
public  void enteringemail(){
    enter_Email().sendKeys("g4@g.com");

}
@And("user enters password")
public  void enterpassword(){
    enter_Password().sendKeys("asd123");
}
@And("user clicks login button")
public void enterlogin(){
    click_Final_Login().click();
}

@When("user enter any product in search bar")

public void entering_Search(){
    enter_Search().sendKeys("laptop");

}


    @Then("user clicks the search button")
    public void clicking_Search(){
    click_Search_Button().click();

   }

  @And("user chooses from the search list")
    public  void choose() throws InterruptedException {
    getsearchbar().sendKeys("AP_MBP_13");
      WebDriverWait wait = new WebDriverWait(Setup.d, Duration.ofSeconds(10));

      getlistofproducts();
       String sku = getthesku().getText();
      assertEquals("AP_MBP_13",sku,"THIS IS NOT THE DESIRED PRODUCT");


  }



}

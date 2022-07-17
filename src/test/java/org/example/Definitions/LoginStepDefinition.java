package org.example.Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginStepDefinition extends LoginPage {

    @Given("user go to login page")
    public void going_toLoginPage()
    {
        clickLoginButton1().click();
    }
    @When("user enters email")
    public  void entering_email(){
        enter_Email1().sendKeys("g4@g.com");

    }
    @And("user enter password")
    public void entering_password(){
        enter_Password1().sendKeys("asd123");
    }
    @Then("user click the login button")
    public void clicking_Login1(){
        click_Final_Login1().click();
    }
    @And("user login to the system successfully")
    public void get_myaccount_button(){
        get_login_validation1().isDisplayed();
        String link =  Setup.d.getCurrentUrl();
        assertEquals(link,"https://demo.nopcommerce.com/","no the real link ");

    }




//    And(" user could not login to the system")
//        public void invalilogin(){
//       String result =  get_invalidlogin_text().getText();
//       assertEquals(result,"Login was unsuccessful. Please correct the errors and try again.\n" +
//               "\n" +
//               "    No customer account found\n"," error ");
//        String color=  get_invalidlogin_textcolor().getCssValue("color");
//        assertEquals(color, "rgba(228, 67, 75, 1)","no the real color ");
//
//
//
//
//        }
}

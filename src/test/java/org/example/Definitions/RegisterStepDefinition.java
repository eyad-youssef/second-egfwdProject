package org.example.Definitions;//package org.example.Definitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pages.HomePage;
//
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegisterPage;

import static org.testng.Assert.assertEquals;

public class RegisterStepDefinition  extends RegisterPage {

//
//    @Then("user is directed to a page with all the matchiing jobs")
//    public void user_getsto_jobspage()
//
//    {
//
//     String  result =    d.findElement(By.xpath
//                ("/html/body/div[4]/div[1]/div[1]/div/div[2]/form/div[2]/button")
//        ).getText();
//        Assert.assertTrue(result.contains("@@"));
//
//
//
//    }
              @Given("user go to register page")
              public void goRegisterPage()
              {

                     registerPage1().click();
              }
              @When("user select gender type")
              public void checking_Gender()
              {
                  check_Gender1().click();
              }
              @And("user enter first name")
              public  void entering_Firstname(){
                  enter_First_Name2().sendKeys("ahmed");
              }
              @And("user enter last name")
              public  void entering_Lastname(){
                    enter_Last_Name2().sendKeys("ali mohamed");
                }

                @And("user enter date")
                public void entering_date(){
                  selectday1();
                  selectmonth1();
                  selectyear1();
                }

                @And("user enter email")
                public  void entering_Email(){
                  enter_Email2().sendKeys("g4@g.com");
                }
                @And("user fills Password fields")
                public  void entering_Password(){
                  enter_Password2().sendKeys("asd123");
                  confirm_Password2().sendKeys("asd123");
                }
                @Then("user clicks on register button")
                public  void clicking_RegisterButton(){
                  click_Final_Rgister2().click();}

                 @And("success message is displayed")
                 public void getting_scuccssmessage(){
                     String result=  getregistertitle().getText();
                      assertEquals(result, "Your registration completed","Error in Register Operation ");

                  String color = getregistertitleColor().getCssValue("background-color");
                     assertEquals(color," rgba(76, 177, 124, 1)","not the background color");

    }


}





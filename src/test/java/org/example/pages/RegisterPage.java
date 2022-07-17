package org.example.pages;

import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {


 public WebElement registerPage1(){
     return   Setup.d.findElement(By.cssSelector(".ico-register"));

       }





//    private WebDriver d ;
//    public RegisterPage(WebDriver d )
//    {
//        this.d =d ;
//    }




    public WebElement check_Gender1()
    {
         return Setup.d.findElement(By.cssSelector("#gender-male"));
    }


    public WebElement enter_First_Name2()
    {
       return Setup.d.findElement(By.xpath("//*[@id=\"FirstName\"]"));

    }
    public WebElement enter_Last_Name2()
    {
         return Setup.d.findElement(By.xpath("//*[@id=\"LastName\"]"));
    }




    private Select dayList()
    {
        return new Select(Setup.d.findElement(By.cssSelector(".date-picker-wrapper > select:nth-child(1)")) );
    }

    public  void  selectday1()
    {
          dayList().selectByVisibleText("5");
    }





    private Select monthsList()
    {
        return new Select(Setup.d.findElement(By.cssSelector(".date-picker-wrapper > select:nth-child(2)")) );
    }

    public  void  selectmonth1()
    {
        monthsList().selectByVisibleText("May");
    }








    private Select yearList()
    {
        return new Select(Setup.d.findElement(By.cssSelector(".date-picker-wrapper > select:nth-child(3)")) );
    }

    public  void  selectyear1()
    {
        yearList().selectByVisibleText("1917");
    }


































    public WebElement enter_Email2()
    {
        return Setup.d.findElement(By.xpath("//*[@id=\"Email\"]"));
    }
    public void enter_Company_Name()
    {
        Setup.d.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("egFWD");
    }
    public void check_Newsletter()
    {
        Setup.d.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
    }
    public WebElement enter_Password2()
    {
        return Setup.d.findElement(By.xpath("//*[@id=\"Password\"]"));
    }
    public WebElement confirm_Password2()
    {
         return Setup.d.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
    }


    public WebElement click_Final_Rgister2(){

       return Setup.d.findElement(By.xpath("//*[@id=\"register-button\"]"));

    }

    public WebElement getregistertitle(){
        return Setup.d.findElement(By.cssSelector(".result"));
    }
    public WebElement getregistertitleColor(){
        return Setup.d.findElement(By.cssSelector(".result"));
    }
















}

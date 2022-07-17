package org.example.pages;

import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {



    public WebElement clickLoginButton1()
    {
         return Setup.d.findElement(By.cssSelector(".ico-login"));
    }
    public WebElement enter_Email1()
    {
         return Setup.d.findElement(By.xpath("//*[@id=\"Email\"]"))/**/;
    }

    public WebElement enter_Password1()
    {
        return  Setup.d.findElement(By.xpath("//*[@id=\"Password\"]"));
    }

    public  WebElement click_Final_Login1()
    {
         return Setup.d.findElement(By.cssSelector(".login-button"));
    }
 public WebElement get_login_validation1(){


         WebElement buttonlist = Setup.d.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        /* Actions actions = new Actions(Setup.d);
         actions.moveToElement(buttonlist).perform();*/

 return buttonlist;
 }
 public WebElement get_invalidlogin_text(){
        return Setup.d.findElement(By.cssSelector(".message-error"));
 }
    public WebElement get_invalidlogin_textcolor(){
        return Setup.d.findElement(By.cssSelector(".message-error"));
    }








}

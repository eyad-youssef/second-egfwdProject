package org.example.pages;

import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchInhomePage {


    public WebElement clickLoginButton()
    {
        return Setup.d.findElement(By.cssSelector(".ico-login"));
    }
    public WebElement enter_Email()
    {
        return Setup.d.findElement(By.xpath("//*[@id=\"Email\"]"))/**/;
    }

    public WebElement enter_Password()
    {
        return  Setup.d.findElement(By.xpath("//*[@id=\"Password\"]"));
    }

    public  WebElement click_Final_Login()
    {
        return Setup.d.findElement(By.cssSelector(".login-button"));
    }




    public WebElement enter_Search()
    {
       return  Setup.d.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
    }

    public   WebElement click_Search_Button()
    {
         return Setup.d.findElement(By.cssSelector(".search-box-button"));
    }


}

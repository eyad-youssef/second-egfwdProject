package org.example.pages;

import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ChangeCurrencyPage {

    public WebElement clickLoginButton3()
    {
        return Setup.d.findElement(By.cssSelector(".ico-login"));
    }
    public WebElement enter_Email3()
    {
        return Setup.d.findElement(By.xpath("//*[@id=\"Email\"]"))/**/;
    }

    public WebElement enter_Password3()
    {
        return  Setup.d.findElement(By.xpath("//*[@id=\"Password\"]"));
    }

    public  WebElement click_Final_Login3()
    {
        return Setup.d.findElement(By.cssSelector(".login-button"));
    }









    private Select currencyList()
    {
        return new Select(Setup.d.findElement(By.xpath("//*[@id=\"customerCurrency\"]")) );
    }

    public  void  selectCurrency()
    {
        currencyList().selectByVisibleText("Euro");
    }
    public  void  selectCurrency2()
    {
        currencyList().selectByVisibleText("US Dollar");
    }


}

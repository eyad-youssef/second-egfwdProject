package org.example.pages;

import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.Definitions.Setup.d;

public class ResetPasswordPage {



    public WebElement click_Forget_Password()
    {
    return Setup.d.findElement( By.cssSelector(".forgot-password > a:nth-child(1)"));
    }


    public WebElement enter_Recovery_Email()
    {
       return Setup.d.findElement(By.xpath("//*[@id=\"Email\"]"));
    }


    public WebElement click_Recover()
    {
        return  Setup.d.findElement( By.cssSelector("button.button-1:nth-child(1)")  );

    }

    public String getpanneltitle()
    {
        return   d.findElement(By.cssSelector(".content")).getText();

    }






}

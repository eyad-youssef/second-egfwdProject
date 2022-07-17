package org.example.pages;

import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FilterByColorPage {

    public WebElement clickLoginButton4()
    {
        return Setup.d.findElement(By.cssSelector(".ico-login"));
    }
    public WebElement enter_Email4()
    {
        return Setup.d.findElement(By.xpath("//*[@id=\"Email\"]"))/**/;
    }

    public WebElement enter_Password4()
    {
        return  Setup.d.findElement(By.xpath("//*[@id=\"Password\"]"));
    }

    public  WebElement click_Final_Login4()
    {
        return Setup.d.findElement(By.cssSelector(".login-button"));
    }

    public void gettMainList2()
    {

        WebElement list = Setup.d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(list).perform();

    }

    public void getSubList2()
    {
        WebElement subcategory =Setup.d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(subcategory).perform();
    }

    public void getOtherSubList2()
    {
        WebElement otherSubcategory =Setup.d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(otherSubcategory).perform();
    }



    public void getItem2()
    {
        WebElement categoryItem = Setup.d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(categoryItem).click().perform();
        //actions.build().perform();
    }



    public WebElement filter()
    {
    return
       Setup.d.findElement(By.xpath("//*[@id=\"attribute-option-15\"]"));

    }













}

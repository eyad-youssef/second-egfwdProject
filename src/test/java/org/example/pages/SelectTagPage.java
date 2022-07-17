package org.example.pages;

import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectTagPage {

    public WebElement clickLoginButton5()
    {
        return Setup.d.findElement(By.cssSelector(".ico-login"));
    }
    public WebElement enter_Email5()
    {
        return Setup.d.findElement(By.xpath("//*[@id=\"Email\"]"))/**/;
    }

    public WebElement enter_Password5()
    {
        return  Setup.d.findElement(By.xpath("//*[@id=\"Password\"]"));
    }

    public  WebElement click_Final_Login5()
    {
        return Setup.d.findElement(By.cssSelector(".login-button"));
    }

    public void gettMainList3()
    {

        WebElement list = Setup.d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(list).perform();

    }

    public void getSubList3()
    {
        WebElement subcategory =Setup.d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(subcategory).perform();
    }

    public void getOtherSubList3()
    {
        WebElement otherSubcategory =Setup.d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(otherSubcategory).perform();
    }



    public void getItem3()
    {
        WebElement categoryItem = Setup.d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(categoryItem).click().perform();
        //actions.build().perform();
    }
    public void getTagsList()
    {
        WebElement listOfTags =Setup.d.findElement(By.cssSelector(".tags > ul:nth-child(1)"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(listOfTags).perform();


    }

    public void getTagItem1(){

        WebElement tagItem =Setup.d.findElement(By.cssSelector(".tags > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(tagItem).click().perform();
       // actions.build().perform();
    }



}

package org.example.pages;

import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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



    public WebElement getsearchbar(){
        return Setup.d.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
    }



    public   void  getlistofproducts() throws InterruptedException {
        Thread.sleep(100);
        WebElement list = Setup.d.findElement(By.xpath("//*[@id=\"ui-id-2\"]"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(list).click().perform();






//        // Webdriver wait
//        WebDriverWait wait = new WebDriverWait(Setup.d, Duration.ofSeconds(10));
//
//        getsearchbar().sendKeys("searchKey");
//      wait.until(
//               driver -> ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"ui-id-1\\\"]")).apply(driver));
//
//  // wait until the search results is displayed with the expected result
//
//            List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy
//                      (By.xpath("//*[@id=\"small-searchterms\"]")));


    }
    public  WebElement getthesku(){
        return  Setup.d.findElement(By.xpath("//*[@id=\"sku-4\"]"));
    }














}

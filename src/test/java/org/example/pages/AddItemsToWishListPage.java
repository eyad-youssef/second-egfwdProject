package org.example.pages;

import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddItemsToWishListPage {

    public WebElement clickLoginButton6()
    {
        return Setup.d.findElement(By.cssSelector(".ico-login"));
    }
    public WebElement enter_Email6()
    {
        return Setup.d.findElement(By.xpath("//*[@id=\"Email\"]"))/**/;
    }

    public WebElement enter_Password6()
    {
        return  Setup.d.findElement(By.xpath("//*[@id=\"Password\"]"));
    }

    public  WebElement click_Final_Login6()
    {
        return Setup.d.findElement(By.cssSelector(".login-button"));
    }




    public void getItemsPage2(){
        WebElement list = Setup.d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(list).perform();


        WebElement subcategory =Setup.d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]"));
        // Actions */
        actions = new Actions(Setup.d);
        actions.moveToElement(subcategory).perform();


        WebElement categoryItem = Setup.d.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a"));
        //Actions
        actions = new Actions(Setup.d);
        actions.moveToElement(categoryItem).click().perform();

        actions.click().build().perform();

    }

    public WebElement clickAddToWishList()
    {
     return    Setup.d.findElement(By.cssSelector
                ("div.item-box:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(3)"));
    }

    public Select sizesList()
    {
        return new Select(Setup.d.findElement(By.xpath("//*[@id=\"product_attribute_6\"]")) );
    }

    public  void  selectSize()
    {
        sizesList().selectByIndex(3);
    }


    public Select colorList()
    {
        return new Select(Setup.d.findElement(By.xpath("//*[@id=\"product_attribute_7\"]")) );
    }

    public  void  selectColor(){
        colorList().selectByIndex(1);
    }
    public void selectPrint()
    {
        WebElement printItem =Setup.d.findElement(By.cssSelector
                ("#image-squares-8 > li:nth-child(2) > label:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(printItem).click().perform();

    }

    public void getbuttonlist1()
    {
        WebElement buttonlist = Setup.d.findElement(By.xpath
                ("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[11]"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(buttonlist).perform();

    }



    public WebElement clickFinalWishListButton()
    {

         return Setup.d.findElement(By.cssSelector("#add-to-wishlist-button-24"));

    }


}

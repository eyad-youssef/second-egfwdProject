package org.example.pages;

import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddItemsToCartPage {
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

    public void getItemsPage(){
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

    public  WebElement click_AddToCart_Button()
    {
        return Setup.d.findElement(By.xpath
                ("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]"));
    }




    public Select sizesList()
    {
        return new Select(Setup.d.findElement(By.xpath("//*[@id=\"product_attribute_6\"]")) );
    }

    public  void  selectSize()
    {
        sizesList().selectByIndex(2);
    }



    public Select colorList()
    {
        return
                new Select(Setup.d.findElement(By.xpath("//*[@id=\"product_attribute_7\"]")) );
    }

    public  void  selectColor()
    {
        colorList().selectByIndex(1);
    }




    public void selectPrint()
    {
        WebElement printItem =Setup.d.findElement(By.xpath
                ("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[7]/dl/dd[3]/ul/li[1]/label/span/span"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(printItem).click().perform();

    }


    public WebElement clickFinaLAddButton()
    {
       return   Setup.d.findElement(By.xpath("//*[@id=\"add-to-cart-button-24\"]"));
    }





}

package org.example.pages;

import net.bytebuddy.asm.Advice;
import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddItemsToCompareListPage {
    public WebElement clickLoginButton7()
    {
        return Setup.d.findElement(By.cssSelector(".ico-login"));
    }
    public WebElement enter_Email7()
    {
        return Setup.d.findElement(By.xpath("//*[@id=\"Email\"]"))/**/;
    }

    public WebElement enter_Password7()
    {
        return  Setup.d.findElement(By.xpath("//*[@id=\"Password\"]"));
    }

    public  WebElement click_Final_Login7()
    {
        return Setup.d.findElement(By.cssSelector(".login-button"));
    }


    public void getItemsPage3(){
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
    public WebElement clickAddToCompareList(){
        return
        Setup.d.findElement(By.cssSelector
                ("div.item-box:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(2)"));
        }

        public WebElement clickAddToCompareList_Again(){
        return Setup.d.findElement(By.cssSelector
                ("div.item-box:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(2)"));

        }

}

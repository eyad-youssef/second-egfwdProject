package org.example.pages;

import io.cucumber.java.eo.Se;
import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MakeOrderPage {

    public WebElement clickLoginButton8()
    {
        return Setup.d.findElement(By.cssSelector(".ico-login"));
    }
    public WebElement enter_Email8()
    {
        return Setup.d.findElement(By.xpath("//*[@id=\"Email\"]"))/**/;
    }

    public WebElement enter_Password8()
    {
        return  Setup.d.findElement(By.xpath("//*[@id=\"Password\"]"));
    }

    public  WebElement click_Final_Login8()
    {
        return Setup.d.findElement(By.cssSelector(".login-button"));
    }


    public void getItemsPage4(){
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
    public  WebElement click_AddToCart_Button2()
    {
        return Setup.d.findElement(By.xpath
                ("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]"));
    }

    public Select sizesList()
    {
        return new Select(Setup.d.findElement(By.xpath("//*[@id=\"product_attribute_6\"]")) );
    }

    public  void  selectSize2()
    {
        sizesList().selectByIndex(2);
    }



    public Select colorList()
    {
        return
                new Select(Setup.d.findElement(By.xpath("//*[@id=\"product_attribute_7\"]")) );
    }

    public  void  selectColor2()
    {
        colorList().selectByIndex(1);
    }




    public void selectPrint2()
    {
        WebElement printItem =Setup.d.findElement(By.xpath
                ("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[7]/dl/dd[3]/ul/li[1]/label/span/span"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(printItem).click().perform();

    }

    public WebElement clickFinaLAddButton2()
    {
        return   Setup.d.findElement(By.xpath("//*[@id=\"add-to-cart-button-24\"]"));
    }

    public void getbuttonlist2()
    {
        WebElement buttonlist = Setup.d.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(buttonlist).perform();

    }

    public void closepanel()
    {
        WebElement close = Setup.d.findElement(By.cssSelector(".close"));
        Actions actions = new Actions(Setup.d);
        actions.moveToElement(close).click().perform();

    }

    public  WebElement clickshopingcartButton()
    {

         return Setup.d.findElement(By.cssSelector("#topcartlink"));

    }
    public WebElement checkAgreeButton()
    {

            return   Setup.d.findElement(By.cssSelector("#termsofservice"));
    }

    public WebElement clickCheckButton()
    {

        return  Setup.d.findElement(By.cssSelector("#checkout"));

    }

   /* public void login_Again()
    {
        Setup.d.findElement(By.cssSelector("#Email")).sendKeys("g4@g.com");
        Setup.d.findElement(By.cssSelector("#Password")).sendKeys("asd123");
        Setup.d.findElement(By.cssSelector("#RememberMe")).click();
        Setup.d.findElement(By.cssSelector(".login-button")).click();

    }*/

    private Select countrelist()
    {
        return new Select(Setup.d.findElement(By.cssSelector("#BillingNewAddress_CountryId")) );

    }

    public  void  selectCountry() throws InterruptedException
    {
        countrelist().selectByVisibleText("Afghanistan");
        Thread.sleep(100);
    }

    public WebElement billingaddress()
    {


//        //addcity
//        Setup.d.findElement(By.cssSelector("#BillingNewAddress_City")).sendKeys("cairo");
//        //add address
//        Setup.d.findElement(By.cssSelector("#BillingNewAddress_Address1")).sendKeys("downtown");
//        //add zip
//        Setup.d.findElement(By.cssSelector("#BillingNewAddress_ZipPostalCode")).sendKeys("18974");
//        //add phonenumber
//        Setup.d.findElement(By.cssSelector("#BillingNewAddress_PhoneNumber")).sendKeys("01887564429");
//        // click continue
//        Setup.d.findElement(By.cssSelector("button.button-1:nth-child(4)")).click();


return
        Setup.d.findElement(By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button"));
    }

    public void addshipingDetails()
    {
       Setup.d.findElement(By.cssSelector("#shippingoption_1")).click();
        Setup.d.findElement(By.cssSelector(".shipping-method-next-step-button")).click();
    }
    public  void addPaymentDetails()
    {
        Setup.d.findElement(By.cssSelector("#paymentmethod_0")).click();
        Setup.d.findElement(By.cssSelector(".payment-method-next-step-button")).click();
        Setup.d.findElement(By.cssSelector("#payment-info-buttons-container > button")).click();
        Setup.d.findElement(By.cssSelector(".payment-info-next-step-button")).click();

    }


public  WebElement click_Confirm_Button(){
   return  Setup.d.findElement(By.cssSelector(".confirm-order-next-step-button"));
}





}

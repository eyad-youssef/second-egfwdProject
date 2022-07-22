package org.example.Definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Setup {


    public static WebDriver d ;
    //protected HomePage homepage ;
    //private WebDriver d ;
    //protected LoginPage homepage ;


    @Before
    public void setup() throws InterruptedException {

        //WebDriverManager.chromedriver().setup()
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\20114\\OneDrive\\Documents\\First_cucmber_project\\src\\main\\resources\\chromedriver.exe");
        d =new ChromeDriver();


        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        d.manage().window().maximize();

        d.get("https://demo.nopcommerce.com/");
        //homepage= new HomePage(d);


    }
    @After
    public void  end() throws InterruptedException {
        d.quit();
        Thread.sleep(3000);
    }


    }








package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.ProductListing;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver ;
   LoginPage page;
    ProductListing productList;

//    @BeforeTest
//    public void beforeClass(){
//
//            System.out.println("*******before test case start**********");
//
//            driver = new ChromeDriver();
//    }

//@BeforeTest
//public void setup() {
//    driver = new ChromeDriver();
//    page = new pages.LoginPage(driver);
//    driver.manage().window().maximize();
//    driver.navigate().to("https://www.saucedemo.com");
//
//    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);}
//@AfterTest
//public void close() {
//    driver.quit();
//
//}
}





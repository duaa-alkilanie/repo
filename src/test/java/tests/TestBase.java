package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;



    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();

        driver.navigate().to("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}





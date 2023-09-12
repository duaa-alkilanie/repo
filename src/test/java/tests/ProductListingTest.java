package tests;

import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductListing;

import java.io.IOException;


public class ProductListingTest extends TestBase {

    @Test
    public void AddLowestPriceToCart() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();
        driver = new ChromeDriver();
        page = new LoginPage(driver);
        productList = new ProductListing(driver);
        driver.navigate().to("https://www.saucedemo.com");
        driver.manage().window().maximize();
        page.UserLogin(jsonReader.userName, jsonReader.password);
       productList.selectPriceFromLowToHigh();
       productList.addToCart();
       productList.checkCartItemAdd();
       String actualItemAmount=  productList.checkCartItemAdd();
       Assert.assertTrue(actualItemAmount.contains("1"));
       driver.quit();
    }

}


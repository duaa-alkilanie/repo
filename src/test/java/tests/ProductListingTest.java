package tests;

import data.JsonDataReader;
import org.json.simple.parser.ParseException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductListing;

import java.io.IOException;
import org.testng.annotations.*;

public class ProductListingTest extends TestBase {
    LoginPage page;
    ProductListing productList;

    @Test
    public void AddLowestPriceToCart() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();

        page=new LoginPage(driver);
        page.UserLogin(jsonReader.userName, jsonReader.password);

        productList = new ProductListing(driver);
       productList.selectPriceFromLowToHigh();
       productList.addToCart();
       productList.checkCartItemAdd();
       String actualItemAmount=  productList.checkCartItemAdd();
       Assert.assertTrue(actualItemAmount.contains("1"));
    }

}


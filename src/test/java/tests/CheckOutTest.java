package tests;

import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.ProductListing;
import pages.checkOutPage;

import java.io.IOException;

public class CheckOutTest extends TestBase {
    checkOutPage checkout;
    LoginPage page;
    ProductListing productList;

    @Test
    public void checkOutTheOrder() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();

        page = new LoginPage(driver);
        productList = new ProductListing(driver);
        checkout = new checkOutPage(driver);

        page.UserLogin(jsonReader.userName, jsonReader.password);
        productList.selectPriceFromLowToHigh();
        productList.addToCart();
        productList. clickCartIcon();
        checkout.clickONCheckout();
        checkout.insertInformationforCheckout(jsonReader.firstName,jsonReader.lastName, jsonReader.postalCode);
        String expected= "Checkout: Overview";
        String actual = checkout.checkOutdeatils();
        Assert.assertEquals(actual,expected);
        checkout.clickFinishBtn();
        String expectedValue= "Checkout: Complete!";
        String actualValue= checkout.completeCheckOut();
        Assert.assertEquals(expectedValue,actualValue);

    }
}

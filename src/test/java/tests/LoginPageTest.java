package tests;

import org.json.simple.parser.ParseException;
import org.junit.Test;
import data.JsonDataReader;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;


import java.io.IOException;

public class LoginPageTest extends TestBase {
    LoginPage page;

    @Test
    public void doLogin() throws IOException, ParseException {

        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();
        driver = new ChromeDriver();
        page = new LoginPage(driver);
        driver.navigate().to("https://www.saucedemo.com");
        driver.manage().window().maximize();
        page.UserLogin(jsonReader.userName, jsonReader.password);
        String homePage=driver.getTitle();
        Assert.assertEquals(homePage,"Swag Labs");
        System.out.println("the first test case done");
        driver.quit();
    }
    @Test
    public void doLoginForLockedOutUser() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();
        driver = new ChromeDriver();
        page = new LoginPage(driver);
        driver.navigate().to("https://www.saucedemo.com");
        driver.manage().window().maximize();
       page.UserLogin(jsonReader.locked_out_user,jsonReader.password);
        String expectedErrorMessage= "Epic sadface: Sorry, this user has been locked out.";
        String actualErrorMessage= page.getMessageError(page.errorMessageForLokedOut);
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
        System.out.println("the second test case done");
        driver.quit();
    }


}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class LoginPage extends PageBase {



    public LoginPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(id="user-name")
        WebElement userNameinput ;

    @FindBy(id="password")
    WebElement passwordinput ;

   @FindBy(id = "login-button")
    WebElement loginBtn1;

   @FindBy(xpath = "(//div[@class='error-message-container error'])[1]")
   public
   WebElement errorMessageForLokedOut ;


    public void UserLogin(String username , String password)
    {
        userNameinput.sendKeys(username);
        passwordinput.sendKeys(password);
        loginBtn1.click();
    }



    public String  getMessageError(WebElement element){
        String text =element.getText();
        return  text;
    }

}


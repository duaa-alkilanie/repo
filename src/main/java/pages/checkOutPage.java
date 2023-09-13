package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class checkOutPage extends PageBase {
    public checkOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//button[@id='checkout']")
    WebElement checkOutBtn;
    @FindBy (id = "first-name")
    WebElement firstNameInput;
    @FindBy(id="last-name")
    WebElement lastNameInput;
    @FindBy(id="postal-code")
    WebElement postalCodeInput;
    @FindBy(id="continue")
    WebElement continueBtn;
    @FindBy(xpath = "(//span[@class='title'])[1]")
    WebElement checkPageDetails;
    @FindBy(id="finish")
    WebElement finishBtn;
    @FindBy(xpath = "//div[@class='header_secondary_container']")
    WebElement completeCheckout;

    protected static void setTextElementText(WebElement textElement , String value)
    {
        textElement.sendKeys(value);
    }
    protected static void clickButton(WebElement button)
    {
        button.click();
    }
public void clickONCheckout(){
    checkOutBtn.click();
}
public void insertInformationforCheckout(String firstName,String lastName,String postalcode){
    setTextElementText(firstNameInput,firstName);
    setTextElementText(lastNameInput,lastName);
    setTextElementText(postalCodeInput,postalcode);
    clickButton(continueBtn);
}
public String checkOutdeatils(){
  String title=  checkPageDetails.getText();
    System.out.println(title);
    return title;
}
public void clickFinishBtn(){
    clickButton(finishBtn);
}
    public String completeCheckOut(){
        String title= completeCheckout.getText();
        System.out.println(title);
        return title;
    }
}

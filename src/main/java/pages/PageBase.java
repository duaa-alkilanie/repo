package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
     protected WebDriver driver;

    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    protected static void setTextElementText(WebElement textElement , String value)
    {
        textElement.sendKeys(value);
    }
    protected static void clickButton(WebElement button)
    {
        button.click();
    }
    public void clearText(WebElement element)
    {
        element.clear();
    }

    public String  getMessageError(WebElement element){
       String text =element.getText();
        return  text;
    }

}

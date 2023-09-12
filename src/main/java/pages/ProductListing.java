package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.PageBase;

public class ProductListing extends PageBase {
    WebDriver driver;
    public ProductListing(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//select[@class='product_sort_container']")
        WebElement   selectElement;
    @FindBy(id="add-to-cart-sauce-labs-onesie")
    WebElement addToCardBtn;
    @FindBy(xpath = "(//span[@class='shopping_cart_badge'])[1]")
    WebElement cartIcon;


    public void selectPriceFromLowToHigh(){
        selectElement.click();
        Select dropDownicon = new Select(selectElement);
        dropDownicon.selectByValue("lohi");
    }
    public void addToCart(){
        addToCardBtn.click();
    }
    public String checkCartItemAdd(){
      String itemAmount=cartIcon.getText();
        System.out.println(itemAmount);
        return itemAmount;
    }
    public void clickCartIcon(){
        clickButton(cartIcon);
    }
}

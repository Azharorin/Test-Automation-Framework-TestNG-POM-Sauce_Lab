package pages;

import AbstractComponent.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart extends AbstractComponents {
    public WebDriver driver;

    @FindBy(xpath="//button[@name=\"add-to-cart-sauce-labs-backpack\"]")
    public WebElement addToCartBtn;
    @FindBy(xpath="//div//a[@class=\"shopping_cart_link\"]/.")
    public WebElement shoppingCartLink;
    @FindBy(xpath="//div[text()=\"Sauce Labs Backpack\"]")
    public WebElement inventoryItemNameTxt;

    public AddToCart(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String getInventoryItemName() {
        return inventoryItemNameTxt.getText();
    }
    public void addToCart_Product(){
        addToCartBtn.click();
       shoppingCartLink.click();


    }


}

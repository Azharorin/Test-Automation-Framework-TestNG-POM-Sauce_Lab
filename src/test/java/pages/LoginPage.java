package pages;

import AbstractComponent.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractComponents {
    public WebDriver driver;
    @FindBy(xpath = "//input[@name='user-name']")
    public WebElement nameTxt;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTxt;
    @FindBy(xpath = "//input[@name='login-button']")
    public WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AddToCart do_Login(String userName, String Password) {
        nameTxt.sendKeys(userName);
        passwordTxt.sendKeys(Password);
        loginButton.click();
        AddToCart addToCart = new AddToCart(driver);
        return addToCart;
    }


}

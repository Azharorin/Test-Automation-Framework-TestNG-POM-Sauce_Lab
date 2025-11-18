package pages;

import AbstractComponent.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut extends AbstractComponents {
    public WebDriver driver;
    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement checkoutBtn;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameTxt;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastNameTxt;
    @FindBy(xpath = "//input[@name='postalCode']")
    public WebElement postalCode;
    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;
    @FindBy(xpath = "//div[text()='Payment Information:']/.")
    public WebElement paymentInformationLabelTxt;
    //public By paymentInformationLabelTxt = By.xpath("//div[text()='Payment Information:']");
    @FindBy(xpath = "//h2[text()='Thank you for your order!']/.")
    public WebElement headerTxt;

    public CheckOut(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void do_Checkout(String firstName, String lastName, String postal_code) {
        checkoutBtn.click();
        firstNameTxt.sendKeys(firstName);
        lastNameTxt.sendKeys(lastName);
        postalCode.sendKeys(postal_code);
        continueButton.click();
    }

    public String paymentInformationLabel() {
        waitForElementToAppear_ByWebElement(paymentInformationLabelTxt);
        return paymentInformationLabelTxt.getText();
    }

    public String complete_Order() {
        return headerTxt.getText();
    }


}

package AbstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponents {
    public WebDriver driver;
    @FindBy(xpath = "//button[text()='Open Menu']")
    public WebElement openMenuBtn;
    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutLinkText;
    @FindBy(xpath = "//button[text()='Back Home']")
    public WebElement backInHomeBtn;
    @FindBy(xpath = "//button[text()='Finish']")
    public WebElement finishButton;

    public AbstractComponents(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForElementToAppearBY(By findby) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(findby));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findby));

    }
    public void waitForElementToAppearByWebElement(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    public void goTo() {
        driver.get("https://www.saucedemo.com/");

    }

    public void finishCheckOut() {
        finishButton.click();
    }

    public void backIn_Home() {
        backInHomeBtn.click();
    }

    public void do_Logout() {
        openMenuBtn.click();
        logoutLinkText.click();
    }


}

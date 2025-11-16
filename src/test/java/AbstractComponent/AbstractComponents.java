package AbstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponents {
    public WebDriver driver;

    public AbstractComponents(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this
        );

    }
    public void  waitForElementToAppearBY(By findby){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(findby));

    }

    public void waitForElementToAppear_ByWebElement(WebElement findBy){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(findBy));
    }

    public void goTo(){
        driver.get("https://www.saucedemo.com/");
    }




}

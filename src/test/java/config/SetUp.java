package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class SetUp {
    public WebDriver driver;
    public LoginPage loginpage;

    @BeforeTest
    public WebDriver setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    @BeforeMethod
    public LoginPage launchApplication() {
        loginpage = new LoginPage(driver);
        loginpage.goTo();
        return loginpage;
    }

    @AfterTest
    public void close_driver() {
        // driver.close();
    }


}

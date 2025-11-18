package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;
import pages.LoginPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class SetUp {
    public WebDriver driver;
    public LoginPage loginpage;

    @BeforeTest
    public WebDriver setUp() throws IOException {
/*        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\azhar.alam\\IdeaProjects\\testNG-automation-framework-SwagLabs\\src\\test\\resources\\properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        boolean headless = Boolean.parseBoolean(prop.getProperty("headless", "false"));*/

       /* if (browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            if (headless) {
                options.addArguments("--headless");
                options.addArguments("--window-size=1920,1080");
            }
            driver = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            if (headless) {
                options.addArguments("--headless");
                options.addArguments("--width=1920");
                options.addArguments("--height=1080");
            }
            driver = new FirefoxDriver(options);
        } else if (browserName.equalsIgnoreCase("edge")) {
           *//* EdgeOptions options = new EdgeOptions();
            if (headless) {
                options.addArguments("--headless");
               options.addArguments("--window-size=1920,1080");
            }*//*
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browserName);
        }*/
        driver = new EdgeDriver();
      //  driver.get("https://www.saucedemo.com/");


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

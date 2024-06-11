package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseUtil {
    protected static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Set the path to chromedriver executable
            System.setProperty("webdriver.chrome.driver", "C:/Users/Ajeet/eclipse-workspace/ShopkeyWeb-Cucumber/src/test/resources/drivers/chromedriver.exe");

            // Set Chrome options if needed
            ChromeOptions options = new ChromeOptions();
            // options.addArguments("start-maximized");

            // Initialize WebDriver
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

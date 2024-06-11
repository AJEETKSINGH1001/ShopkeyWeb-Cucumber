package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import io.cucumber.java.en.*;
import utils.BaseUtil;

public class HomePageSteps extends BaseUtil {
	protected WebDriver driver = getDriver();
   // WebDriver driver;

    @Given("I open the browser")
    public void i_open_the_browser() {
        //System.setProperty("webdriver.chrome.driver", "C:/Users/Ajeet/eclipse-workspace/ShopkeyWeb-Cucumber/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I navigate to the homepage")
    public void i_navigate_to_the_homepage() {
    	
        driver.get("https://test0106store1a.goshopkey.com/");
    }

    @Then("I should see the title {string}")
    public void i_should_see_the_title(String expectedTitle) {
      // FluentWait<WebDriver> wait = null;
		// WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.titleIs(expectedTitle));
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        driver.quit();
    }
}

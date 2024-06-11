package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class LogoSteps extends BaseUtil {
	protected WebDriver driver = getDriver();
	
	
	@Given("I open the browser2")
    public void i_open_the_browser1() {
        //System.setProperty("webdriver.chrome.driver", "C:/Users/Ajeet/eclipse-workspace/ShopkeyWeb-Cucumber/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I navigate to the homepage2")
    public void i_navigate_to_the_homepage1() {
        driver.get("https://test0106store1a.goshopkey.com/");
    }

    @Given("User navigates to the homepage")
    public void user_navigates_to_the_homepage() {
        driver.get("https://test0106store1a.goshopkey.com/");
    }

    @Then("Logo image is displayed")
    public void logo_image_is_displayed() {
        WebElement logoImage = driver.findElement(By.xpath("//*[@id=\"headlessui-popover-button-:r0:\"]/img"));
        ////*[@id="headlessui-popover-button-:r0:"]/img
        assertTrue("Logo image is not displayed", logoImage.isDisplayed());
    }

    @Then("Logo image has correct alt text")
    public void logo_image_has_correct_alt_text() {
        WebElement logoImage = driver.findElement(By.xpath("//*[@id=\"headlessui-popover-button-:r0:\"]/img"));
        assertTrue("Logo image does not have correct alt text", "Logo".equals(logoImage.getAttribute("alt")));
    }

    @When("User clicks on the logo image")
    public void user_clicks_on_the_logo_image() {
        WebElement logoImage = driver.findElement(By.xpath("//*[@id=\"headlessui-popover-button-:r0:\"]/img"));
        logoImage.click();
    }

    @Then("User should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() {
        // Assuming homepage URL is 'https://test0106store1a.goshopkey.com/'
        assertTrue("User is not redirected to the homepage", driver.getCurrentUrl().equals("https://test0106store1a.goshopkey.com/"));
    }
}

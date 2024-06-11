package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import io.cucumber.java.en.*;
import utils.BaseUtil;

public class ProductSearchSteps extends BaseUtil {
	protected WebDriver driver = getDriver();
    //WebDriver driver;

    @Given("I open the browser1")
    public void i_open_the_browser1() {
        //System.setProperty("webdriver.chrome.driver", "C:/Users/Ajeet/eclipse-workspace/ShopkeyWeb-Cucumber/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I navigate to the homepage1")
    public void i_navigate_to_the_homepage1() {
        driver.get("https://test0106store1a.goshopkey.com/");
    }

    @When("I search for a product {string}")
    public void i_search_for_a_product(String productName) {
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div[1]/input"));
        searchBox.sendKeys(productName);
        searchBox.submit();
    }

    @Then("I should see search results containing {string}")
    public void i_should_see_search_results_containing(String productName) {
        WebElement results = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div[2]/div/div/div/div/div[1]/div/ul/li[1]/div/div/a/div[2]/div[1]/div[1]/div[1]"));
        Assert.assertTrue(results.getText().contains(productName));
        driver.quit();
    }
}

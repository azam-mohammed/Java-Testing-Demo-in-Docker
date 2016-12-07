package test.stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.drivers.BrowserType;
import test.drivers.SingletonBrowserDriver;

import java.util.Map;


public class NavigationStepDefs {

    public static WebDriver driver = SingletonBrowserDriver
            .getWebDriver(BrowserType.CHROME);

    @Given("^I visit \"([^\"]*)\" page$")
    public void i_visit_page(String URL) {
        driver.navigate().to(URL);
    }

    @When("^I click \"([^\"]*)\" link$")
    public void i_click_link(String linkText) {
        driver.findElement(By.linkText(linkText)).click();

    }


    @When("^I login to website$")
    public void i_login_to_website() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("doLogin")).click();

    }

    @Then("^I should be on \"([^\"]*)\" page$")
    public void i_should_be_on_page(String title) {
        driver.getTitle().equals(title);
    }

    @Then("^I enter following data in text fields:$")
    public void i_enter_following_data_in_text_fields(DataTable dataTable) {
        for (Map<String, String> map : dataTable.asMaps(String.class, String.class)) {
            driver.findElement(By.id(map.get("field"))).sendKeys(map.get("value"));
        }
    }

    @Then("^I click on \"([^\"]*)\" button$")
    public void i_click_on_button(String arg1) {
        driver.findElement(By.id("createHotel")).click();
    }

    @Then("^I should be able to delete\\((\\d+)\\) input hotel$")
    public void i_should_be_able_to_delete_input_hotel(int times) {

        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("hotelDelete")));
        driver.findElements(By.className("hotelDelete")).get(0).click();

    }

    @Then("^I should be entering multiple\\((\\d+)\\) values in page$")
    public void i_should_be_entering_multiple_values_in_page(int times) {
        for (int i = 0; i < times; i++) {
            driver.findElement(By.id("hotelName")).sendKeys("name" + i);
            driver.findElement(By.id("address")).sendKeys("address" + i);
            driver.findElement(By.id("owner")).sendKeys("owner" + i);
            driver.findElement(By.id("phone")).sendKeys("phone" + i);
            driver.findElement(By.id("email")).sendKeys("email" + i);
            driver.findElement(By.id("createHotel")).click();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


}

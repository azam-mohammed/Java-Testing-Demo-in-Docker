package test.hooks;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import test.drivers.BrowserType;
import test.drivers.SingletonBrowserDriver;

public class WebHooks {

    private static WebDriver driver;

    @Before(value = {"@suite"})
    public static void initialize() {
        System.out.println("Before-1");
        driver = SingletonBrowserDriver.getWebDriver(BrowserType.CHROME);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                if (driver == null) {
                    System.out.println("shutdown hook - 1");
                    return;
                } else {
                    System.out.println("shutdown hook - 2");
//					driver.quit();
                }
            }
        });
    }

    @After(value = {"@suite"})
    public static void tearDown(Scenario scenario) {
        System.out.println("After - 1");
        if (scenario.isFailed()) {
            System.out.println("After - 2");
            byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }

}

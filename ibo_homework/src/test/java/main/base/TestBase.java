package main.base;

import main.pageobjects.NavigationPO;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    private static final String CHROME_DRIVER_URL = "src//test//java//resources//drivers/chromedriver.exe";

    private static WebDriver driver;

    public TestBase() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_URL);
        driver = new ChromeDriver();
        String URL = "https://www.sportsdirect.com/";
        new NavigationPO().navigateToUrl(URL);
        getDriver().manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void closeWindow(){
        driver.close();
    }
}


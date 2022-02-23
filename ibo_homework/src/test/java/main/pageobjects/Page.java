package main.pageobjects;

import main.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    WebDriver driver;
    protected WebDriverWait wait;

    Page() {
        this.driver = TestBase.getDriver();
        PageFactory.initElements(this.driver, this);
    }

  /*  public void explicitWaitVisibilityOfElement(int timeOutInSeconds, By element) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }*/
}

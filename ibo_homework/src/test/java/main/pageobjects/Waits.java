package main.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits extends Page {
    public void explicitWaitVisibilityOfElement(int timeOutInSeconds, By element) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }
}

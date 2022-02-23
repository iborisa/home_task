package main.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainScreenPO extends Page {

    @FindBy(id = "txtSearch")
    private WebElement inpt_search;

    @FindBy(id = "cmdSearch")
    private WebElement btn_search;

    public ProductPO searchForProduct(String value) {
        inpt_search.sendKeys(value);
        btn_search.click();
        return new ProductPO();
    }
}

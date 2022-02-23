package main.pageobjects;

import main.enums.ErrorMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class ProductPO extends Page {

    private static final String SIZE_BTN = "[id='ulSizes'] [data-text='%s']";

    @FindBy(id = "aAddToBag")
    private WebElement btn_add_to_bag;

    @FindBy(id = "genericMessage")
    private WebElement lbl_product_added;

    @FindBy(id = "BuySizeText")
    private WebElement lbl_size_error;

    @FindBy(id = "bagQuantityContainer")
    private WebElement btn_my_bag;

    @FindBy(css =".s-basket-plus-button")
    private WebElement btn_increase_quantity;

    public ProductPO addProductToBag() {
        btn_add_to_bag.click();
        return new ProductPO();
    }

    public ProductPO selectSize(String size) {
        driver.findElement(By.cssSelector(String.format(SIZE_BTN, size))).click();
        return new ProductPO();
    }

    public ProductPO increaseProductQuantity(){
        btn_increase_quantity.click();
        return new ProductPO();
    }

    public void checkProductAddedToBagMessageDisplayed() {
        lbl_product_added.isDisplayed();
    }

    public void checkSizeNotSelectedError() {
        assertEquals(ErrorMessages.SIZE_NOT_SELECTED.getErrorMessage(), lbl_size_error.getText());
    }

    public MyBagPO openMyBag() {
        btn_my_bag.click();
        return new MyBagPO();
    }

}

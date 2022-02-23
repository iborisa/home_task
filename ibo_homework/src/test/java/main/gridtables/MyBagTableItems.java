package main.gridtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyBagTableItems {
    private WebElement rootElement;

    public MyBagTableItems(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getProductDescription() {
        return rootElement.findElement(By.className("prodDescContainer"));
    }

    public WebElement getQuantity(){
        return rootElement.findElement(By.cssSelector(".qtybox"));
    }
}

package main.pageobjects;

import main.gridtables.MyBagTableItems;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;


public class MyBagPO extends Page {

    private By MY_BAG_ENTRIES = By.cssSelector("[id='gvBasketDetails'] .productLine");
    private static final Integer WAIT_SECONDS = 5;

    private List<MyBagTableItems> getAllMyBagEntries() {
        return driver.findElements(MY_BAG_ENTRIES).stream().map(MyBagTableItems::new).collect(Collectors.toList());
    }

    private MyBagTableItems getBagItemByName(String name) {
        Optional<MyBagTableItems> element = getAllMyBagEntries().stream().filter(i -> i.getProductDescription().getText().contains(name)).findFirst();
        return element.orElse(null);
    }

    public MyBagPO checkBagItemQuantityByProductName(String name, String quantity) {
        new Waits().explicitWaitVisibilityOfElement(WAIT_SECONDS, MY_BAG_ENTRIES);
        assertEquals(quantity, getBagItemByName(name).getQuantity().getAttribute("value"));
        return new MyBagPO();
    }
}

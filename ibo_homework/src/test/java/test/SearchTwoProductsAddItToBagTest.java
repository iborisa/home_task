package test;

import main.base.TestBase;
import main.pageobjects.MainScreenPO;
import org.junit.Test;


public class SearchTwoProductsAddItToBagTest extends TestBase {

    private static final String PRODUCT_1 = "Faux Leather Belt Womens";
    private static final String PRODUCT_2 = "3 In 1 Chess Draughts And Tic Tac Toe Game Set";
    private static final String SIZE_1 = "80";
    private static final String QUANTITY_PRODUCT_1 = "1";
    private static final String QUANTITY_PRODUCT_2 =  "2";
    private MainScreenPO mainScreenPO = new MainScreenPO();

    @Test
    public void checkTwoProductsAddedToMyBag() {

        mainScreenPO.searchForProduct(PRODUCT_1)
                .selectSize(SIZE_1)
                .addProductToBag()
                .checkProductAddedToBagMessageDisplayed();
        mainScreenPO.searchForProduct(PRODUCT_2)
                .increaseProductQuantity()
                .addProductToBag()
                .openMyBag()
                .checkBagItemQuantityByProductName(PRODUCT_1, QUANTITY_PRODUCT_1)
                .checkBagItemQuantityByProductName(PRODUCT_2, QUANTITY_PRODUCT_2);
    }

    @Test
    public void checkErrorMessageSizeNotSelected() {

        mainScreenPO.searchForProduct(PRODUCT_1)
                .addProductToBag()
                .checkSizeNotSelectedError();
    }
}

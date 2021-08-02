package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.base.Setup.driver;
import static com.n11.gauge.pages.CartConstants.*;
import static com.n11.gauge.pages.SearchComputer.listPrice;

public class Cart {

    @Step("Check if price equals to searching price")
    public void checkPrice() {
        String cartPrice = driver.findElement(PRODUCT_CART_PRICE).getText();
        Assertions.assertEquals(listPrice, cartPrice);
    }

    @Step("Up to 2 computer count")
    public void upProductCount() {
        click(UP_PRODUCT_COUNT);
    }

    @Step("Delete computer from cart")
    public void deleteProductFromCart() {
        click(DELETE_PRODUCT);
    }

    @Step("Check if delete computers in cart")
    public void checkDelete() {

    }

    @Step("Logout from account")
    public void logout() {

    }
}

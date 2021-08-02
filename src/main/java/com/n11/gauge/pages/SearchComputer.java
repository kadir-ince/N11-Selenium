package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.base.Setup.*;
import static com.n11.gauge.constants.AddToCartConstants.*;
import static com.n11.gauge.constants.SearchConstants.SECOND_PAGE;

public class SearchComputer {
    public static String listPrice;
    @Step("Move to second computer page")
    public void moveToSecondPage() {
        click(SECOND_PAGE);
        log.info("Moved 2nd computer page");
    }

    @Step("Check if open second computer page")
    public void checkSecondPage() {
        Assertions.assertEquals(driver.getCurrentUrl(), "https://www.n11.com/arama?q=Bilgisayar&pg=2", "Can't go to 2nd page");

    }

    @Step("Click to any product")
    public void clickToProduct() {
        listPrice = driver.findElement(PRODUCT_LIST_PRICE).getText();
        click(COMPUTER);
        log.info("Click to computer");
    }

    @Step("Add to cart")
    public void addToCart() {
        click(ADD_TO_CART);
        log.info("Add computer to cart");
    }


    @Step("Click to Cart Icon")
    public void goToCart() {
        click(CART);
    }
}

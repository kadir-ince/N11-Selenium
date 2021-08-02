package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;
import com.n11.gauge.constants.SearchConstants.*;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.base.BaseMethods.sendKeys;
import static com.n11.gauge.base.Setup.driver;
import static com.n11.gauge.base.Setup.log;
import static com.n11.gauge.constants.SearchConstants.SEARCH_BUTTON;
import static com.n11.gauge.constants.SearchConstants.SEARCH_INPUT;
import static com.n11.gauge.constants.ShowFavoritesConstants.*;
//import static org.junit.Assert.*;

public class Favorites {

    @Step("Show all favorites")
    public void showAllFavorites() {
        click(FAVORITES_TAB_LINK);
        click(ALL_FAVORITES_LINK);
        log.info("Showing my favorites page");

    }

    @Step("Check if favorites open")
    public void checkFavoritesOpen() {
        Assertions.assertEquals(driver.getTitle(), "Favorilerim - n11.com", "Can't go to favorites page");
    }

    @Step("Delete phone in favorites")
    public void deletePhone() {
        click(DELETE_FAVORITES);
        log.info("Deleted phone from favorites");
    }

    @Step("Check if delete phone in favorites")
    public void checkDelete() {
        Assertions.assertTrue(driver.findElement(DELETE_OK_BUTTON).isDisplayed(), "Can't delete phone from favorites");
    }

    @Step("Close the delete message")
    public void closeMessage() {
        click(DELETE_OK_BUTTON);
    }

    @Step("Searching <Bilgisayar>")
    public void searchComputer(String key) throws InterruptedException {
        Thread.sleep(1000);
        sendKeys(SEARCH_INPUT, key);
        click(SEARCH_BUTTON);
        log.info("Searched Computer");
    }

    @Step("Check if the searching computer")
    public void checkSearch() {
        Assertions.assertEquals(driver.getTitle(), "Bilgisayar - n11.com", "Can't go to search bilgisayar page");
    }
}
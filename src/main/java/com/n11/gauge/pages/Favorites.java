package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.base.Setup.driver;
import static com.n11.gauge.constants.ShowFavoritesConstants.*;
import static org.junit.Assert.*;

public class Favorites {

    @Step("Show all favorites")
    public void showAllFavorites() {
        click(FAVORITES_TAB_LINK);
        click(ALL_FAVORITES_LINK);
    }

    @Step("Check if favorites open")
    public void checkFavoritesOpen() {
        assertEquals(driver.getTitle(), "Favorilerim - n11.com");
    }

    @Step("Delete phone in favorites")
    public void deletePhone() {
        click(DELETE_FAVORITES);
    }

    @Step("Check if delete phone in favorites")
    public void checkDelete() {
        assertTrue(driver.findElement(DELETE_OK_BUTTON).isDisplayed());
    }

    @Step("Close the delete message")
    public void closeMessage() {
        click(DELETE_OK_BUTTON);
    }
}
package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;
import static com.n11.gauge.constants.ShowFavoritesConstants.*;
public class showFavorites {

    @Step("Show all favorites")
    public void showAllFavorites() {
        HomePage.driver.findElement(FAVORITES_TAB_LINK).click();
        HomePage.driver.findElement(ALL_FAVORITES_LINK).click();
    }

    @Step("Check if favorites open")
    public void checkFavoritesOpen() {
        // Check
    }

    @Step("Delete phone in favorites")
    public void deletePhone() {
        HomePage.driver.findElement(DELETE_FAVORITES).click();
    }

    @Step("Check if delete phone")
    public void checkDeletePhone() {
        // Check
    }
}

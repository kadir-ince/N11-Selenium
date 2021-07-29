package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.Base.BaseMethods.click;
import static com.n11.gauge.constants.ShowFavoritesConstants.*;

public class showFavorites {

    @Step("Show all favorites")
    public void showAllFavorites() {
        click(FAVORITES_TAB_LINK);
        click(ALL_FAVORITES_LINK);
    }

    @Step("Check if favorites open")
    public void checkFavoritesOpen() {
        // Check
    }

    @Step("Delete phone in favorites")
    public void deletePhone() {
        click(DELETE_FAVORITES);
    }

    @Step("Check if delete phone")
    public void checkDeletePhone() {
        // Check
    }
}

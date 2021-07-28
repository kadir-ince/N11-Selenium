package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.Setup.Setup.*;
import static com.n11.gauge.constants.AddFavoriteConstans.*;

public class AddFavorite {

    @Step("Add third phone to favorites")
    public void addToFavorites() {
        driver.findElement(THIRD_PHONE).click();
    }

    @Step("Go to account page")
    public void goToAccountPage() {
        driver.findElement(ACCOUNT_LINK).click();
    }
}
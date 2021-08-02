package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.base.Setup.log;
import static com.n11.gauge.constants.AddFavoriteConstants.*;

public class AddFavorite {

    @Step("Add third phone to favorites")
    public void addToFavorites() {
        click(THIRD_PHONE);
        log.info("Added 3rd phone to favorites");
    }

    @Step("Go to account page")
    public void goToAccountPage() {
        click(ACCOUNT_LINK);
        log.info("Go to my account page");
    }
}

package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.Base.BaseMethods.click;
import static com.n11.gauge.Base.Setup.*;
import static com.n11.gauge.constants.HomePageConstans.*;

public class HomePage {


    @Step("Navigate to <siteURL>")
    public void navigateTo(String url) {
        setupDriver(url);
    }

    @Step("Check if the page open")
    public void isOpen() {
        // Check
    }

    @Step("Click to the login button")
    public void clickLoginButton() {
        click(LOGIN_PAGE_BUTTON);
    }
}

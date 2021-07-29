package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.base.Setup.*;
import static com.n11.gauge.constants.HomePageConstans.*;
import static org.junit.Assert.assertEquals;

public class HomePage {


    @Step("Navigate to <siteURL>")
    public void navigateTo(String url) {
        setupDriver(url);
    }

    @Step("Check if the open homepage")
    public void isOpen() {
        assertEquals(driver.getCurrentUrl(),"https://www.n11.com/");
    }

    @Step("Click to the login button")
    public void clickLoginButton() {
        click(LOGIN_PAGE_BUTTON);
    }
}

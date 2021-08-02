package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.base.Setup.*;
import static com.n11.gauge.constants.HomePageConstants.LOGIN_PAGE_BUTTON;



public class HomePage {


    @Step("Navigate to <siteURL>")
    public void navigateTo(String url) {
        setupDriver(url);
        log.info("Opened n11.com homepage");

    }

    @Step("Check if the open homepage")
    public void isOpen() {
        Assertions.assertEquals(driver.getCurrentUrl(), "https://www.n11.com/", "Not open n11 home page");
    }

    @Step("Click to the login button")
    public void clickLoginButton() {
        click(LOGIN_PAGE_BUTTON);
        log.info("Clicked go to login page");
    }
}

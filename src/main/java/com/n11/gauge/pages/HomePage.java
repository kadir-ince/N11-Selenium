package com.n11.gauge.pages;

import com.n11.gauge.Setup.Setup;
import com.thoughtworks.gauge.Step;

import static com.n11.gauge.Setup.Setup.*;
import static com.n11.gauge.constants.HomePageConstans.*;

public class HomePage {


    @Step("Navigate to <siteURL>")
    public void navigateTo(String url) {
        Setup.setupDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @Step("Check if the page open")
    public void isOpen() {
        // Check
    }

    @Step("Click to the login button")
    public void clickLoginButton() {
        driver.findElement(LOGIN_PAGE_BUTTON).click();
    }
}

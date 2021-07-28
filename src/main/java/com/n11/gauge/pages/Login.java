package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.constants.LoginConstans.*;


public class Login {

    @Step("Login to n11 with <email> and <password>")
    public void fillInputs(String userEmail, String userPassword) {
        HomePage.driver.findElement(EMAIL_FIELD).sendKeys(userEmail);
        HomePage.driver.findElement(PASSWORD_FIELD).sendKeys(userPassword);
    }

    @Step("Click to login button")
    public void clickLoginButton() {
        HomePage.driver.findElement(LOGIN_BUTTON).click();
    }

    @Step("Check if the user is logged in")
    public void checkLogin() {
        // Check
    }
}
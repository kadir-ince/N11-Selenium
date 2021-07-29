package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.Base.BaseMethods.*;
import static com.n11.gauge.constants.LoginConstants.*;

public class Login {

    @Step("Login to n11 with <email> and <password>")
    public void fillInputs(String userEmail, String userPassword) {
        sendKeys(EMAIL_FIELD, userEmail);
        sendKeys(PASSWORD_FIELD, userPassword);
    }

    @Step("Click to login button")
    public void clickLoginButton() {
        click(LOGIN_BUTTON);
    }

    @Step("Check if the user is logged in")
    public void checkLogin() {
        // Check
    }
}
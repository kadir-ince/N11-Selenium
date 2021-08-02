package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;

import static com.n11.gauge.base.BaseMethods.*;
import static com.n11.gauge.base.Setup.*;
import static com.n11.gauge.constants.LoginConstants.*;

public class Login {

    @Step("Login to n11 with <email> and <password>")
    public void fillInputs(String userEmail, String userPassword) {
        sendKeys(EMAIL_FIELD, userEmail);
        sendKeys(PASSWORD_FIELD, userPassword);
        log.info("Filled Email and Password Inputs");
    }

    @Step("Click to login button")
    public void clickLoginButton() {
        click(LOGIN_BUTTON);
        log.info("Clicked the login button");
    }

    @Step("Check if the user is logged in")
    public void checkLogin() {
        Assertions.assertEquals(driver.getCurrentUrl(), "https://www.n11.com/", "Can't Login");
        log.info("Checked if the user is logged in");
    }
}
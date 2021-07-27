package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;


public class Login {

    By emailField = By.xpath("//*[@id=\"email\"]");
    By passwordField = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/form/div[4]");


    @Step("Fill email input <email>")
    public void fillEmail(String userEmail) {
        OpenHomePage.driver.findElement(emailField).sendKeys(userEmail);
    }

    @Step("Fill password input <password>")
    public void fillPassword(String userPassword) {
        OpenHomePage.driver.findElement(passwordField).sendKeys(userPassword);
        OpenHomePage.driver.findElement(loginButton).click();
//        OpenHomePage.driver.findElement(passwordField).submit();
//        OpenHomePage.driver.findElement(passwordField).sendKeys(Keys.ENTER);


    }

    @Step("Click to login button")
    public void clickLoginButton() {
//        OpenHomePage.driver.findElement(loginButton).click();

        // Check Login Action
    }
}

package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;


public class Login {
    By emailField = By.xpath("//*[@id=\"email\"]");
    By passwordField = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/form/div[4]");

    @Step("Login to n11 with <email> and <password>")
    public void fillInputs(String userEmail, String userPassword) {
        OpenHomePage.driver.findElement(emailField).sendKeys(userEmail);
        OpenHomePage.driver.findElement(passwordField).sendKeys(userPassword);
    }

    @Step("Click to login button")
    public void clickLoginButton() {
        OpenHomePage.driver.findElement(loginButton).click();
    }

    @Step("Check if the user is logged in")
    public void checkLogin() {
        // Check
    }
}


//package com.n11.gauge;
//
//import com.thoughtworks.gauge.Step;
//import org.openqa.selenium.By;
//
//
//public class Login {
//
//    By emailField = By.xpath("//*[@id=\"email\"]");
//    By passwordField = By.xpath("//*[@id=\"password\"]");
//    By loginButton = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/form/div[4]");
//
//
//    @Step("Fill email input <email>")
//    public void fillEmail(String userEmail) {
//        OpenHomePage.driver.findElement(emailField).sendKeys(userEmail);
//    }
//
//    @Step("Fill password input <password>")
//    public void fillPassword(String userPassword) {
//        OpenHomePage.driver.findElement(passwordField).sendKeys(userPassword);
//        OpenHomePage.driver.findElement(loginButton).click();
////        OpenHomePage.driver.findElement(passwordField).submit();
////        OpenHomePage.driver.findElement(passwordField).sendKeys(Keys.ENTER);
//
//
//    }
//
//    @Step("Click the login button")
//    public void clickLoginButton() {
////        OpenHomePage.driver.findElement(loginButton).click();
//
//        // Check Login Action
//    }
//}
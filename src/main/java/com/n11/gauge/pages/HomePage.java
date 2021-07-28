package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.n11.gauge.constants.HomePageConstans.*;

public class HomePage {

    public static WebDriver driver;

    @Step("Navigate to <siteURL>")
    public void navigateTo(String url) {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get(url);
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

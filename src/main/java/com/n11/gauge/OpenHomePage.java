package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenHomePage {

    public static WebDriver driver;
    By loginPageButton = By.xpath("//*[@id=\"header\"]//*[@class=\"myAccount\"]//*[@class=\"menuTitle nobg\"]");

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
        driver.findElement(loginPageButton).click();
    }
}

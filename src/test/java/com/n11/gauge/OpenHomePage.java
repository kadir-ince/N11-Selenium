package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenHomePage {

    public static WebDriver driver;
    By loginButton = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]");

    @Step("Navigate to <https://n11.com>")
    public void navigateTo(String url) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Step("Check it is open")
    public void isOpen() {
        if (driver.getTitle() != null) {
            System.out.println("----------------");
            System.out.println("|Page is opened|");
            System.out.println("----------------");
        }
    }

    @Step("Click to the login button")
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}

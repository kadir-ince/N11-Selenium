package com.n11.gauge.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {
    public static WebDriver driver;

    public static void setupDriver(String url) {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();

    }
}

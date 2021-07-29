package com.n11.gauge.base;

import org.openqa.selenium.By;

import static com.n11.gauge.base.Setup.*;

public class BaseMethods {
    public static void click(By by) {
        driver.findElement(by).click();
    }

    public static void sendKeys(By by, String keys) {
        driver.findElement(by).sendKeys(keys);
        driver.findElement(by);
    }
}

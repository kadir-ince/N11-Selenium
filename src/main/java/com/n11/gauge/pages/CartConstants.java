package com.n11.gauge.pages;

import org.openqa.selenium.By;

public class CartConstants {
    public static final By PRODUCT_CART_PRICE = By.xpath("//div[@class=\"dtl total\"]//span[@class=\"price\"]");
    public static final By UP_PRODUCT_COUNT = By.xpath("//span[@class=\"spinnerUp spinnerArrow\"]");
    public static final By DELETE_PRODUCT = By.xpath("//span[@title=\"Sil\"]");
    public static final By LOGOUT = By.xpath("");
}

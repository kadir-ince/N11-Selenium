package com.n11.gauge.constants;

import org.openqa.selenium.By;

public class AddToCartConstants {
    public static final By COMPUTER = By.xpath("//div[@id=\"view\"]//li[1]//*[@class=\"lazy\"]");
    public static final By CART = By.xpath("//a[@class=\"myBasket \"]");
    public static final By PRODUCT_LIST_PRICE = By.xpath("//div[@id=\"view\"]//li[1]//p[@class=\"view-instant-price\"]");
    public static final By ADD_TO_CART = By.xpath("//a[@title=\"Sepete Ekle\"]");

}

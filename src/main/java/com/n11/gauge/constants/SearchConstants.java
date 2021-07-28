package com.n11.gauge.constants;

import org.openqa.selenium.By;

public class SearchConstants {
    public static final By SEARCH_INPUT = By.xpath("//*[@id=\"searchData\"]");
    public static final By CLICK_BUTTON = By.xpath("//*[@class=\"searchBtn\"]");
    public static final By SECOND_PAGE = By.xpath("//*[@class=\"pagination\"]//a[text()=\"2\"]"); // 2nd page link's not have any attribute so we're catching with text
}

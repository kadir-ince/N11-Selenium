package com.n11.gauge.constants;

import org.openqa.selenium.By;

public class ShowFavoritesConstants {
    public static final By FAVORITES_TAB_LINK = By.xpath("//*[@class=\"accNav\"]//a[text()=\"Favorilerim / Listelerim\"]"); // favorites link's not have any attribute so we're catching with text
    public static final By ALL_FAVORITES_LINK = By.xpath("//a[contains(@href,\"favorilerim\")]");
    public static final By DELETE_FAVORITES = By.xpath("//*[@class=\"deleteProFromFavorites\"]");
    public static final By DELETE_OK_BUTTON = By.xpath("//div[@class=\"btnHolder\"]//span");
}

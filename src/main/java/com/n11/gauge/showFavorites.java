package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class showFavorites {

    By favoritesTabLink = By.xpath("//*[@class=\"accNav\"]//a[text()=\"Favorilerim / Listelerim\"]"); // favorites link's not have any attribute so we're catching with text
    By allFavoritesLink = By.xpath("//a[contains(@href,\"favorilerim\")]");
    By deleteFavorites = By.xpath("//*[@class=\"deleteProFromFavorites\"]");


    @Step("Show all favorites")
    public void showAllFavorites() {
        OpenHomePage.driver.findElement(favoritesTabLink).click();
        OpenHomePage.driver.findElement(allFavoritesLink).click();
    }

    @Step("Check if favorites open")
    public void checkFavoritesOpen() {
        // Check
    }

    @Step("Delete phone in favorites")
    public void deletePhone() {
        OpenHomePage.driver.findElement(deleteFavorites).click();
    }

    @Step("Check if delete phone")
    public void checkDeletePhone() {
        // Check
    }
}

package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class showFavorites {

    By favoritesTabLink = By.cssSelector(".accNav > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)");
    By allFavoritesLink = By.cssSelector("li.wishGroupListItem:nth-child(1) > div:nth-child(1) > a:nth-child(1)");
    By deleteFavorites = By.cssSelector(".deleteProFromFavorites");


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

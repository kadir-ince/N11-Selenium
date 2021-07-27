package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class showFavorites {


    @Step("Click the favorites/lists link")
    public void showFavoritesTab() {
        By favoritesLink = By.cssSelector(".accNav > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)");
        OpenHomePage.driver.findElement(favoritesLink).click();
    }

    @Step("Click the favorites link")
    public void showAllFavorites() {
        By favoritesLink = By.cssSelector("li.wishGroupListItem:nth-child(1) > div:nth-child(1) > a:nth-child(1)");
        OpenHomePage.driver.findElement(favoritesLink).click();
    }

    @Step("Delete phone in favorites")
    public void deletePhone() {
        By deleteFavorites = By.cssSelector(".deleteProFromFavorites");
        OpenHomePage.driver.findElement(deleteFavorites).click();

    }
}

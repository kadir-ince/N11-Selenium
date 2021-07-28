package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class AddFavorite {

    By thirdPhone = By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/section[2]/div[2]/ul/li[3]/div/div[1]/span");
    By accountLink = By.cssSelector("a.menuTitle");

    @Step("Add third phone to favorites")
    public void addToFavorites() {
        OpenHomePage.driver.findElement(thirdPhone).click();
    }

    @Step("Go to account page")
    public void goToAccountPage() {
        OpenHomePage.driver.findElement(accountLink).click();
    }
}

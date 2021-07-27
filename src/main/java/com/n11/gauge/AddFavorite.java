package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class AddFavorite {


    @Step("Add third phone to favorites")
    public void addToFavorites() {
        By thirdPhone = By.cssSelector("#p-469727452 > div:nth-child(1) > span:nth-child(3)");
        OpenHomePage.driver.findElement(thirdPhone).click();

        // check is it added
    }


    @Step("Go to account page")
    public void goToAccountPage() {
        By accountLink = By.cssSelector("a.menuTitle");
        OpenHomePage.driver.findElement(accountLink).click();
    }
}

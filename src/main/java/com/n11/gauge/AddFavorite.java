package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class AddFavorite {

    By thirdPhone = By.xpath("//*[@class=\"textImg followBtn\"]");
    By accountLink = By.xpath("//*[@class=\"myAccount\"]//*[@class=\"menuTitle\"]");

    @Step("Add third phone to favorites")
    public void addToFavorites() {
        OpenHomePage.driver.findElement(thirdPhone).click();
    }

    @Step("Go to account page")
    public void goToAccountPage() {
        OpenHomePage.driver.findElement(accountLink).click();
    }
}

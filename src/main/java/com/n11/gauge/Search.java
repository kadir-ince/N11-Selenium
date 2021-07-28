package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class Search {

    By searchInput = By.xpath("//*[@id=\"searchData\"]");
    By clickButton = By.xpath("//*[@class=\"searchBtn\"]");
    By secondPage = By.xpath("//*[@class=\"pagination\"]//a[text()=\"2\"]"); // 2nd page link's not have any attribute so we're catching with text

    @Step("Searching <Samsung> Phone")
    public void searchPhone(String phoneName) {
        OpenHomePage.driver.findElement(searchInput).sendKeys(phoneName);
        OpenHomePage.driver.findElement(clickButton).click();
    }

    @Step("Check if the searching samsung phone")
    public void checkSearch() {
        // Check
    }

    @Step("Move to second page")
    public void moveToSecondPage() {
        OpenHomePage.driver.findElement(secondPage).click();
    }

    @Step("Check if open second page")
    public void checkIsPageOpen() {
        // Check
    }
}
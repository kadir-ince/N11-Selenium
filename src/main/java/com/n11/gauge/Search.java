package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class Search {

    By searchInput = By.xpath("//*[@id=\"searchData\"]");
    By clickButton = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[1]/div/a");
    By secondPage = By.cssSelector(".pagination > a:nth-child(2)");

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
package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.constants.SearchConstants.*;

public class Search {

    @Step("Searching <Samsung> Phone")
    public void searchPhone(String phoneName) {
        HomePage.driver.findElement(SEARCH_INPUT).sendKeys(phoneName);
        HomePage.driver.findElement(CLICK_BUTTON).click();
    }

    @Step("Check if the searching samsung phone")
    public void checkSearch() {
        // Check
    }

    @Step("Move to second page")
    public void moveToSecondPage() {
        HomePage.driver.findElement(SECOND_PAGE).click();
    }

    @Step("Check if open second page")
    public void checkIsPageOpen() {
        // Check
    }
}
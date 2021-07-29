package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.base.BaseMethods.sendKeys;
import static com.n11.gauge.base.Setup.driver;
import static com.n11.gauge.constants.SearchConstants.*;
import static org.junit.Assert.assertEquals;

public class Search {

    @Step("Searching <Samsung> Phone")
    public void searchPhone(String phoneName) {
        sendKeys(SEARCH_INPUT, phoneName);
        click(CLICK_BUTTON);
    }

    @Step("Check if the searching Samsung phone")
    public void checkSearch() {
        assertEquals(driver.getTitle(), "Samsung - n11.com");
    }

    @Step("Move to second page")
    public void moveToSecondPage() {
        click(SECOND_PAGE);
    }

    @Step("Check if open second page")
    public void checkIsPageOpen() {
        assertEquals(driver.getCurrentUrl(), "https://www.n11.com/arama?q=Samsung&pg=2");
    }
}
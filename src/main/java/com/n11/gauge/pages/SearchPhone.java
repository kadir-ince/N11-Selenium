package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.base.BaseMethods.sendKeys;
import static com.n11.gauge.base.Setup.*;
import static com.n11.gauge.constants.SearchConstants.*;
//import static org.junit.Assert.assertEquals;

public class SearchPhone {

    @Step("Searching <Samsung> Phone")
    public void searchPhone(String phoneName) {
        sendKeys(SEARCH_INPUT, phoneName);
        click(SEARCH_BUTTON);
        log.info("Filled search box and click search button");
    }

    @Step("Check if the searching Samsung phone")
    public void checkSearch() {
        Assertions.assertEquals(driver.getTitle(), "Samsung - n11.com","Can't search phone");
    }

    @Step("Move to second page")
    public void moveToSecondPage() {
        click(SECOND_PAGE);
        log.info("Moved to 2nd page");
    }

    @Step("Check if open second page")
    public void checkIsPageOpen() {
        Assertions.assertEquals(driver.getCurrentUrl(), "https://www.n11.com/arama?q=Samsung&pg=2","Can't go to 2nd page");
    }
}
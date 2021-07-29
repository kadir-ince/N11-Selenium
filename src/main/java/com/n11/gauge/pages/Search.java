package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.Base.BaseMethods.*;
import static com.n11.gauge.constants.SearchConstants.*;
import static com.n11.gauge.Base.Setup.*;

public class Search {

    @Step("Searching <Samsung> Phone")
    public void searchPhone(String phoneName) {
        sendKeys(SEARCH_INPUT, phoneName);
        click(CLICK_BUTTON);
    }

    @Step("Check if the searching samsung phone")
    public void checkSearch() {
        // Check
    }

    @Step("Move to second page")
    public void moveToSecondPage() {
        click(SECOND_PAGE);
    }

    @Step("Check if open second page")
    public void checkIsPageOpen() {
        // Check
    }
}
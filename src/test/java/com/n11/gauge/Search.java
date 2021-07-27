package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
    @Step("Searching <Samsung> Phone")
    public void searchPhone(String phoneName) {
        WebDriverWait wait = new WebDriverWait(OpenHomePage.driver, 6);
        By searchInput = By.xpath("//*[@id=\"searchData\"]");
        OpenHomePage.driver.findElement(searchInput).sendKeys(phoneName);
    }

    @Step("Click the search button")
    public void clickSearchButton() {
        By clickButton = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[1]/div/a");
        OpenHomePage.driver.findElement(clickButton).click();

        // Check Searching
    }
}
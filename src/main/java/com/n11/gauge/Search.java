package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Search {
    @Step("Searching <Samsung> Phone")
    public void searchPhone(String phoneName) {
        By searchInput = By.xpath("//*[@id=\"searchData\"]");
        OpenHomePage.driver.findElement(searchInput).sendKeys(phoneName);
    }

    @Step("Click the search button")
    public void clickSearchButton() {
        By clickButton = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[1]/div/a");
        OpenHomePage.driver.findElement(clickButton).click();


        // Check Searching
    }
    @Step("Move to second page")
    public void moveToSecondPage() {
        JavascriptExecutor js = (JavascriptExecutor) OpenHomePage.driver;
        js.executeScript("window.scrollBy(0,8000)");

        By secondPage = By.cssSelector(".pagination > a:nth-child(2)");
        OpenHomePage.driver.findElement(secondPage).click();

        // Check is it open
    }
}
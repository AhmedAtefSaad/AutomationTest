package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CurrencyPage {

    public CurrencyPage (WebDriver driver)
    {
        Hooks.driver=driver;
    }
    public WebElement currencyPOM()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> productCurrencyPOM()
    {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));

    }
}

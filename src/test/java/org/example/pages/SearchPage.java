package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

import java.util.List;

public class SearchPage {

    public SearchPage(WebDriver driver)
    {
        Hooks.driver=driver;
    }

    public WebElement searchFieldPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]"));
    }
    public WebElement searchButtonPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public List<WebElement> searchProductPOM()
    {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }
    public WebElement productLinkPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }
    public WebElement productSkuPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("span[id=\"sku-4\"]"));
    }

}

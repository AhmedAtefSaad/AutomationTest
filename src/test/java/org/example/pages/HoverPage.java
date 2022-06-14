package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoverPage {
    public HoverPage(WebDriver driver)
    {
        Hooks.driver = driver;
    }

    public WebElement computersCategoryPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));

    }
    public WebElement desktopsSubCategoryPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
    }
    public WebElement subCategoryLinkPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }

}
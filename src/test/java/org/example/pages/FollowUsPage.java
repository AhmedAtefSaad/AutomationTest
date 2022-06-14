package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class FollowUsPage {

    public FollowUsPage(WebDriver driver)
    {
        Hooks.driver=driver;
    }
    public WebElement facebookIconPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"networks\"] li[class=\"facebook\"]"));
    }
    public WebElement twitterIconPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"networks\"] li[class=\"twitter\"]"));
    }
    public WebElement rssIconPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"networks\"] li[class=\"rss\"]"));
    }
    public WebElement youtubeIconPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"networks\"] li[class=\"youtube\"]"));
    }



}

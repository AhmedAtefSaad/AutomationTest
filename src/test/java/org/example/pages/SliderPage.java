package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class SliderPage {
    public SliderPage (WebDriver driver)
    {
        Hooks.driver = driver;
    }

    public WebElement firstSliderPOM()
    {
        return   Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]"));
    }
    public WebElement secondSliderPOM()
    {
        return   Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]"));
    }


    public WebElement firstSliderSquarePOM()
    {
        return Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]"));
    }
    public WebElement secondSliderSquarePOM()
    {
        return Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]"));
    }
}


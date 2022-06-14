package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PassRecPage {

    public PassRecPage(WebDriver driver)
    {
        Hooks.driver=driver;
    }
    public WebElement forgetPasswordPOM()
    {
        return Hooks.driver.findElement(By.linkText("Forgot password?"));
    }
    public WebElement emailAddressPOM()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement recoverButtonPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("button[name=\"send-email\"]"));
    }
    public WebElement resetMassagePOM()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }


}
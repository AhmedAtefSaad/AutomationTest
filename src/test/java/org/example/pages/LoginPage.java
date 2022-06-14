package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        Hooks.driver=driver;
    }
    public WebElement loginLink()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement emailLoginPOM()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passwordLoginPOM()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginButtonPOM()
    {

        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement myAccountLink()
    {
        return Hooks.driver.findElement(By.linkText("My account"));
    }

}
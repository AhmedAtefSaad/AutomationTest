package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class RegisterPage {

    public RegisterPage(WebDriver driver)
    {
        Hooks.driver= driver;
    }

    public WebElement registerLinkPOM()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement genderTypePOM()
    {
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement firstNamePOM()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lastNamePOM()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement birthDayPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
    }
    public WebElement birthMonthPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }
    public WebElement birthYearPOM()
    {
        return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }
    public WebElement emailPOM()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement companyPOM()
    {
        return Hooks.driver.findElement(By.id("Company"));
    }
    public WebElement passwordPOM()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPasswordPOM()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerButton()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }

}


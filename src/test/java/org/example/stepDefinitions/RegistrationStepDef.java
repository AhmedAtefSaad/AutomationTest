package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class RegistrationStepDef {
    RegisterPage register ;

    @Given("user goto register page")
    public void user_go_to_register_Page()
    {
        register=new RegisterPage(Hooks.driver);
        register.registerLinkPOM().click();
    }
    @When("user fill personal details field")
    public void user_fill_personal_data()
    {
        register.genderTypePOM().click();
        register.firstNamePOM().sendKeys("Ahmed");
        register.lastNamePOM().sendKeys("Atef");
        Select birthDay = new Select(register.birthDayPOM());
        birthDay.selectByValue("20");
        Select birthMonth = new Select(register.birthMonthPOM());
        birthMonth.selectByValue("1");
        Select birthYear = new Select(register.birthYearPOM());
        birthYear.selectByValue("1995");
        register.emailPOM().sendKeys("ahmedatef@gmail.com");
    }
    @When("user fill company details")
    public void user_add_company_name()
    {

        register.companyPOM().sendKeys("Automate tests Company");
    }
    @When("user fill password field")
    public void user_add_password()
    {
        register.passwordPOM().sendKeys("3459781232");
        register.confirmPasswordPOM().sendKeys("3459781232");
    }
    @When("user click on register BTN")
    public void user_click_on_registerButton() throws InterruptedException
    {
        register.registerButton().click();
        Thread.sleep(4000);
    }
    @Then("user registration successfully")
    public void success_registration()
    {
        SoftAssert soft =new SoftAssert();
        String expectedResult = "Your registration completed";
        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualResult = Hooks.driver.findElement(By.className("result")).getText();
        String actualColor = Hooks.driver.findElement(By.className("result")).getCssValue("color");
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertTrue(actualColor.contains(expectedColor));
        soft.assertAll();
    }

}

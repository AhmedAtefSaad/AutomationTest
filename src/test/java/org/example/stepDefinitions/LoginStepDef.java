package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import org.example.pages.LoginPage;

public class LoginStepDef {
    LoginPage login ;

    @Given("user goto login page")
    public void user_go_to_login_page()
    {
        login = new LoginPage(Hooks.driver);
        login.loginLink().click();
    }
    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void user_enter_email_and_password(String email,String password)
    {
        login.emailLoginPOM().sendKeys(email);
        login.passwordLoginPOM().sendKeys(password);
    }
    @When("user click on login BTN")
    public void user_click_on_loginButton() throws InterruptedException
    {
        login.loginButtonPOM().click();
        Thread.sleep(4000);
    }
    @Then("user login successfully")
    public void success_login()
    {
        SoftAssert soft =new SoftAssert();
        String expectedResult = "https://demo.nopcommerce.com/";
        String actualResult = Hooks.driver.getCurrentUrl();
        soft.assertTrue(actualResult.contains(expectedResult));
        login.myAccountLink().isDisplayed();
        soft.assertAll();
    }

}

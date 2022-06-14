package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.CurrencyPage;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

public class CurrencyStepDef {
    CurrencyPage currency = new CurrencyPage(Hooks.driver);
    @When("user select currency")
    public void user_choose_currency()
    {
        Select select = new Select(currency.currencyPOM());
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }
    @Then("user change currency successfully")
    public void user_change_currency_successfully()
    {
        int price = currency.productCurrencyPOM().size();
        for (int i=0;i<price;i++)
        {
            String expectedResult="€";
            String actualResult=currency.productCurrencyPOM().get(i).getText();
            Assert.assertTrue(actualResult.contains(expectedResult));
        }
    }
}

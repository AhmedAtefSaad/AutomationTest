package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SearchPage;
import org.testng.asserts.SoftAssert;

public class SearchStepDef {
   SearchPage search ;
    SoftAssert soft = new SoftAssert();


    @When("^user write product name \"(.*)\"$")

    public void user_write_product_name_in_search_field(String productName)
    {
        search = new SearchPage(Hooks.driver);
        search.searchFieldPOM().sendKeys(productName);
    }
    @When("^user write product sku \"(.*)\"$")

    public void user_write_product_sku_in_search_field(String productSKU)
    {
        search = new SearchPage(Hooks.driver);
        search.searchFieldPOM().sendKeys(productSKU);
    }

    @When("user click on search BTN")
    public void user_click_on_search_button() throws InterruptedException {
        search.searchButtonPOM().click();
        Thread.sleep(4000);
    }
    @When("user select product")
    public void user_click_on_product_link() throws InterruptedException
    {
        search.productLinkPOM().click();
        Thread.sleep(4000);
    }

    @Then("^the search completed successfully and get \"(.*)\"$")
    public void success_search_by_product_name(String searchResult)
    {
        String expectedUrl = "https://demo.nopcommerce.com/search?q=";
        String actualUrl =  Hooks.driver.getCurrentUrl();
        soft.assertTrue(actualUrl.contains(expectedUrl));
        int searchCount = search.searchProductPOM().size();
        for (int i = 0 ; i < searchCount ;i++)
        {
            String actualResult = search.searchProductPOM().get(i).getText();
            soft.assertTrue(actualResult.contains(searchResult));
        }

        soft.assertAll();
    }
    @Then("^the search completed successfully and get sku \"(.*)\"$")
    public void success_search_by_product_sku(String searchResult)
    {
        String actualResult = search.productSkuPOM().getText();
        soft.assertEquals(actualResult.contains(searchResult),true);
        soft.assertAll();
    }

}

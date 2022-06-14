package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HoverPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HoverStepDef {
    String subCategoryName;
    HoverPage hover;

    @When("user Hover Cat and select subCat")
    public void user_Hover_Cat_and_select_subCat() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        hover = new HoverPage(Hooks.driver);
        action.moveToElement(hover.computersCategoryPOM()).perform();
        Thread.sleep(10000);
        subCategoryName = hover.desktopsSubCategoryPOM().getText().toLowerCase().trim();
        hover.desktopsSubCategoryPOM().click();
    }

    @Then("user could hover successfully")
    public void successful_Hover()
    {
        Assert.assertEquals(subCategoryName,hover.subCategoryLinkPOM().getText().toLowerCase().trim());
    }

}
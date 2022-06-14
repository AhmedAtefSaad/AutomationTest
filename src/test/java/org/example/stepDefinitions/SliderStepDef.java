package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SliderPage;
import org.testng.Assert;

public class SliderStepDef {
    SliderPage slider = new SliderPage(Hooks.driver) ;

    @When("click on the first slider")

    public void Click_ON_First_Slider() throws InterruptedException
    {
        slider.firstSliderSquarePOM().click();
        slider.firstSliderPOM().click();
        Thread.sleep(4000);
    }
    @When("click on the second slider")

    public void Click_ON_Second_Slider() throws InterruptedException
    {
        slider.secondSliderSquarePOM().click();
        slider.secondSliderPOM().click();
        Thread.sleep(4000);
    }
    @Then("product of first slider is displayed")

    public void first_product_details_opened()
    {
        String expectedResult= "https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualResult= Hooks.driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Then("product of second slider is displayed")

    public void second_product_details_opened()
    {
        String expectedResult= "https://demo.nopcommerce.com/iphone-6";
        String actualResult= Hooks.driver.getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}

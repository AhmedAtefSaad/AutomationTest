package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;

    @Before
    public void openBrowser () throws InterruptedException
    {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
    }
    @After

    public void closeBrowser()
    {
        driver.quit();
    }

}

package com.ZeroBank.tests;




import com.ZeroBank.tests.utilities.ConfigurationReader;
import com.ZeroBank.tests.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        driver= Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions=new Actions(driver);
        wait=new WebDriverWait(driver,10);
        driver.get(ConfigurationReader.get("url"));
    }

    @AfterMethod
    public void tearsDown() throws InterruptedException {

        Thread.sleep(10000);
        Driver.closeDriver();
    }
}

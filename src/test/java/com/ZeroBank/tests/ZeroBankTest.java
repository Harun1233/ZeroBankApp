package com.ZeroBank.tests;

import com.ZeroBank.pages.HomePage;
import com.ZeroBank.pages.SignInPage;
import com.ZeroBank.tests.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZeroBankTest extends TestBase{
    SignInPage sigIn=new SignInPage();
    HomePage homePage=new HomePage();

    @Test
    public void negativeTestForLogIn(){
        homePage.signIn();
        String actualWarningMessage = sigIn.fillAndSignNegative();
        String expectedWarningMessage= ConfigurationReader.get("expectedWarningMessage");

        Assert.assertEquals(actualWarningMessage,expectedWarningMessage,"Verify that the warning messages match");

    }

    @Test
    public void positiveTest(){
        homePage.signIn();
        sigIn.fillAndSignPositive();
    }
}

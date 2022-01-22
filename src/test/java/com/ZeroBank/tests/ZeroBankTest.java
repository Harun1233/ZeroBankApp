package com.ZeroBank.tests;

import com.ZeroBank.pages.SignInPage;
import com.ZeroBank.tests.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZeroBankTest extends TestBase{
    SignInPage sigIn=new SignInPage();

    @Test
    public void negativeTestForLogIn(){
        String actualWarningMessage = sigIn.fillAndSignNegative();
        String expectedWarningMessage= ConfigurationReader.get("expectedWarningMessage");

        Assert.assertEquals(actualWarningMessage,expectedWarningMessage,"Verify that the warning messages match");

    }
}

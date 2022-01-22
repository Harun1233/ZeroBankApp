package com.ZeroBank.pages;

import com.ZeroBank.tests.utilities.BrowserUtils;
import com.ZeroBank.tests.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInPage extends BasePage{



    @FindBy(css = "#user_login")
    public WebElement userNameInput;
    @FindBy(css = "#user_password")
    public WebElement passwordInput;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signInButton;
    @FindBy(xpath = "//*[@class='alert alert-error']")
    public WebElement warningMessage;



    public void fillAndSignPositive(){

        userNameInput.sendKeys(ConfigurationReader.get("username"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        signInButton.click();


    }

    public void fillAndSignNegative(){

        userNameInput.sendKeys(ConfigurationReader.get("username"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        signInButton.click();


    }




    @Override
    public String getElementText() {
        BrowserUtils.waitForVisibility(warningMessage,10);
        return warningMessage.getText();

    }
}

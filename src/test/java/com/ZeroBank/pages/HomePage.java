package com.ZeroBank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "#signin_button")
    public WebElement signInButton;


    public void signIn(){
        signInButton.click();
    }


    @Override
    public String getElementText() {
        return null;
    }
}

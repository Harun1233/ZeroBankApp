package com.ZeroBank.pages;

import com.ZeroBank.tests.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(),this);

    }

    public abstract String getElementText();

}

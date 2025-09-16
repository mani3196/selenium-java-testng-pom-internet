// Sample content for DynamicControlsPage.java

package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {

    private WebDriver driver;

    @FindBy(id = "enable-button")
    private WebElement enableButton;

    @FindBy(id = "disable-button")
    private WebElement disableButton;

    @FindBy(id = "text-input")
    private WebElement textInput;

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enableTextInput() {
        enableButton.click();
    }

    public void disableTextInput() {
        disableButton.click();
    }

    public String getTextInputValue() {
        return textInput.getAttribute("value");
    }
}
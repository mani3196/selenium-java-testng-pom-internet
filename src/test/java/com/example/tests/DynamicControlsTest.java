package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicControlsTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }

    @Test
    public void testEnableInputField() {
        WebElement inputField = driver.findElement(By.cssSelector("#input-example > input[type='text']"));
        WebElement enableButton = driver.findElement(By.cssSelector("#input-example > button[onclick='enable()']"));

        // Click to enable the input field
        enableButton.click();

        // Verify that the input field is enabled
        Assert.assertTrue(inputField.isEnabled(), "Input field should be enabled.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        System.out.println("=== LoginPage constructor: Initializing with driver: " + (driver != null) + " ===");
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "account-menu-account-button")
    private WebElement signInButton;

    public void vDemo() {
        System.out.println("=== Clicking sign in button ===");
        signInButton.click();
    }
}
package com.example.pages;

import com.example.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.example.WebElements.LoginElements.loginWebElement;

public class LoginPage  {

    private WebDriver driver;

    @FindBy(id = loginWebElement)
    private WebElement usernameInput;

    @FindBy(id = loginWebElement)
    private WebElement passwordInput;

    @FindBy(id = loginWebElement)
    private WebElement loginButton;

    @FindBy(linkText = loginWebElement)
    private WebElement signInLink;

    public LoginPage(WebDriver driver) {
        System.out.println(">>> LoginPage constructor driver: " + driver);
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void clickSignInLink() {
        signInLink.click();
    }

    public void enterUsername(String username) {
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}

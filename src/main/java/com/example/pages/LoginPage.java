package com.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.example.WebElements.LoginElements.*;

public class LoginPage  {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = signInLinkWebElement)
    private WebElement signInLink;

    @FindBy(xpath = createAccLinkWebElement)
    private WebElement createAccLink;

    @FindBy(id = firstNameWebElement)
    private WebElement firstNameInput;

    @FindBy(id = lastNameWebElement)
    private WebElement lastNameInput;

    @FindBy(id = emailWebElement)
    private WebElement emailInput;

    @FindBy(id = passWordWebElement)
    private WebElement passWordInput;

    @FindBy(id = reenterPasswordWebElement)
    private WebElement reenterPasswordInput;

    @FindBy(id = phoneWebElement)
    private WebElement phoneInput;

    @FindBy(xpath = createAccBtnWebElement)
    private WebElement createAccBtn;



    public LoginPage(WebDriver driver) {
        System.out.println(">>> LoginPage constructor driver: " + driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }
    public void clickCreateAccountLink() throws InterruptedException {
//
        wait.until(ExpectedConditions.elementToBeClickable(createAccLink)).click();

//        Actions actions = new Actions(DriverManager.getDriver());
//
//        // Move to element slowly and click
//        actions.moveToElement(createAccLink)
////                .pause(Duration.ofMillis(5000))  // Wait for menu to expand
////                .click()
//                .pause(Duration.ofMillis(10000))  // Wait after click
//                .perform();

//
//        Thread.sleep(10000);



//        createAccLink.click();
    }
    public void enterFirstName(){
        wait.until(ExpectedConditions.elementToBeClickable(firstNameInput)).sendKeys("Adam");
//        wait.until(ExpectedConditions.visibilityOf(firstNameInput)).sendKeys("Adam");
//        firstNameInput.sendKeys("Adam");
    }
    public void enterLastName(){
        lastNameInput.sendKeys("sean");
    }
    public void enterEmail(){
        emailInput.sendKeys("adamsean@maildrop.cc");
    }
    public void enterPassword() {
        passWordInput.sendKeys("test001VF");
    }
    public void renterPassword() {
        reenterPasswordInput.sendKeys("test001VF");
    }
    public void enterPhone() {
        phoneInput.sendKeys("9707101062");
    }
    public void clickCreateAccount(){
        createAccBtn.click();
    }

    // Actions
    public void clickSignInLink() {
        wait.until(ExpectedConditions.visibilityOf(signInLink)).click();
//        signInLink.click();
    }

    public void enterUsername(String username) {
//        usernameInput.clear();
//        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
//        passwordInput.clear();
//        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
//        loginButton.click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}

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
    @FindBy(xpath = signInBtnWebElement)
    private WebElement signInBtn;

    @FindBy(xpath = createAccLinkWebElement)
    private WebElement createAccLink;

    @FindBy(id = firstNameWebElement)
    private WebElement firstNameInput;

    @FindBy(id = lastNameWebElement)
    private WebElement lastNameInput;

    @FindBy(id = emailWebElement)
    private WebElement emailInput;
    @FindBy(id = userEmailInputWebElement)
    private WebElement userEmailInput;
    @FindBy(xpath = continueBtnWebElement)
    private WebElement continueBtn;

    @FindBy(id = passWordWebElement)
    private WebElement passWordInput;
    @FindBy(id = passWordRadioWebElement)
    private WebElement passWordRadio;

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



    }
    public void enterFirstName(){
        wait.until(ExpectedConditions.elementToBeClickable(firstNameInput)).sendKeys("Adam");
    }
    public void enterLastName(){
        lastNameInput.sendKeys("sean");
    }
    public void enterEmail(){
        emailInput.sendKeys("adam.sean@mail.com");
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
    }
    public void clickSignInBtn() {
        wait.until(ExpectedConditions.visibilityOf(signInBtn)).click();
    }

    public void enterUserEmail(String userEmail) {
        wait.until(ExpectedConditions.elementToBeClickable(userEmailInput)).clear();
        userEmailInput.sendKeys(userEmail);
    }

    public void enterUserPassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passWordRadio)).click();
        passWordInput.sendKeys(password);
    }

    public void clickContinueButton() {
        continueBtn.click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}

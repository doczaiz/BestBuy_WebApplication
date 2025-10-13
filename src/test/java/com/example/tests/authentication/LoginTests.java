package com.example.tests.authentication;

import com.example.base.BaseTest;
import com.example.base.DriverManager;
import com.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTests extends BaseTest {

    LoginPage loginPage;

//    @Test(groups = "regression")
    public void testValidUserLogin() {
        loginPage = new LoginPage(DriverManager.getDriver());


        loginPage.clickSignInLink();
//        loginPage.enterUsername("testuser");
//        loginPage.enterPassword("password123");
//        loginPage.clickLoginButton();

//        String title = loginPage.getPageTitle();
//        Assert.assertEquals(title, "Dashboard", "Login failed or wrong page title");
    }

    @Test(groups = "regression",description = "TC_UA_012: Validate create an account with valid Data")
    public void testCreateAccountValidData() throws InterruptedException {
         loginPage = new LoginPage(DriverManager.getDriver());
        loginPage.clickSignInLink();
        loginPage.clickCreateAccountLink();
        Assert.assertEquals(DriverManager.getDriver().getTitle(),"Best Buy: Create an Account");
        loginPage.enterFirstName();
        loginPage.enterLastName();
        loginPage.enterEmail();
        loginPage.enterPassword();
        loginPage.renterPassword();
        loginPage.enterPhone();
        loginPage.clickCreateAccount();
//        Thread.sleep(20000);
    }
}

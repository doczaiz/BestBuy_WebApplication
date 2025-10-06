package com.example.tests.authentication;

import com.example.base.BaseTest;
import com.example.base.DriverManager;
import com.example.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTests extends BaseTest {


    @Test(groups = "regression")
    public void testValidUserLogin() {

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        loginPage.clickSignInLink();
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password123");
        loginPage.clickLoginButton();

//        String title = loginPage.getPageTitle();
//        Assert.assertEquals(title, "Dashboard", "Login failed or wrong page title");
    }

    @Test(groups = "sanity")
    public void testCommonLogin() {
        System.out.println("Sanity test executed");
    }
}

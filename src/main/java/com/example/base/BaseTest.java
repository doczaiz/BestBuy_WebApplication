package com.example.base;

import com.example.config.ConfigReader;
import com.example.util_Report.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.time.Duration;
@Listeners(com.example.util_Report.TestListener.class)

public class BaseTest {
    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(String browser) {
        DriverManager.initDriver(browser);
        DriverManager.getDriver().get(ConfigReader.getProperty("app.url"));
//        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        ExtentManager.getInstance(); // initialize report
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverManager.quitDriver();
    }


}

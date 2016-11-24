package com.qatestlab.twit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }


    @BeforeClass
    public void setUp() {

        if (System.getProperty("webbrowser").equals("chrome")) {
            String driverPath = System.getProperty("driver.exe.path");
            System.out.println(driverPath);
            if (driverPath == null) {
                throw new SkipException("Path for chromedrive is not specified");
            }
            System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();
        } else {
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().maximize();

    }

//    @AfterClass
//    public void closeBrowser() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}

package com.qatestlab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.qatestlab.utils.ReporterCustom.log;

public class LoginPage {

    private WebDriver driver;
    private static final String BASE_URL = "https://twitter.com";

    @FindBy(css = "#gb_70")
    private WebElement loginField;

    @FindBy(css = "#gb_70")
    private WebElement passwordField;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get(BASE_URL);
        PageFactory.initElements(driver, this);
    }


    public void setUserName(String username){
        loginField.sendKeys(username);
        log("Set username "+username);
    }

    public void setPassword(String password){
        passwordField.sendKeys(password);
        log("Set password "+password);
    }


}

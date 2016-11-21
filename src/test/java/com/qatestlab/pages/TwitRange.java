package com.qatestlab.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qatestlab.utils.ReporterCustom.log;

public class TwitRange {

    private WebDriver driver;


    @FindBy(xpath = "//div/input[@id='signin-email']")
    private WebElement loginField;

    public TwitRange(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToPage(String pageLink){
        driver.get("https://twitter.com/f1");
        log("open page "+pageLink);
    }

    public void findTwitsOfRange(int range){

        for(int i=1; i < 10; i++) {
            WebElement element = driver.findElement(By.xpath("//div[@class='stream']/descendant::div[@class='content']["
                    + i + "]//small[@class='time']/a/span[contains(@class,'_timestamp')]"));

            if (element.isDisplayed()){
                String timeOfElement = element.getAttribute("data-time-ms");
            }
        }
    }

    public void doTwitsOfRange(){

    }
}

package com.qatestlab.twit;


import com.qatestlab.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest{

    private LoginPage loginPage;


    @BeforeClass
    private void initPage() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLoginPageAppearCorrect() {

        loginPage.setUserName("testoviyacc");
        loginPage.setPassword("zaqxswcde12345678");

    }

}

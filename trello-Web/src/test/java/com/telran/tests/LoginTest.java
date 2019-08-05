package com.telran.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @BeforeMethod

    public void preconditions(){
        app.logout();
    }

    @Test
    public void loginTest() throws InterruptedException {

        String currentUrl = app.driver.getCurrentUrl();

        Assert.assertEquals(currentUrl,"https://trello.com/logged-out");

        app.clickOnLoginButton();
        app.fillUserForm("alekssssandra@i.ua", "qweqwe1234");
        app.confirmLoginButton();
        app.Pause(4000);


        Assert.assertTrue(app.isUserLoggedIn());


    }

}

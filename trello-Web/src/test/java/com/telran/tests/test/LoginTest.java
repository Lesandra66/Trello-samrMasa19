package com.telran.tests.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @BeforeMethod

    public void preconditions(){
        app.getSession().logout();
    }

    @Test
    public void loginTest() throws InterruptedException {

        String currentUrl = app.driver.getCurrentUrl();

        Assert.assertEquals(currentUrl,"https://trello.com/logged-out");

        app.getSession().clickOnLoginButton();
        app.getSession().fillUserForm("alekssssandra@i.ua", "qweqwe1234");
        app.getSession().confirmLoginButton();
        app.getSession().Pause(4000);


        Assert.assertTrue(app.getSession().isUserLoggedIn());


    }

}

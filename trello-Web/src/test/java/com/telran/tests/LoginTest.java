package com.telran.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase{

    @BeforeMethod

    public void preconditions(){
        logout();
    }

    @Test
    public void loginTest() throws InterruptedException {

        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(currentUrl,"https://trello.com/logged-out");

        clickOnLoginButton();
        fillUserForm("alekssssandra@i.ua", "qweqwe1234");
        confirmLoginButton();
        Pause(4000);


        Assert.assertTrue(isUserLoggedIn());


    }

}

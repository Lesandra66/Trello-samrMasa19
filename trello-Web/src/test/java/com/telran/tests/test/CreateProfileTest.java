package com.telran.tests.test;

import com.telran.tests.fw.HeaderPage;
import com.telran.tests.fw.HelperBase;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class CreateProfileTest extends TestBase {
    @BeforeMethod
    public void preconditioins() throws IOException {
        app.getSet().takeScreenshot();
    }


    @Test
    public void creationAvatar() throws InterruptedException, IOException {
        app.getSet().clickOnButtonProfileOnHeader();
        app.getSet().clickOnButtonProfileVisibility();
        app.getSet().clickOnButtonChange();
        app.getSet().attachPhoto(new File("src/test/resources/#kotart01.jpg"));
        //app.getSession().Pause(4000);
        app.getHeader().clickOnHomeButtonOnHeader();


    }
    @AfterMethod
    public void postactions() throws IOException {
        app.getSet().takeScreenshot();
    }




}

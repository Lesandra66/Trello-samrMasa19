package com.telran.tests.test;

import com.telran.tests.fw.HeaderPage;
import com.telran.tests.fw.HelperBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

public class CreateProfileTest extends TestBase {


    @Test
    public void creationAvatar() throws InterruptedException {
        app.getSet().clickOnButtonProfileOnHeader();
        app.getSet().clickOnButtonProfileVisibility();
        app.getSet().clickOnButtonChange();
        app.getSet().attachPhoto(new File("src/test/resources/#kotart01.jpg"));
        app.getSession().Pause(4000);
        app.getHeader().clickOnHomeButtonOnHeader();

    }



}

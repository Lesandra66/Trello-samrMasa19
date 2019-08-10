package com.telran.tests.test;

import com.telran.tests.fw.HeaderPage;
import com.telran.tests.fw.HelperBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAvatar extends TestBase {


    @Test
    public void creationAvatar() throws InterruptedException {
        app.getSet().clickOnButtonProfileOnHeader();
        app.getSet().clickOnButtonProfileVisibility();
        app.getSession().Pause(4000);
        app.getSet().clickOnButtonChange();

    }



}

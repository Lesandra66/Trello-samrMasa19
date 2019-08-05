package com.telran.tests;

import org.testng.annotations.Test;

public class CreateCommand extends TestBase {
    @Test
    public void boardCreationTest() throws InterruptedException {

        app.createCommand();
        app.fillName("Tel-Ran");
        app.fillDescription("Testing is cool");
        app.clickOnButtonCreate();
        app.clickOnHomeButtonOnHeader();


    }


}

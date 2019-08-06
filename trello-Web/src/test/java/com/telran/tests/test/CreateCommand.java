package com.telran.tests.test;

import org.testng.annotations.Test;

public class CreateCommand extends TestBase {
    @Test
    public void boardCreationTest() throws InterruptedException {

        app.getTeam().createCommand();
        app.getTeam().fillName("Tel-Ran");
        app.getTeam().fillDescription("Testing is cool");
        app.getTeam().clickOnButtonCreate();
        app.getHeader().clickOnHomeButtonOnHeader();


    }


}

package com.telran.tests;

import com.telran.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateCommand extends TestBase {
    @Test
    public void boardCreationTest() throws InterruptedException {

        createCommand();
        fillName("Tel-Ran");
        fillDescription("Testing is cool");
        clickOnButtonCreate();
        clickOnHomeButtonOnHeader();


    }


}

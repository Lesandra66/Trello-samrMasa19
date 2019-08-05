package com.telran.tests;

import org.openqa.selenium.By;

public class HeaderPage {
    public void clickOnHomeButtonOnHeader() throws InterruptedException {
        Pause(5000);
        click(By.cssSelector("[name=house]"));
        //Pause(10000);
        click(By.cssSelector("a [name=house]"));
        Pause(10000);
    }

    public void clickOnPlusButtonOnHeader() {

        click(By.cssSelector("[name=add]"));
    }

    protected void clickOnMainPageHeader() {
        click(By.cssSelector("[data-test-id='home-link']"));
    }
}

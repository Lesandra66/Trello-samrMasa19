package com.telran.tests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class SettingsHelper extends HelperBase {
    public SettingsHelper(WebDriver driver) {
        super(driver);
    }
    public void clickOnButtonChange()
    {
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("[class='_2e97X7K2YRLv4Q']"))).pause(5).click().perform();
    }

    public void attachPhoto(File file) throws InterruptedException {
        Pause(15000);
        attach(By.xpath("//*[@name='file']"),file);

    }

//    public void clickOnButtonChange() {
//        click(By.xpath("[.rsiNque2CCqtPE]"));
//    }

    public void clickOnButtonProfileVisibility() {
        click(By.xpath("//span[contains(text(),'Profile and Visibility')]"));
    }
    public void clickOnButtonProfileOnHeader() {

        click(By.cssSelector("[data-test-id='header-member-menu-button']"));
    }


}

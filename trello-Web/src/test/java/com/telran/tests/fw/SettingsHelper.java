package com.telran.tests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsHelper extends HelperBase {
    public SettingsHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnButtonChange() {
        click(By.xpath("button[@class='_2e97X7K2YRLv4Q']"));
    }

    public void clickOnButtonProfileVisibility() {
        click(By.xpath("//span[contains(text(),'Profile and Visibility')]"));
    }
    public void clickOnButtonProfileOnHeader() {
        click(By.xpath("//span[@class='_24AWINHReYjNBf']"));
    }



////button[@class='_2e97X7K2YRLv4Q']
}

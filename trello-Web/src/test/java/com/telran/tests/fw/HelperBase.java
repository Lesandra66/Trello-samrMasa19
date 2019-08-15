package com.telran.tests.fw;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;


public class HelperBase {
    WebDriver driver;
    Logger logger = LoggerFactory.getLogger(HelperBase.class);

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public boolean isElementsPresents(By locator) {

        return driver.findElements(locator).size()>0;
    }

    public void Pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
    public void attach(By locator, File file) {

        driver.findElement(locator).sendKeys(file.getAbsolutePath());
    }

    public void takeScreenshot() throws IOException {
        File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshot = new File("src/test/screenshots/screenshot-"
                + System.currentTimeMillis()+ ".png");
        Files.copy(tmp,screenshot);
        System.out.println("------------------------------");
        logger.info("Screenshot name: " + screenshot.getName());
    }


}

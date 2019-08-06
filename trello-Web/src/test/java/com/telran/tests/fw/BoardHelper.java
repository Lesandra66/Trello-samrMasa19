package com.telran.tests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends HelperBase{
    public BoardHelper(WebDriver driver) {
        super(driver);
    }

    public void confirmBoardCreation() {
        click(By.cssSelector("[data-test-id='header-create-board-submit-button']"));

    }

    public void fillBoardCreationForm(String boardName) {
        type(By.cssSelector("[data-test-id='header-create-board-title-input']"),boardName);
        click(By.cssSelector("button.W6rMLOx8U0MrPx [name=down]"));
        //select without team
        click(By.xpath("//nav[@class='SdlcRrTVPA8Y3K']//li[1]"));

    }

    public void selectCreateBoardFromDropDown() {

        click(By.xpath("//*[@data-test-id='header-create-board-button']"));
    }

    public int getBoardsCount() {
        return driver.findElements(By.xpath("//*[@class='icon-lg icon-member']/../../..//li")).size()-2;
    }
}
package com.telran.tests.test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Pause;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDeleteTest extends TestBase {
    @BeforeMethod
    public void preconditions() throws InterruptedException {
        if(!app.getBoard().isBoardPresent())
        {
            app.getBoard().createBoard();
        }
    }

    @Test
    public void boardDeleteFromMenu() throws InterruptedException {

        int before = app.getBoard().getBoardsCount();

        System.out.println(before + ":");

        app.getBoard().clickOnFirstBoard();
        app.getBoard().openInBoardMenuMore();
        app.getBoard().Pause(1000);
        app.getBoard().closeBoard();
        app.getBoard().confirmClosingBoard();
        app.getBoard().deleteBoardForever();
        app.getBoard().confirmDeletionBoard();
        app.getHeader().clickOnHomeButtonOnHeader();

        int after = app.getBoard().getBoardsCount();
        System.out.println(after);



        Assert.assertEquals(after,before - 1);







    }




}

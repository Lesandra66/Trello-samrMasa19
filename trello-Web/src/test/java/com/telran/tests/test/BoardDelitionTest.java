package com.telran.tests.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDelitionTest extends TestBase {
    @BeforeMethod
    public void preconditions() throws InterruptedException {
        if(!app.getTeam().isTeamPresent())
        {
            app.getTeam().createTeam();
        }
    }

    @Test
    public void boardDelitionFromMenu() throws InterruptedException {

        int before = app.getBoard().getBoardsCount();

        System.out.println(before + ":");

        app.getBoard().clickOnFirstBoard();
        app.getBoard().openInBoardMenuMore();
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

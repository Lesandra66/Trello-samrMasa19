package com.telran.tests.test;

import com.telran.tests.model.Board;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CreateBoardTest extends TestBase {
    @Test
    public void boardCreationTestFromHeader() throws InterruptedException {

        int beforeCreation = app.getBoard().getBoardsCount();

        app.getHeader().clickOnPlusButtonOnHeader();
        app.getBoard().selectCreateBoardFromDropDown();
        app.getBoard().fillBoardCreationForm(new Board().setBoardName("Masa" + System.currentTimeMillis()));
        app.getBoard().confirmBoardCreation();
        app.getHeader().clickOnHomeButtonOnHeader();

        //app.getSession().Pause(10000);

        int afterCreation = app.getBoard().getBoardsCount();

        System.out.println(beforeCreation + ":" + afterCreation);

       Assert.assertEquals(afterCreation,beforeCreation + 1);



    }
    @AfterClass
    public void postAction() throws InterruptedException {
        app.getBoard().cleanBoards();
    }



}

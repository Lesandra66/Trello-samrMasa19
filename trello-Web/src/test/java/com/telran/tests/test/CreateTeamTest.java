package com.telran.tests.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CreateTeamTest extends TestBase {
    @Test
    public void teamCreationTest() throws InterruptedException {

        int beforeCreation = app.getTeam().getTeamsCount();

        app.getTeam().clickPlusButtonCreateTeam();
        app.getTeam().fillName("Tel-Ran");
        app.getTeam().fillDescription("Testing is cool");
        app.getTeam().clickOnButtonCreate();
        app.getHeader().clickOnHomeButtonOnHeader();

        int afterCreation = app.getTeam().getTeamsCount();

        System.out.println(beforeCreation + ":" + afterCreation);

        Assert.assertEquals(afterCreation,beforeCreation + 1);


    }
    @AfterClass
    public void postAction() throws InterruptedException {
        app.getTeam().cleanTeams();
    }


}

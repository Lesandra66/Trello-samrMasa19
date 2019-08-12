package com.telran.tests.test;

import com.telran.tests.model.Team;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateTeamTest extends TestBase {

//
//    @Test(dataProvider = "teams",dataProviderClass = DataProviders.class)
//    public void teamCreationFromheaderWithDataProviderTest(Team team) throws InterruptedException {
//
//        int beforeCreation = app.getTeam().getTeamsCount();
//
//        app.getTeam().clickPlusButtonCreateTeam();
//        app.getTeam().fillFormNameDescription(team);
//        app.getTeam().clickOnButtonCreate();
//        app.getHeader().clickOnHomeButtonOnHeader();
//
//        int afterCreation = app.getTeam().getTeamsCount();
//
//        System.out.println(beforeCreation + ":" + afterCreation);
//
//        Assert.assertEquals(afterCreation,beforeCreation + 1);
//
//
//    }
    @Test
    public void teamCreationTest() throws InterruptedException {

        int beforeCreation = app.getTeam().getTeamsCount();

        app.getTeam().clickPlusButtonCreateTeam();
        app.getTeam().fillFormNameDescription(new Team().setCommandName("Tel-Ran").setCommandDescription("Testing is cool"));
        app.getTeam().clickOnButtonCreate();
        app.getHeader().clickOnHomeButtonOnHeader();

        int afterCreation = app.getTeam().getTeamsCount();

        System.out.println(beforeCreation + ":" + afterCreation);

        Assert.assertEquals(afterCreation,beforeCreation + 1);


    }
    @AfterClass(alwaysRun = true)
    public void postAction() throws InterruptedException {
        app.getTeam().cleanTeams();
    }


}

package com.telran.tests;

import org.testng.annotations.Test;

public class TeamDeletionTest extends TestBase{


  @Test
  public void testTeamDeletion() throws InterruptedException {
    app.getSession().Pause(15000);
    int before = app.getTeam().getTeamsCount();
    System.out.println(before + ":");

    app.getTeam().clickOnFirstTeam();
    app.getTeam().clickOnTeamSettings();
    app.getTeam().clickDeleteTeamLink();
    app.getTeam().confirmTeamDeletionButton();



    int after = app.getTeam().getTeamsCount();
    System.out.println(after);

    //System.out.println(before + ":" + after);

    //Assert.assertEquals(after,before + 1);


  }





}

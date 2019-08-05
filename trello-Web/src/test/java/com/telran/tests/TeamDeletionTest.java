package com.telran.tests;

import org.testng.annotations.Test;

public class TeamDeletionTest extends TestBase{


  @Test
  public void testTeamDeletion() throws InterruptedException {
    app.Pause(15000);
    int before = app.getTeamsCount();
    System.out.println(before + ":");

    app.clickOnFirstTeam();
    app.clickOnTeamSettings();
    app.clickDeleteTeamLink();
    app.confirmTeamDeletionButton();



    int after = app.getTeamsCount();
    System.out.println(after);

    //System.out.println(before + ":" + after);

    //Assert.assertEquals(after,before + 1);


  }





}

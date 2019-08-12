package com.telran.tests.test;

import org.openqa.selenium.interactions.Pause;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamDeletionTest extends TestBase{
  @BeforeMethod
  public void preconditions() throws InterruptedException {
    if(!app.getTeam().isTeamPresent())
    {
      app.getTeam().createTeam();
    }
  }

  @Test
  public void testTeamDeletion() throws InterruptedException {

    app.getSession().Pause(15000);
    int before = app.getTeam().getTeamsCount();
    System.out.println(before + ":");

    app.getTeam().clickOnFirstTeam();
    app.getTeam().clickOnTeamSettings();
    app.getTeam().Pause(15000);
    app.getTeam().clickDeleteTeamLink();
    app.getTeam().confirmTeamDeletionButton();



    int after = app.getTeam().getTeamsCount();
    System.out.println(after);


    Assert.assertEquals(after,before - 1);


  }





}

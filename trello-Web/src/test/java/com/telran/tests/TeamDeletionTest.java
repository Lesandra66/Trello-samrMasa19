package com.telran.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamDeletionTest extends TestBase{


  @Test
  public void testTeamDeletion() throws InterruptedException {
    Pause(15000);
    int before = getTeamsCount();
    System.out.println(before + ":");

    clickOnFirstTeam();
    clickOnTeamSettings();
    clickDeleteTeamLink();
    confirmTeamDeletionButton();
    //Pause(4000);


    int after = getTeamsCount();
    System.out.println(after);

    //System.out.println(before + ":" + after);

    //Assert.assertEquals(after,before + 1);


  }





}

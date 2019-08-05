package com.telran.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TeamHelper extends HelperBase {
    protected void fillDescription(String commandDescription) {
        type(By.cssSelector("[name=desc]"),commandDescription);
    }

    public void clickOnButtonCreate() {
        click(By.xpath("//input[@class='primary wide js-save']"));


    }

    public void fillName(String commandName) {
        type(By.cssSelector("[name=displayName]"),commandName);
    }

    public void createCommand() {
        click(By.cssSelector("[data-test-id='home-navigation-create-team-button']"));

    }

    public void confirmTeamDeletionButton() {
        //new WebDriverWait(driver,15).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".js-confirm")));
      click(By.cssSelector(".js-confirm"));
    }

    public void clickDeleteTeamLink() {
      click(By.cssSelector(".quiet-button"));
    }

    public void clickOnFirstTeam() {
      click(By.cssSelector("[data-test-id='home-team-tab-name']"));
    }

    public void clickOnTeamSettings() {
      click(By.cssSelector(".icon-gear"));
    }

    public int getTeamsCount() {
        WebElement teamsList = driver.findElement(By.cssSelector("nav.home-left-sidebar-container .js-react-root"));
        return teamsList.findElements(By.xpath(".//li")).size();
    }
}

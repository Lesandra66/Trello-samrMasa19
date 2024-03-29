package com.telran.tests.fw;

import com.telran.tests.model.Team;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeamHelper extends HelperBase {

    HeaderPage header =new HeaderPage(driver);

    public TeamHelper(WebDriver driver) {
        super(driver);
    }


    public void clickOnButtonCreate() {
        click(By.xpath("//input[@class='primary wide js-save']"));


    }

    public void fillFormNameDescription(Team team) {
        type(By.cssSelector("[name=displayName]"), team.getCommandName());
        type(By.cssSelector("[name=desc]"), team.getCommandDescription());
    }

    public void clickPlusButtonCreateTeam() {
        click(By.cssSelector("[data-test-id='home-navigation-create-team-button']"));

    }

    public void confirmTeamDeletionButton() {

      click(By.xpath("//input[@class='js-confirm full negate']"));
    }

    public void clickDeleteTeamLink() {

        click(By.xpath("//a[@class='quiet-button']"));
    }

    public void clickOnFirstTeam() {

        click(By.cssSelector("[data-test-id='home-team-tab-name']"));
    }

    public void clickOnTeamSettings() {
      click(By.xpath("//span[contains(text(),'Settings')]"));
    }

    public int getTeamsCount() throws InterruptedException {
        Pause(15000);
        WebElement teamsList = driver.findElement(By.cssSelector("nav.home-left-sidebar-container .js-react-root"));
        return teamsList.findElements(By.xpath(".//li")).size();
    }

    public boolean isTeamPresent() {
        return isElementPresent(By.cssSelector(".home-left-sidebar-container .js-react-root li"));
    }

    public void createTeam() throws InterruptedException {
        clickPlusButtonCreateTeam();
        fillFormNameDescription(new Team().setCommandName("Tel-Ran").setCommandDescription("Testing is cool"));
        clickOnButtonCreate();
        header.clickOnHomeButtonOnHeader();
    }

    public void cleanTeams() throws InterruptedException {
        int count = getTeamsCount();
        Pause(1000);
        while ((count > 2)) {
            clickOnFirstTeam();
            clickOnTeamSettings();
            Pause(10000);
            clickDeleteTeamLink();
            confirmTeamDeletionButton();
            count = getTeamsCount();
            Pause(1000);

        }
    }



}

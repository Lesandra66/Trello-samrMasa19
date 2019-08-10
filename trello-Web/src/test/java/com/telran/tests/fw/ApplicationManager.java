package com.telran.tests.fw;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;


import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    SessionHelper session ;
    WebDriver driver;
    BoardHelper board;
    TeamHelper team;
    HeaderPage header;
    SettingsHelper set;

    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public void init() throws InterruptedException {
        try {

            if (browser.equals(BrowserType.CHROME)) {
                driver = new ChromeDriver();
            } else if (browser.equals(BrowserType.FIREFOX)) {
                driver = new FirefoxDriver();
            } else if (browser.equals(BrowserType.EDGE)) {
                driver = new EdgeDriver();
            }
        }catch(Exception e){
            System.out.println("Unknow browser format");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.navigate().to("https://trello.com");
        session =  new SessionHelper(driver);
        board = new BoardHelper(driver);
        team = new TeamHelper(driver);
        header = new HeaderPage(driver);
        set = new SettingsHelper(driver);

        session.login("alekssssandra@i.ua", "qweqwe1234");
    }


    public void stop() {
        driver.quit();
    }

    public SessionHelper getSession() {
        return session;
    }

    public BoardHelper getBoard() {
        return board;
    }

    public TeamHelper getTeam() {
        return team;
    }

    public HeaderPage getHeader() {
        return header;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public SettingsHelper getSet() {
        return set;
    }
//    public SettingsHelper getSet() {
//        return getSet();
//    }
}



package com.telran.tests.model;

public class Team {
    private final String commandName;
    private final String commandDescription;

    public Team(String commandName, String commandDescription) {
        this.commandName = commandName;
        this.commandDescription = commandDescription;
    }

    public String getCommandName() {

        return commandName;
    }

    public String getCommandDescription() {

        return commandDescription;
    }
}

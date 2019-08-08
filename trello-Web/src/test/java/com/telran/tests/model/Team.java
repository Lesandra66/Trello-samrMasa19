package com.telran.tests.model;

public class Team {
    private String commandName;
    private String commandDescription;

    public String getCommandName() {

        return commandName;
    }

    public String getCommandDescription() {

        return commandDescription;
    }

    public Team setCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    public Team setCommandDescription(String commandDescription) {
        this.commandDescription = commandDescription;
        return this;
    }

    @Override
    public String toString() {
        return "Team :" +
                "commandName= " + commandName +
                ", commandDescription= " + commandDescription;
    }
}

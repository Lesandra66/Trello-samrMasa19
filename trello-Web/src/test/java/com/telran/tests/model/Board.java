package com.telran.tests.model;

public class Board {
    private String boardName;

    public Board setBoardName(String boardName) {
        this.boardName = boardName;
        return this;
    }

    public String getBoardName() {

        return boardName;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardName='" + boardName + '\'' +
                '}';
    }
}

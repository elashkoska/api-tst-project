package com.elena.games.model;

import helpers.Dificulty;

public class BoardGame {
    private String numberCode;
    private Integer daysOfUse;
    private String numberOfPlayers;
    private String time;
    private Dificulty dificulty;

    public BoardGame() {
    }

    public BoardGame(String numberCode, Integer daysOfUse, String numberOfPlayers, String time) {
        this.numberCode = numberCode;
        this.daysOfUse = daysOfUse;
        this.numberOfPlayers = numberOfPlayers;
        this.time = time;
    }

    public String getNumberCode() {
        return numberCode;
    }

    public void setNumberCode(String numberCode) {
        this.numberCode = numberCode;
    }

    public Integer getDaysOfUse() {
        return daysOfUse;
    }

    public void setDaysOfUse(Integer daysOfUse) {
        this.daysOfUse = daysOfUse;
    }

    public String getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(String numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

package com.luisro00005513.crossoversports.Entities;


public class Player {

    private Integer playerId;
    private int playerAvatar;
    private String playerName;
    private String playerAlias;
    private String playerBirth;
    private String playerExtra;
    private String playerCountry;

    public Player(Integer playerId, int playerAvatar, String playerName, String playerAlias, String playerBirth, String playerExtra, String playerCountry) {
        this.playerId = playerId;
        this.playerAvatar = playerAvatar;
        this.playerName = playerName;
        this.playerAlias = playerAlias;
        this.playerBirth = playerBirth;
        this.playerExtra = playerExtra;
        this.playerCountry = playerCountry;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public int getPlayerAvatar() {
        return playerAvatar;
    }

    public void setPlayerAvatar(int playerAvatar) {
        this.playerAvatar = playerAvatar;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerAlias() {
        return playerAlias;
    }

    public void setPlayerAlias(String playerAlias) {
        this.playerAlias = playerAlias;
    }

    public String getPlayerBirth() {
        return playerBirth;
    }

    public void setPlayerBirth(String playerBirth) {
        this.playerBirth = playerBirth;
    }

    public String getPlayerExtra() {
        return playerExtra;
    }

    public void setPlayerExtra(String playerExtra) {
        this.playerExtra = playerExtra;
    }

    public String getPlayerCountry() {
        return playerCountry;
    }

    public void setPlayerCountry(String playerCountry) {
        this.playerCountry = playerCountry;
    }
}
package com.luisro00005513.crossoversports.retrofit.extras;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerXTeam {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("playerxteam_id")
    @Expose
    private String playerxteamId;
    @SerializedName("player_number")
    @Expose
    private String playerNumber;
    @SerializedName("player_position")
    @Expose
    private String playerPosition;
    @SerializedName("player_id")
    @Expose
    private String playerId;
    @SerializedName("team_id")
    @Expose
    private String teamId;
    @SerializedName("goals_scored")
    @Expose
    private String goalsScored;
    @SerializedName("assist_scored")
    @Expose
    private String assistScored;
    @SerializedName("clean_sheets")
    @Expose
    private String cleanSheets;
    @SerializedName("yellow_cards")
    @Expose
    private String yellowCards;
    @SerializedName("red_cards")
    @Expose
    private String redCards;
    @SerializedName("__v")
    @Expose
    private Integer v;

    //constructor


    public PlayerXTeam(String playerxteamId, String playerNumber, String playerPosition, String playerId, String teamId, String goalsScored, String assistScored, String cleanSheets, String yellowCards, String redCards) {
        this.playerxteamId = playerxteamId;
        this.playerNumber = playerNumber;
        this.playerPosition = playerPosition;
        this.playerId = playerId;
        this.teamId = teamId;
        this.goalsScored = goalsScored;
        this.assistScored = assistScored;
        this.cleanSheets = cleanSheets;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayerxteamId() {
        return playerxteamId;
    }

    public void setPlayerxteamId(String playerxteamId) {
        this.playerxteamId = playerxteamId;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(String goalsScored) {
        this.goalsScored = goalsScored;
    }

    public String getAssistScored() {
        return assistScored;
    }

    public void setAssistScored(String assistScored) {
        this.assistScored = assistScored;
    }

    public String getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(String cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public String getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(String yellowCards) {
        this.yellowCards = yellowCards;
    }

    public String getRedCards() {
        return redCards;
    }

    public void setRedCards(String redCards) {
        this.redCards = redCards;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}

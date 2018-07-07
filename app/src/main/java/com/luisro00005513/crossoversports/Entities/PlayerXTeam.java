package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class PlayerXTeam {
    @PrimaryKey
    @ColumnInfo(name="playerxteam_id")
    private Integer playerxteamId;

    @ColumnInfo(name="player_position")
    private String playerPosition;

    @ColumnInfo(name="player_id")
    private Integer playerId ;

    @ColumnInfo(name="team_id")
    private Integer teamId;

    @ColumnInfo(name="goals_scored")
    private String goalsScored;

    @ColumnInfo(name="assist_scored")
    private String assistScored;

    @ColumnInfo(name="clean_sheets")
    private String cleanSheets;

    @ColumnInfo(name="yellow_cards")
    private String yellowCards;

    @ColumnInfo(name="red_cards")
    private String redCards;

    public PlayerXTeam(Integer playerxteamId, String playerPosition, Integer playerId, Integer teamId, String goalsScored, String assistScored, String cleanSheets, String yellowCards, String redCards) {
        this.playerxteamId = playerxteamId;
        this.playerPosition = playerPosition;
        this.playerId = playerId;
        this.teamId = teamId;
        this.goalsScored = goalsScored;
        this.assistScored = assistScored;
        this.cleanSheets = cleanSheets;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

    public Integer getPlayerxteamId() {
        return playerxteamId;
    }

    public void setPlayerxteamId(Integer playerxteamId) {
        this.playerxteamId = playerxteamId;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
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
}

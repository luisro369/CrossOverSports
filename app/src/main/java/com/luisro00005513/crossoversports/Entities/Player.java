package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Player {

    @PrimaryKey
    @ColumnInfo(name="player_id")
    private Long playerId;

    @ColumnInfo(name="player_avatar")
    private Integer playerAvatar;

    @ColumnInfo(name="player_name")
    private String playerName;

    @ColumnInfo(name="player_alias")
    private String playerAlias;

    @ColumnInfo(name="player_birth")
    private String playerBirth;

    @ColumnInfo(name="player_extra")
    private String playerExtra;

    @ColumnInfo(name="player_country")
    private String playerCountry;

    @ColumnInfo(name = "player_createdby")
    private String playerCreatedBy;

    public Player(Integer playerAvatar, String playerName, String playerAlias, String playerBirth, String playerExtra, String playerCountry, String playerCreatedBy) {
        this.playerAvatar = playerAvatar;
        this.playerName = playerName;
        this.playerAlias = playerAlias;
        this.playerBirth = playerBirth;
        this.playerExtra = playerExtra;
        this.playerCountry = playerCountry;
        this.playerCreatedBy = playerCreatedBy;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
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


    public Integer getPlayerAvatar() {
        return playerAvatar;
    }

    public void setPlayerAvatar(Integer playerAvatar) {
        this.playerAvatar = playerAvatar;
    }

    public String getPlayerCountry() {
        return playerCountry;
    }

    public void setPlayerCountry(String playerCountry) {
        this.playerCountry = playerCountry;
    }

    public String getPlayerCreatedBy() {
        return playerCreatedBy;
    }

    public void setPlayerCreatedBy(String playerCreatedBy) {
        this.playerCreatedBy = playerCreatedBy;
    }
}

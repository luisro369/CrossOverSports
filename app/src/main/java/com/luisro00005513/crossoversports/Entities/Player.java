package com.luisro00005513.crossoversports.Entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("player_name")
    @Expose
    private String playerName;
    @SerializedName("player_avatar")
    @Expose
    private String playerAvatar;
    @SerializedName("player_birth")
    @Expose
    private String playerBirth;
    @SerializedName("player_extra")
    @Expose
    private String playerExtra;
    @SerializedName("__v")
    @Expose
    private Integer v;

    //====constructor====
    public Player(String id, String playerName, String playerAvatar, String playerBirth, String playerExtra) {
        this.id = id;
        this.playerName = playerName;
        this.playerAvatar = playerAvatar;
        this.playerBirth = playerBirth;
        this.playerExtra = playerExtra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerAvatar() {
        return playerAvatar;
    }

    public void setPlayerAvatar(String playerAvatar) {
        this.playerAvatar = playerAvatar;
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

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}

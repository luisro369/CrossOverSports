package com.luisro00005513.crossoversports.retrofit.extras;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeamR {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("team_id")
    @Expose
    private String teamId;
    @SerializedName("team_name")
    @Expose
    private String teamName;
    @SerializedName("team_country")
    @Expose
    private String teamCountry;
    @SerializedName("team_avatar")
    @Expose
    private String teamAvatar;
    @SerializedName("team_division")
    @Expose
    private String teamDivision;
    @SerializedName("__v")
    @Expose
    private Integer v;


    //controlador
    public TeamR(String teamId, String teamName, String teamCountry, String teamAvatar, String teamDivision) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamCountry = teamCountry;
        this.teamAvatar = teamAvatar;
        this.teamDivision = teamDivision;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCountry() {
        return teamCountry;
    }

    public void setTeamCountry(String teamCountry) {
        this.teamCountry = teamCountry;
    }

    public String getTeamAvatar() {
        return teamAvatar;
    }

    public void setTeamAvatar(String teamAvatar) {
        this.teamAvatar = teamAvatar;
    }

    public String getTeamDivision() {
        return teamDivision;
    }

    public void setTeamDivision(String teamDivision) {
        this.teamDivision = teamDivision;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}

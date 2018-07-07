package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Team {
    @PrimaryKey
    @ColumnInfo(name="team_id")
    private Integer teamId;

    @ColumnInfo(name="team_name")
    private String teamName;

    @ColumnInfo(name="team_country")
    private String teamCountry;

    @ColumnInfo(name="team_avatar")
    private String teamAvatar;

    @ColumnInfo(name="team_division")
    private String teamDivision;


    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
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
}

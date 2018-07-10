package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Team {
    @PrimaryKey
    @ColumnInfo(name="team_id")
    private Long teamId;

    @ColumnInfo(name="team_name")
    private String teamName;

    @ColumnInfo(name="team_country")
    private String teamCountry;

    @ColumnInfo(name="team_avatar")
    private Integer teamAvatar;

    @ColumnInfo(name="team_division")
    private String teamDivision;

    @ColumnInfo(name="team_city")
    private String teamCity;

    @ColumnInfo(name="team_createdby")
    private String teamCreatedBy;

    public Team(String teamName, String teamCountry, Integer teamAvatar, String teamDivision, String teamCity, String teamCreatedBy) {
        this.teamName = teamName;
        this.teamCountry = teamCountry;
        this.teamAvatar = teamAvatar;
        this.teamDivision = teamDivision;
        this.teamCity = teamCity;
        this.setTeamCreatedBy(teamCreatedBy);
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
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

    public Integer getTeamAvatar() {
        return teamAvatar;
    }

    public void setTeamAvatar(Integer teamAvatar) {
        this.teamAvatar = teamAvatar;
    }

    public String getTeamDivision() {
        return teamDivision;
    }

    public void setTeamDivision(String teamDivision) {
        this.teamDivision = teamDivision;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public String getTeamCreatedBy() {
        return teamCreatedBy;
    }

    public void setTeamCreatedBy(String teamCreatedBy) {
        this.teamCreatedBy = teamCreatedBy;
    }
}

package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class TeamXTournament {

    @PrimaryKey
    @ColumnInfo(name="txt_id")
    private Integer txtId;

    @ColumnInfo(name="team_id")
    private String teamId;

    @ColumnInfo(name="tournament_id")
    private String tournamentId;

    @ColumnInfo(name="points")
    private String teamPoints;


    public Integer getTxtId() {
        return txtId;
    }

    public void setTxtId(Integer txtId) {
        this.txtId = txtId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getTeamPoints() {
        return teamPoints;
    }

    public void setTeamPoints(String teamPoints) {
        this.teamPoints = teamPoints;
    }
}

package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Tournament {

    @PrimaryKey
    @ColumnInfo(name="tournament_id")
    private Integer tournamentId;

    @ColumnInfo(name="tournament_name")
    private String tournamentName;


    @ColumnInfo(name="tournament_country")
    private String tournamentCountry;


    @ColumnInfo(name="tournament_avatar")
    private Integer tournamentAvatar;

    public Tournament(Integer tournamentId, String tournamentName, String tournamentCountry, Integer tournamentAvatar) {
        this.tournamentId = tournamentId;
        this.tournamentName = tournamentName;
        this.tournamentCountry = tournamentCountry;
        this.tournamentAvatar = tournamentAvatar;
    }

    public Integer getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getTournamentCountry() {
        return tournamentCountry;
    }

    public void setTournamentCountry(String tournamentCountry) {
        this.tournamentCountry = tournamentCountry;
    }

    public Integer getTournamentAvatar() {
        return tournamentAvatar;
    }

    public void setTournamentAvatar(Integer tournamentAvatar) {
        this.tournamentAvatar = tournamentAvatar;
    }
}

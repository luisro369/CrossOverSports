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
    private String tournamentAvatar;


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

    public String getTournamentAvatar() {
        return tournamentAvatar;
    }

    public void setTournamentAvatar(String tournamentAvatar) {
        this.tournamentAvatar = tournamentAvatar;
    }
}

package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Tournament {

    @PrimaryKey
    @ColumnInfo(name="tournament_id")
    private Long tournamentId;

    @ColumnInfo(name="tournament_name")
    private String tournamentName;


    @ColumnInfo(name="tournament_country")
    private String tournamentCountry;


    @ColumnInfo(name="tournament_avatar")
    private Integer tournamentAvatar;

    @ColumnInfo(name = "tournament_createdby")
    private  String tournamentCreatedBy;

    public Tournament(String tournamentName, String tournamentCountry, Integer tournamentAvatar, String tournamentCreatedBy) {
        this.tournamentName = tournamentName;
        this.tournamentCountry = tournamentCountry;
        this.tournamentAvatar = tournamentAvatar;
        this.tournamentCreatedBy = tournamentCreatedBy;
    }

    public Long getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Long tournamentId) {
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

    public String getTournamentCreatedBy() {
        return tournamentCreatedBy;
    }

    public void setTournamentCreatedBy(String tournamentCreatedBy) {
        this.tournamentCreatedBy = tournamentCreatedBy;
    }
}

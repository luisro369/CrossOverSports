package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class TournamentFavoritoXUsuario {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "tournament_fxu_id")
    private Long TournamentFxuId;

    @ColumnInfo(name = "user_name")
    private  String userName;

    @ColumnInfo(name = "Tournament_id")
    private Integer TournamentId;

    public TournamentFavoritoXUsuario(String userName, Integer TournamentId) {
        this.userName = userName;
        TournamentId = TournamentId;
    }

    public Long getTournamentFxuId() {
        return TournamentFxuId;
    }

    public void setTournamentFxuId(Long tournamentFxuId) {
        this.TournamentFxuId = tournamentFxuId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getTournamentId() {
        return TournamentId;
    }

    public void setTeamId(Integer TournamentId) {
        TournamentId = TournamentId;
    }
}

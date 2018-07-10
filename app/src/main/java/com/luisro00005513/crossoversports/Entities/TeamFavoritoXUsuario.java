package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class TeamFavoritoXUsuario {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "team_fxu_id")
    private Long TeamFxuId;

    @ColumnInfo(name = "user_name")
    private  String userName;

    @ColumnInfo(name = "team_id")
    private Long TeamId;


    public TeamFavoritoXUsuario() {
    }

    public TeamFavoritoXUsuario(String userName, Long teamId) {
        this.userName = userName;
        TeamId = teamId;
    }

    public Long getTeamFxuId() {
        return TeamFxuId;
    }

    public void setTeamFxuId(Long teamFxuId) {
        TeamFxuId = teamFxuId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getTeamId() {
        return TeamId;
    }

    public void setTeamId(Long teamId) {
        TeamId = teamId;
    }
}

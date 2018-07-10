package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class TeamFavoritoXUsuario {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "team_fxu_id")
    private Long fxuId;

    @ColumnInfo(name = "user_name")
    private  String userName;

    @ColumnInfo(name = "team_id")
    private Integer TeamId;

    public TeamFavoritoXUsuario(String userName, Integer teamId) {
        this.userName = userName;
        TeamId = teamId;
    }

    public Long getFxuId() {
        return fxuId;
    }

    public void setFxuId(Long fxuId) {
        this.fxuId = fxuId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getTeamId() {
        return TeamId;
    }

    public void setTeamId(Integer teamId) {
        TeamId = teamId;
    }
}

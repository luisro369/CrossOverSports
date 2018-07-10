package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;



@Entity
public class FavoritoXUsuario {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "fxu_id")
    private Long fxuId;

    @ColumnInfo(name = "user_name")
    private  String userName;

    @ColumnInfo(name = "player_id")
    private Long playerId;

    public FavoritoXUsuario(String userName, Long playerId) {
        this.userName = userName;
        this.playerId = playerId;
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

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }
}

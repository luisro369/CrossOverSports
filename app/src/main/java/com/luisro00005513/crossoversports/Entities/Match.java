package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Match {

    @PrimaryKey
    @ColumnInfo(name="tournament_id")
    private Integer tournamenId;

    @ColumnInfo(name="team1_goals")
    private String team1Goals;

    @ColumnInfo(name="team2_goals")
    private String team2Goals;

    @ColumnInfo(name="rcards_t1")
    private String rCards1;

    @ColumnInfo(name="rcards_t2")
    private String rCards2;

    @ColumnInfo(name="ycards_t1")
    private String yCards1;

    @ColumnInfo(name="ycards_t2")
    private String yCards2;


    public Integer getTournamenId() {
        return tournamenId;
    }

    public void setTournamenId(Integer tournamenId) {
        this.tournamenId = tournamenId;
    }

    public String getTeam1Goals() {
        return team1Goals;
    }

    public void setTeam1Goals(String team1Goals) {
        this.team1Goals = team1Goals;
    }

    public String getTeam2Goals() {
        return team2Goals;
    }

    public void setTeam2Goals(String team2Goals) {
        this.team2Goals = team2Goals;
    }

    public String getrCards1() {
        return rCards1;
    }

    public void setrCards1(String rCards1) {
        this.rCards1 = rCards1;
    }

    public String getrCards2() {
        return rCards2;
    }

    public void setrCards2(String rCards2) {
        this.rCards2 = rCards2;
    }

    public String getyCards1() {
        return yCards1;
    }

    public void setyCards1(String yCards1) {
        this.yCards1 = yCards1;
    }

    public String getyCards2() {
        return yCards2;
    }

    public void setyCards2(String yCards2) {
        this.yCards2 = yCards2;
    }
}

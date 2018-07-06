package com.luisro00005513.crossoversports.Entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Match {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("match_id")
    @Expose
    private String matchId;
    @SerializedName("tournament_id")
    @Expose
    private String tournamentId;
    @SerializedName("team1_goals")
    @Expose
    private String team1Goals;
    @SerializedName("team2_goals")
    @Expose
    private String team2Goals;
    @SerializedName("rcard_t1")
    @Expose
    private String rcardT1;
    @SerializedName("rcard_t2")
    @Expose
    private String rcardT2;
    @SerializedName("ycard_t1")
    @Expose
    private String ycardT1;
    @SerializedName("ycard_t2")
    @Expose
    private String ycardT2;
    @SerializedName("__v")
    @Expose
    private Integer v;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
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

    public String getRcardT1() {
        return rcardT1;
    }

    public void setRcardT1(String rcardT1) {
        this.rcardT1 = rcardT1;
    }

    public String getRcardT2() {
        return rcardT2;
    }

    public void setRcardT2(String rcardT2) {
        this.rcardT2 = rcardT2;
    }

    public String getYcardT1() {
        return ycardT1;
    }

    public void setYcardT1(String ycardT1) {
        this.ycardT1 = ycardT1;
    }

    public String getYcardT2() {
        return ycardT2;
    }

    public void setYcardT2(String ycardT2) {
        this.ycardT2 = ycardT2;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}

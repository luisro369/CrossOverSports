package com.luisro00005513.crossoversports.Entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeamXTournament {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("txt_id")
    @Expose
    private String txtId;
    @SerializedName("team_id")
    @Expose
    private String teamId;
    @SerializedName("tournament_id")
    @Expose
    private String tournamentId;
    @SerializedName("points")
    @Expose
    private String points;
    @SerializedName("__v")
    @Expose
    private Integer v;

    //contructor
    public TeamXTournament(String txtId, String teamId, String tournamentId, String points) {
        this.txtId = txtId;
        this.teamId = teamId;
        this.tournamentId = tournamentId;
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTxtId() {
        return txtId;
    }

    public void setTxtId(String txtId) {
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

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}

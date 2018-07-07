package com.luisro00005513.crossoversports.retrofit.extras;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tournament {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("tournament_id")
    @Expose
    private String tournamentId;
    @SerializedName("tournament_name")
    @Expose
    private String tournamentName;
    @SerializedName("tournament_country")
    @Expose
    private String tournamentCountry;
    @SerializedName("tournament_avatar")
    @Expose
    private String tournamentAvatar;
    @SerializedName("__v")
    @Expose
    private Integer v;

    //---constructor


    public Tournament(String tournamentId, String tournamentName, String tournamentCountry, String tournamentAvatar) {
        this.tournamentId = tournamentId;
        this.tournamentName = tournamentName;
        this.tournamentCountry = tournamentCountry;
        this.tournamentAvatar = tournamentAvatar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(String tournamentId) {
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

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}

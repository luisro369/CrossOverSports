package com.luisro00005513.crossoversports.retrofit;

import com.luisro00005513.crossoversports.retrofit.extras.Match;
import com.luisro00005513.crossoversports.retrofit.extras.Player;
import com.luisro00005513.crossoversports.retrofit.extras.PlayerXTeam;
import com.luisro00005513.crossoversports.retrofit.extras.Team;
import com.luisro00005513.crossoversports.retrofit.extras.TeamXTournament;
import com.luisro00005513.crossoversports.retrofit.extras.Tournament;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by luisro on 7/6/18.
 */

//===========Esta interface nos va a ayudar con retrofit======

public interface RetrofitService {

    /*
    //metodo para poder logearme a la api
    @POST("/login")
    Call<Login> getToken(@Body Login login);*/

    //metodo para poder extraer matches de la api
    @GET("/api/match")
    public Call<List<Match>> getMatches();

    //metodo para poder extraer players de la api
    @GET("/api/player")
    public Call<List<Player>> getPlayers();

    //metodo para poder extraer torneos de la api
    @GET("/api/tournament")
    public Call<List<Tournament>> getTournaments();


    //metodo para poder extraer equipos de la api
    @GET("/api/team")
    public Call<List<Team>> getTeams();


    //metodo para poder extraer playersxteams de la api
    @GET("/api/playerxteam")
    public Call<List<PlayerXTeam>> getPlayerxteams();

    //metodo para poder extraer teamxtournament de la api
    @GET("/api/teamxtournament")
    public Call<List<TeamXTournament>> getTeamxtournaments();



}
package com.luisro00005513.crossoversports.retrofit;

import com.luisro00005513.crossoversports.retrofit.extras.MatchR;
import com.luisro00005513.crossoversports.retrofit.extras.PlayerR;
import com.luisro00005513.crossoversports.retrofit.extras.PlayerXTeamR;
import com.luisro00005513.crossoversports.retrofit.extras.TeamR;
import com.luisro00005513.crossoversports.retrofit.extras.TeamXTournamentR;
import com.luisro00005513.crossoversports.retrofit.extras.TournamentR;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

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
    public Call<List<MatchR>> getMatches();

    //metodo para poder extraer players de la api
    @GET("/api/player")
    public Call<List<PlayerR>> getPlayers();

    //metodo para poder extraer torneos de la api
    @GET("/api/tournament")
    public Call<List<TournamentR>> getTournaments();


    //metodo para poder extraer equipos de la api
    @GET("/api/team")
    public Call<List<TeamR>> getTeams();


    //metodo para poder extraer playersxteams de la api
    @GET("/api/playerxteam")
    public Call<List<PlayerXTeamR>> getPlayerxteams();

    //metodo para poder extraer teamxtournament de la api
    @GET("/api/teamxtournament")
    public Call<List<TeamXTournamentR>> getTeamxtournaments();



}
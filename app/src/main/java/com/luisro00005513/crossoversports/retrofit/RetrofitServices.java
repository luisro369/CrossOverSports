package com.luisro00005513.crossoversports.retrofit;

import com.luisro00005513.crossoversports.retrofit.extras.MatchR;
import com.luisro00005513.crossoversports.retrofit.extras.PlayerR;
import com.luisro00005513.crossoversports.retrofit.extras.PlayerXTeamR;
import com.luisro00005513.crossoversports.retrofit.extras.TeamR;
import com.luisro00005513.crossoversports.retrofit.extras.TeamXTournamentR;
import com.luisro00005513.crossoversports.retrofit.extras.TournamentR;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by luisro on 7/6/18.
 */

public class RetrofitServices{
    //public static final String BASE_URL = "http://localhost:3000";
    //public static final String BASE_URL = "http://192.168.0.28:3000";//wifi
    //public static final String BASE_URL = "http://192.168.0.46:3000";//cable ethernet
    public static final String BASE_URL = "https://xover-api.herokuapp.com";

    public RetrofitService conectar(){
        //--------------conexion retrofit--------------------


        Retrofit.Builder buider = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = buider.build();
        RetrofitService retrofitService = retrofit.create(RetrofitService.class);
        return retrofitService;

        //--------------conexion retrofit--------------------
    }//conectar

    //=================metodo para extraer todas las matches=============================
    public List<MatchR> getMatches() {
        RetrofitService retrofitService = conectar();
        Call<List<MatchR>> call = retrofitService.getMatches();
        List<MatchR> listMatchRS = null;
        try {
            listMatchRS = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listMatchRS;
    }//metodo para que devuelva las matches



    //=================metodo para extraer todos los players=============================
    public List<PlayerR> getPlayers(){
        RetrofitService retrofitService = conectar();
        Call<List<PlayerR>> call = retrofitService.getPlayers();
        List<PlayerR> listPlayerRS = null;
        try {
            listPlayerRS = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listPlayerRS;
    }




    //=================metodo para extraer todos los torneos=============================
    public List<TournamentR> getTournaments()  {
        RetrofitService retrofitService = conectar();
        Call<List<TournamentR>> call = retrofitService.getTournaments();
        List<TournamentR> listTournamentRS = null;
        try {
            listTournamentRS = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listTournamentRS;
    }//metodo para que devuelva los torneos



    //=================metodo para extraer todos los equipos=============================
    public List<TeamR> getTeams(){
        RetrofitService retrofitService = conectar();
        Call<List<TeamR>> call = retrofitService.getTeams();
        List<TeamR> listTeamRS = null;
        try {
            listTeamRS = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listTeamRS;
    }//metodo para que devuelva los equipos



    //=================metodo para extraer todos los playersXteams=============================
    public List<PlayerXTeamR> getPlayersXTeams(){
        RetrofitService retrofitService = conectar();
        Call<List<PlayerXTeamR>> call = retrofitService.getPlayerxteams();
        List<PlayerXTeamR> playerXTeamRList = null;
        try {
            playerXTeamRList = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return playerXTeamRList;
    }//metodo para que devuelva los playersxteams



    //=================metodo para extraer todos los teamxtournaments=============================
    public List<TeamXTournamentR> getTeamxtournaments(){
        RetrofitService retrofitService = conectar();
        Call<List<TeamXTournamentR>> call = retrofitService.getTeamxtournaments();
        List<TeamXTournamentR> teamXTournamentRS = null;
        try {
            teamXTournamentRS = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teamXTournamentRS;
    }//metodo para que devuelva los teamxtournament


}// clase retrofit services

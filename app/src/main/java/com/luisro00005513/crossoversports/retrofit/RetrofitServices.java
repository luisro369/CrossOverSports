package com.luisro00005513.crossoversports.retrofit;

import android.app.Service;
import android.content.ServiceConnection;
import android.util.Log;

import com.luisro00005513.crossoversports.retrofit.extras.Match;
import com.luisro00005513.crossoversports.retrofit.extras.Player;
import com.luisro00005513.crossoversports.retrofit.extras.PlayerXTeam;
import com.luisro00005513.crossoversports.retrofit.extras.Team;
import com.luisro00005513.crossoversports.retrofit.extras.TeamXTournament;
import com.luisro00005513.crossoversports.retrofit.extras.Tournament;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
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
    public List<Match> getMatches() {
        RetrofitService retrofitService = conectar();
        Call<List<Match>> call = retrofitService.getMatches();
        List<Match> listMatches = null;
        try {
            listMatches = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listMatches;
    }//metodo para que devuelva las matches



    //=================metodo para extraer todos los players=============================
    public List<Player> getPlayers(){
        RetrofitService retrofitService = conectar();
        Call<List<Player>> call = retrofitService.getPlayers();
        List<Player> listPlayers = null;
        try {
            listPlayers = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listPlayers;
    }




    //=================metodo para extraer todos los torneos=============================
    public List<Tournament> getTournaments()  {
        RetrofitService retrofitService = conectar();
        Call<List<Tournament>> call = retrofitService.getTournaments();
        List<Tournament> listTournaments = null;
        try {
            listTournaments = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listTournaments;
    }//metodo para que devuelva los torneos



    //=================metodo para extraer todos los equipos=============================
    public List<Team> getTeams(){
        RetrofitService retrofitService = conectar();
        Call<List<Team>> call = retrofitService.getTeams();
        List<Team> listTeams = null;
        try {
            listTeams = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listTeams;
    }//metodo para que devuelva los equipos



    //=================metodo para extraer todos los playersXteams=============================
    public List<PlayerXTeam> getPlayersXTeams(){
        RetrofitService retrofitService = conectar();
        Call<List<PlayerXTeam>> call = retrofitService.getPlayerxteams();
        List<PlayerXTeam> playerXTeamList = null;
        try {
            playerXTeamList = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return playerXTeamList;
    }//metodo para que devuelva los playersxteams



    //=================metodo para extraer todos los teamxtournaments=============================
    public List<TeamXTournament> getTeamxtournaments(){
        RetrofitService retrofitService = conectar();
        Call<List<TeamXTournament>> call = retrofitService.getTeamxtournaments();
        List<TeamXTournament> teamXTournaments = null;
        try {
            teamXTournaments = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teamXTournaments;
    }//metodo para que devuelva los teamxtournament


}// clase retrofit services

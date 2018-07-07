package com.luisro00005513.crossoversports.retrofit;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.luisro00005513.crossoversports.Entities.Match;
import com.luisro00005513.crossoversports.Entities.Player;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Entities.Tournament;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by luisro on 7/6/18.
 */

public class RetrofitServices {
    public static ArrayList<Match> listMatches = new ArrayList<>();
    public static ArrayList<Player> listPlayers = new ArrayList<>();
    public static ArrayList<Tournament> listTournaments = new ArrayList<>();
    public static ArrayList<Team> listTeams = new ArrayList<>();

    //public static final String BASE_URL = "http://localhost:3000";
    //public static final String BASE_URL = "http://192.168.0.28:3000";//wifi
    public static final String BASE_URL = "http://192.168.0.46:3000";//cable ethernet

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
    public ArrayList<Match> getMatches(){
        Call<List<Match>> call = conectar().getMatches("match_id","tournament_id",
                "team1_goals","team2_goals","rcard_t1",
                "rcard_t2","ycard_t1","ycard_t2");
        call.enqueue(new Callback<List<Match>>() {
            @Override
            public void onResponse(Call<List<Match>> call, Response<List<Match>> response) {
                if(response.isSuccessful()) {
                    Log.d("conexion","conexion exitosa!!!!!");
                    for (int i = 0; i < response.body().size(); i++) {
                        String matchId = response.body().get(i).getMatchId();
                        Log.d("matchId", matchId);
                        String tournamentId = response.body().get(i).getTournamentId();
                        String team1Goals = response.body().get(i).getTeam1Goals();
                        String team2Goals = response.body().get(i).getTeam2Goals();
                        String team1Rcards = response.body().get(i).getRcardT1();
                        String team2Rcards = response.body().get(i).getRcardT2();
                        String team1Ycards = response.body().get(i).getYcardT1();
                        String team2Ycards = response.body().get(i).getYcardT2();
                        listMatches.add(new Match(matchId, tournamentId, team1Goals, team2Goals, team1Rcards,
                                team2Rcards, team1Ycards, team2Ycards));//arreglo para match

                    }//for
                }//if response successfull
                else{
                    Log.d("fracaso","conexion eronea :(((((((");
                }//si la conexion no es exitosa
            }//on response

            @Override
            public void onFailure(Call<List<Match>> call, Throwable t) {
                Log.d("failure","conexion eronea :(((((((");
            }//onfailure
        });
        if(listMatches.size() > 1 ) {
            Log.d("holiiiii:", listMatches.get(0).getMatchId());
        }
        else{
            Log.d("================res: ","arreglo nulo");
        }
        //Log.d("lista 1: ", ListMatches2.get(0).getMatchId());
        //Log.d("lista 2: ", ListMatches2.get(1).getMatchId());
        return listMatches;
    }//metodo para que devuelva las matches

    //=================metodo para extraer todos los players=============================
    public ArrayList<Player> getPlayers(){
        Call<List<Player>> call = conectar().getPlayers("player_id","player_name",
                "player_avatar","player_birth","player_extra");
        call.enqueue(new Callback<List<Player>>() {
            @Override
            public void onResponse(Call<List<Player>> call, Response<List<Player>> response) {
                if(response.isSuccessful()) {
                    Log.d("conexion","conexion exitosa!!!!!");
                    for (int i = 0; i < response.body().size(); i++) {
                        String playerId = response.body().get(i).getId();
                        String playerName = response.body().get(i).getPlayerName();
                        String playerAvatar = response.body().get(i).getPlayerAvatar();
                        String playerBirth = response.body().get(i).getPlayerBirth();
                        String playerExtra = response.body().get(i).getPlayerExtra();
                        listPlayers.add(new Player(playerId,playerName,playerAvatar,playerBirth,
                                playerExtra));//arreglo para player

                    }//for
                }//if response successfull
                else{
                    Log.d("fracaso","conexion eronea :(((((((");
                }//si la conexion no es exitosa
            }//on response

            @Override
            public void onFailure(Call<List<Player>> call, Throwable t) {
                Log.d("failure","conexion eronea :(((((((");
            }//onfailure
        });
        if(listPlayers.size() > 1 ) {
            Log.d("holiiiii:", listPlayers.get(0).getPlayerName());
        }
        else{
            Log.d("================res: ","arreglo nulo");
        }
        //Log.d("lista 1: ", ListMatches2.get(0).getMatchId());
        //Log.d("lista 2: ", ListMatches2.get(1).getMatchId());
        return listPlayers;
    }//metodo para que devuelva los players




    //=================metodo para extraer todos los torneos=============================
    public ArrayList<Tournament> getTournaments(){
        Call<List<Tournament>> call = conectar().getTournaments("tournament_id","tournament_name",
                "tournament_country","tournament_avatar");
        call.enqueue(new Callback<List<Tournament>>() {
            @Override
            public void onResponse(Call<List<Tournament>> call, Response<List<Tournament>> response) {
                if(response.isSuccessful()) {
                    Log.d("conexion","conexion exitosa!!!!!");
                    for (int i = 0; i < response.body().size(); i++) {
                        String tournamentId = response.body().get(i).getTournamentId();
                        String tournamentName = response.body().get(i).getTournamentName();
                        String tournamentCountry = response.body().get(i).getTournamentCountry();
                        String tournamentAvatar = response.body().get(i).getTournamentAvatar();
                        listTournaments.add(new Tournament(tournamentId,tournamentName,tournamentCountry,
                                tournamentAvatar));//arreglo para torneo

                    }//for
                }//if response successfull
                else{
                    Log.d("fracaso","conexion eronea :(((((((");
                }//si la conexion no es exitosa
            }//on response

            @Override
            public void onFailure(Call<List<Tournament>> call, Throwable t) {
                Log.d("failure","conexion eronea :(((((((");
            }//onfailure
        });
        if(listTournaments.size() > 1 ) {
            Log.d("holiiiii:", listTournaments.get(0).getTournamentCountry());
        }
        else{
            Log.d("================res: ","arreglo nulo");
        }
        //Log.d("lista 1: ", ListMatches2.get(0).getMatchId());
        //Log.d("lista 2: ", ListMatches2.get(1).getMatchId());
        return listTournaments;
    }//metodo para que devuelva los torneos





    //=================metodo para extraer todos los torneos=============================
    public ArrayList<Team> getTeams(){
        Call<List<Team>> call = conectar().getTeams("team_id","team_name",
                "team_country","team_avatar","team_division");
        call.enqueue(new Callback<List<Team>>() {
            @Override
            public void onResponse(Call<List<Team>> call, Response<List<Team>> response) {
                if(response.isSuccessful()) {
                    Log.d("conexion","conexion exitosa!!!!!");
                    for (int i = 0; i < response.body().size(); i++) {
                        String teamId = response.body().get(i).getTeamId();
                        String teamName = response.body().get(i).getTeamName();
                        String teamCountry = response.body().get(i).getTeamCountry();
                        String teamAvatar = response.body().get(i).getTeamAvatar();
                        String teamDivision = response.body().get(i).getTeamDivision();

                        listTeams.add(new Team(teamId,teamName,teamCountry,teamAvatar,teamDivision));//arreglo para equipo

                    }//for
                }//if response successfull
                else{
                    Log.d("fracaso","conexion eronea :(((((((");
                }//si la conexion no es exitosa
            }//on response

            @Override
            public void onFailure(Call<List<Team>> call, Throwable t) {
                Log.d("failure","conexion eronea :(((((((");
            }//onfailure
        });
        if(listTournaments.size() > 1 ) {
            Log.d("nombre equipo:", listTeams.get(0).getTeamName());
        }
        else{
            Log.d("================res: ","arreglo nulo");
        }
        //Log.d("lista 1: ", ListMatches2.get(0).getMatchId());
        //Log.d("lista 2: ", ListMatches2.get(1).getMatchId());
        return listTeams;
    }//metodo para que devuelva los equipos



}// clase retrofit services

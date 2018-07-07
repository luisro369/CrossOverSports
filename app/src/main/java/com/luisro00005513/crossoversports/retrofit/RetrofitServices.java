package com.luisro00005513.crossoversports.retrofit;

import android.content.Context;
import android.widget.Toast;

import com.luisro00005513.crossoversports.Entities.Match;

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
    public Context context;
    //public static final String BASE_URL = "http://localhost:3000";
    //public static final String BASE_URL = "http://192.168.0.28:3000";//wifi
    public static final String BASE_URL = "http://192.168.0.46:3000";//cable ethernet
    public static final ArrayList<Match> listMatches = new ArrayList<>();

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


    public ArrayList<Match> getMatches(){
        Call<List<Match>> call = conectar().getMatches("match_id","tournament_id",
                "team1_goals","team2_goals","rcard_t1",
                "rcard_t2","ycard_t1","ycard_t2");
        call.enqueue(new Callback<List<Match>>() {
            @Override
            public void onResponse(Call<List<Match>> call, Response<List<Match>> response) {
                Toast.makeText(context,"Conexion exitosa",Toast.LENGTH_SHORT).show();
                for(int i = 0; i < response.body().size(); i++) {
                    String matchId = response.body().get(i).getMatchId();
                    String tournamentId = response.body().get(i).getTournamentId();
                    String team1Goals = response.body().get(i).getTeam1Goals();
                    String team2Goals = response.body().get(i).getTeam2Goals();
                    String team1Rcards = response.body().get(i).getRcardT1();
                    String team2Rcards = response.body().get(i).getRcardT2();
                    String team1Ycards = response.body().get(i).getYcardT1();
                    String team2Ycards = response.body().get(i).getYcardT2();
                    listMatches.add(new Match(matchId,tournamentId,team1Goals,team2Goals,team1Rcards,
                            team2Rcards,team1Ycards,team2Ycards));//arreglo para match
                }//for
            }//on response

            @Override
            public void onFailure(Call<List<Match>> call, Throwable t) {
                //Toast.makeText(context,"fallo de recoleccion de datos match",Toast.LENGTH_SHORT).show();
            }//onfailure
        });

        return listMatches;
    }//metodo para que devuelva las matches

}
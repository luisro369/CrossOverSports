package com.luisro00005513.crossoversports.retrofit;

import com.luisro00005513.crossoversports.Entities.Match;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
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

    //metodo para poder extraer match de la api
    @GET("/api/match")
    public Call<List<Match>> getMatches(@Query("match_id") String matchId, @Query("tournament_id") String tournamentId,
                                     @Query("team1_goals") String team1Goals, @Query("team2_goals") String team2Goals,
                                     @Query("rcard_t1") String team1RCards, @Query("rcard_t2") String team2RCards,
                                     @Query("ycard_t1") String team1YCards, @Query("ycard_t2") String team2YCards);

}
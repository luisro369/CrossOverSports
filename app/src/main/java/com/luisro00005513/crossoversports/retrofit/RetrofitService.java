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
    public Call<List<Match>> getMatches(@Query("match_id") String matchId, @Query("tournament_id") String tournamentId,
                                     @Query("team1_goals") String team1Goals, @Query("team2_goals") String team2Goals,
                                     @Query("rcard_t1") String team1RCards, @Query("rcard_t2") String team2RCards,
                                     @Query("ycard_t1") String team1YCards, @Query("ycard_t2") String team2YCards);

    //metodo para poder extraer players de la api
    @GET("/api/player")
    public Call<List<Player>> getPlayers(@Query("player_id") String playerId, @Query("player_name") String playerName,
                                         @Query("player_avatar") String playerAvatar,@Query("player_birth") String playerBirth,
                                         @Query("player_extra") String playerExtra);

    //metodo para poder extraer torneos de la api
    @GET("/api/tournament")
    public Call<List<Tournament>> getTournaments(@Query("tournament_id") String tournamentId,
                                                 @Query("tournament_name") String tournamentName,
                                                 @Query("tournament_country") String tournamentCountry,
                                                 @Query("tournament_avatar") String tournamentAvatar);


    //metodo para poder extraer equipos de la api
    @GET("/api/team")
    public Call<List<Team>> getTeams(@Query("team_id") String teamId, @Query("team_name") String teamName,
                                     @Query("team_country") String teamCountry, @Query("team_avatar") String teamAvatar,
                                     @Query("team_division") String teamDivision);


    //metodo para poder extraer playersxteams de la api
    @GET("/api/playerxteam")
    public Call<List<PlayerXTeam>> getPlayerxteams(@Query("playerxteam_id") String playerxTId,
                                                   @Query("player_number") String playerNumber,
                                                   @Query("player_position") String playerPosition,
                                                   @Query("player_id") String playerId,
                                                   @Query("team_id") String teamId,
                                                   @Query("goals_scored") String goalsScored,
                                                   @Query("assist_scored") String assistScored,
                                                   @Query("clean_sheets") String cleanSheets,
                                                   @Query("yellow_cards") String yellowCards,
                                                   @Query("red_cards") String redCards);

    //metodo para poder extraer teamxtournament de la api
    @GET("/api/teamxtournament")
    public Call<List<TeamXTournament>> getTeamxtournaments(@Query("txt_id") String txtId,
                                                           @Query("team_id") String teamId,
                                                           @Query("tournament_id") String tournamentId,
                                                           @Query("points") String points);



}
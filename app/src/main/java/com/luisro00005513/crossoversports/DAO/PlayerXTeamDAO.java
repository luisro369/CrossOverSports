package com.luisro00005513.crossoversports.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.luisro00005513.crossoversports.Entities.PlayerXTeam;

import java.util.List;

@Dao
public interface PlayerXTeamDAO {
    @Query("SELECT * FROM PlayerXTeam")
    List<PlayerXTeamDAO> getAll();

    @Query("SELECT team_id FROM PlayerXTeam WHERE player_id=:playerId")
    PlayerXTeam playerById(Integer playerId);

    @Insert
    void insertAll(PlayerXTeam... playerXTeams);
}

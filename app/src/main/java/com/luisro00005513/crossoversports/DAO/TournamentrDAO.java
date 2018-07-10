package com.luisro00005513.crossoversports.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.luisro00005513.crossoversports.Entities.Player;
import com.luisro00005513.crossoversports.Entities.Tournament;

import java.util.List;

@Dao
public interface TournamentrDAO {
    @Query("SELECT * FROM tournament")
    List<Tournament> getAll();

    @Query(("SELECT * FROM tournament WHERE tournament_name = :playerName"))
    Tournament tournamentByName(String playerName);

    @Query(("SELECT * FROM tournament WHERE tournament_id = :playerId"))
    Tournament tournamentById(Integer playerId);

    @Query(("SELECT * FROM tournament WHERE tournament_createdby = :userName"))
    List<Tournament> tournamentByCreator(String userName);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTournament(Tournament... tournaments);

}

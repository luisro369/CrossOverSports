package com.luisro00005513.crossoversports.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.luisro00005513.crossoversports.Entities.Player;

import java.util.List;

@Dao
public interface PlayerDAO {
    @Query("SELECT * FROM player")
    List<Player> getAll();

    @Query(("SELECT * FROM player WHERE player_name = :playerName"))
    Player playerByName(String playerName);

    @Query(("SELECT * FROM player WHERE player_id = :playerId"))
    Player playerById(Integer playerId);

    @Query(("SELECT * FROM player WHERE player_createdby = :userName"))
    List<Player> playerByCreator(String userName);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPlayer(Player... players);

}

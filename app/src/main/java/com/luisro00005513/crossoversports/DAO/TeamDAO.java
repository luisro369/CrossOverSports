package com.luisro00005513.crossoversports.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.luisro00005513.crossoversports.Entities.Player;
import com.luisro00005513.crossoversports.Entities.Team;

import java.util.List;

@Dao
public interface TeamDAO {
    @Query("SELECT * FROM Team")
    List<Team> getAll();

    @Query("SELECT team_name FROM Team WHERE team_id = :teamId")
    Team teamNameById(Integer teamId);

    @Query(("SELECT * FROM Team WHERE team_createdby = :userName"))
    List<Team> teamByCreator(String userName);

    @Insert
    void insertAll(Team... teams);
}

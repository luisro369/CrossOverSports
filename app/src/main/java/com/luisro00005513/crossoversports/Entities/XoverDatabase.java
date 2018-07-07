package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.luisro00005513.crossoversports.DAO.PlayerDAO;
//import com.luisro00005513.crossoversports.DAO.PlayerXTeamDAO;
import com.luisro00005513.crossoversports.DAO.PlayerXTeamDAO;
import com.luisro00005513.crossoversports.DAO.TeamDAO;

@Database(entities = {Player.class,PlayerXTeam.class,Team.class},version = 1)
public abstract class XoverDatabase  extends RoomDatabase{
    public abstract PlayerDAO playerDAO();
   public abstract PlayerXTeamDAO playerXTeamDAO();
    public abstract TeamDAO teamDAO();
}

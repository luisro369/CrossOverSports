package com.luisro00005513.crossoversports.Entities;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.luisro00005513.crossoversports.DAO.*;

@Database(entities = {Player.class,PlayerXTeam.class,Team.class,User.class,FavoritoXUsuario.class},version = 3)
public abstract class XoverDatabase  extends RoomDatabase{
    public abstract PlayerDAO playerDAO();
   public abstract PlayerXTeamDAO playerXTeamDAO();
    public abstract TeamDAO teamDAO();
    public abstract UserDAO userDAO();
    public abstract FavoritoXUsuarioDAO favoritoXUsuarioDAO();
}

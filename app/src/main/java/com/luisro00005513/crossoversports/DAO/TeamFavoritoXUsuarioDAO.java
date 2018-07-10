package com.luisro00005513.crossoversports.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.luisro00005513.crossoversports.Entities.FavoritoXUsuario;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Entities.TeamFavoritoXUsuario;

import java.util.List;

@Dao
public interface TeamFavoritoXUsuarioDAO {
    //SELECT * FROM Table1, Table2 WHERE Table1.id = Table2.id_table1
    @Query(("SELECT Team.team_name,Team.team_name,Team.team_country,Team.team_avatar,Team.team_division,Team.team_createdby FROM Team,TeamFavoritoXUsuario WHERE TeamFavoritoXUsuario.user_name = :userName AND TeamFavoritoXUsuario.team_id = Team.team_id"))
    List<Team> favoriteTeamByUser(String userName);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void inserFavTeam(TeamFavoritoXUsuario... teamFavoritoXUsuarios);

    @Query("delete from TeamFavoritoXUsuario where team_id = :favoriteId")
    int deleteFavoriteTeam(Long favoriteId);

    @Query("SELECT * FROM TeamFavoritoXUsuario where team_id= :byId")
    TeamFavoritoXUsuario finByIdTeam(Long byId);
}

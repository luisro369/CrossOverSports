package com.luisro00005513.crossoversports.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.luisro00005513.crossoversports.Entities.FavoritoXUsuario;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Entities.Tournament;
import com.luisro00005513.crossoversports.Entities.TournamentFavoritoXUsuario;

import java.util.List;

@Dao
public interface TournamentFavoritoXUsuarioDAO {
    @Query("SELECT * FROM tournamentfavoritoxusuario")
    List<TournamentFavoritoXUsuario> getAll();
    //SELECT * FROM Table1, Table2 WHERE Table1.id = Table2.id_table1
    @Query("SELECT Tournament.tournament_id,Tournament.tournament_name,Tournament.tournament_country,Tournament.tournament_avatar,Tournament.tournament_createdby FROM Tournament,TournamentFavoritoXUsuario WHERE TournamentFavoritoXUsuario.user_name = :userName AND TournamentFavoritoXUsuario.Tournament_id = Tournament.tournament_id")
    List<Tournament> tounamentfav(String userName);

    @Query("delete from TournamentFavoritoXUsuario where Tournament_id = :favoriteId")
    int deleteFavoriteTournament(Long favoriteId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void inserTournamentFav(TournamentFavoritoXUsuario... tournamentFavoritoXUsuarios);
}

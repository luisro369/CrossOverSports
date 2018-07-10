package com.luisro00005513.crossoversports.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.luisro00005513.crossoversports.Entities.FavoritoXUsuario;
import com.luisro00005513.crossoversports.Entities.Team;
import com.luisro00005513.crossoversports.Entities.Tournament;

import java.util.List;

@Dao
public interface TournamentFavoritoXUsuarioDAO {
    //SELECT * FROM Table1, Table2 WHERE Table1.id = Table2.id_table1
    @Query(("SELECT Tournament.tournament_id,Tournament.tournament_name,Tournament.tournament_country,Tournament.tournament_avatar FROM Tournament,TournamentFavoritoXUsuario WHERE TournamentFavoritoXUsuario.user_name = :userName AND TournamentFavoritoXUsuario.Tournament_id = Tournament.tournament_id"))
    List<Tournament> favoriteByUser(String userName);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void inserFav(FavoritoXUsuario... favoritoXUsuarios);
}

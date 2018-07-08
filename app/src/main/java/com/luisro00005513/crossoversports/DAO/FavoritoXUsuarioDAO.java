package com.luisro00005513.crossoversports.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.luisro00005513.crossoversports.Entities.FavoritoXUsuario;
import com.luisro00005513.crossoversports.Entities.Player;

import java.util.List;

@Dao
public interface FavoritoXUsuarioDAO {
    //SELECT * FROM Table1, Table2 WHERE Table1.id = Table2.id_table1
    @Query(("SELECT Player.player_avatar,Player.player_name,Player.player_alias,Player.player_birth,Player.player_extra,Player.player_country,Player.player_createdby FROM Player,FavoritoXUsuario WHERE FavoritoXUsuario.user_name = :userName AND FavoritoXUsuario.player_id = Player.player_id"))
    List<Player> favoriteByUser(String userName);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void inserFav(FavoritoXUsuario... favoritoXUsuarios);
}

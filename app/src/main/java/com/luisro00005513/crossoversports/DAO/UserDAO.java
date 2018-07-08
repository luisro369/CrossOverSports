package com.luisro00005513.crossoversports.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.luisro00005513.crossoversports.Entities.User;

import java.util.List;

@Dao
public interface UserDAO {
    @Query("SELECT * FROM user WHERE user_name= :userName")
    User finByUserName(String userName);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUser(User... user);

}

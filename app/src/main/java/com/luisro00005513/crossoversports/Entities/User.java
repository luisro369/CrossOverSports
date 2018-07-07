package com.luisro00005513.crossoversports.Entities;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey
    @ColumnInfo(name = "user_id")
    private Integer userId;

    @ColumnInfo(name = "user_name")
    private String userName;

    @ColumnInfo(name = "user_pass")
    private String usePass;

    @ColumnInfo(name = "state")
    private String userState;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUsePass() {
        return usePass;
    }

    public void setUsePass(String usePass) {
        this.usePass = usePass;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }
}

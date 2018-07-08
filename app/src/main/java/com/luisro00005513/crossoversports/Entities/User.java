package com.luisro00005513.crossoversports.Entities;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    private Integer userId;

    @ColumnInfo(name = "user_name")
    private String userName;

    @ColumnInfo(name = "user_pass")
    private String userPass;

    @ColumnInfo(name = "user_email")
    private String userEmail;



    public User(String userName, String userPass, String userEmail) {
        this.userName = userName;
        this.userPass = userPass;
        this.setUserEmail(userEmail);
    }

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

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String usePass) {
        this.userPass = userPass;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}

package com.luisro00005513.crossoversports.Entities;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


public class DBHelper extends SQLiteOpenHelper {

    public static DBHelper myDB=null;
    private Context context;
    SQLiteDatabase db;
    public static final String DB_NAME="xover";

    //CREACION TABLA DE USUARIO
    public static final String TABLE_USER="user";
    public static final String COLLUMN_ID="user_id";
    public static final String COLLUMN_USER="user_name";
    public static final String COLLUMN_PASSWORD="user_pass";
    public static final String COLLUMN_STATE ="state";

    public static final String CREATE_USER_TABLE=
            "CREATE TABLE "+TABLE_USER+"("+
                    COLLUMN_ID+" TEXT,"+
                    COLLUMN_USER+" TEXT,"+
                    COLLUMN_PASSWORD+" TEXT,"+
                    COLLUMN_STATE+" TEXT)";

    //CREACION TABLA DE PLAYER
    public static final String TABLE_NEW="player";
    public static final String COLLUMN_PLAYER_ID ="player_id";
    public static final String COLLUMN_PLAYER_NAME ="player_name";
    public static final String COLLUMN_PLAYER_AVATAR ="player_avatar";
    public static final String COLLUMN_PLAYER_BIRTH ="player_birth";
    public static final String COLLUMN_PLAYER_EXTRA ="player_extra";


    public static final String CREATE_NEW_TABLE=
            "CREATE TABLE "+TABLE_NEW+"("+
                    COLLUMN_PLAYER_ID +" TEXT,"+
                    COLLUMN_PLAYER_NAME +" TEXT,"+
                    COLLUMN_PLAYER_AVATAR +" TEXT,"+
                    COLLUMN_PLAYER_BIRTH +" TEXT,"+
                    COLLUMN_PLAYER_EXTRA +" TEXT)";

    //-------------------
//CREACION TABLA DE TEAM
    public static final String TABLE_TEAM ="player";
    public static final String COLLUMN_TEAM_ID ="team_id";
    public static final String COLLUMN_TEAM_NAME ="team_name";
    public static final String COLLUMN_TEAM_COUNTRY ="team_country";
    public static final String COLLUMN_TEAM_AVATAR ="team_avatar";
    public static final String COLLUMN_TEAM_DIVISION ="team_division";

    public static final String CREATE_PLAYER_TABLE=
            "CREATE TABLE "+ TABLE_TEAM +"("+
                    COLLUMN_TEAM_ID +" TEXT,"+
                    COLLUMN_TEAM_NAME +" TEXT,"+
                    COLLUMN_TEAM_COUNTRY +" TEXT,"+
                    COLLUMN_TEAM_AVATAR +" TEXT,"+
                    COLLUMN_TEAM_DIVISION +" TEXT)";

//------------------
//CREACION TABLA DE PLAYERXTEAM
public static final String TABLE_PXT ="playerxteam";
    public static final String COLLUMN_PXT_ID ="playerxteam_id";
    public static final String COLLUMN_PXT_PLAYER_NUMBER ="player_number";
    public static final String COLLUMN_PXT_POSITION ="player_position";
    public static final String COLLUMN_PXT_PLAYER ="id_player";
    public static final String COLLUMN_PXT_TEAM ="id_team";
    public static final String COLLUMN_PXT_GOALS ="goals_scored";
    public static final String COLLUMN_PXT_ASSISTS ="assist_scored";
    public static final String COLLUMN_PXT_CLEAN ="clean_sheets";
    public static final String COLLUMN_PXT_YCARDS ="yellow_cards";
    public static final String COLLUMN_PXT_RCARDS ="red_cards";


    public static final String CREATE_PXT_TABLE=
            "CREATE TABLE "+ TABLE_TEAM +"("+
                    COLLUMN_PXT_ID +" TEXT,"+
                    COLLUMN_PXT_PLAYER_NUMBER +" TEXT,"+
                    COLLUMN_PXT_POSITION +" TEXT,"+
                    COLLUMN_PXT_PLAYER +" TEXT,"+
                    COLLUMN_PXT_TEAM +" TEXT,"+
                    COLLUMN_PXT_GOALS +" TEXT,"+
                    COLLUMN_PXT_ASSISTS +" TEXT,"+
                    COLLUMN_PXT_CLEAN +" TEXT,"+
                    COLLUMN_PXT_YCARDS +" TEXT,"+
                    COLLUMN_PXT_RCARDS +" TEXT)";

//------------------
//CREACION TABLA DE TOURNAMENT
public static final String TABLE_TOURNAMENT ="tournament";
    public static final String COLLUMN_TOURNAMENT_ID="tournament_id";
    public static final String COLLUMN_TOURNAMENT_NAME ="tournament_name";
    public static final String COLLUMN_TOURNAMENT_COUNTRY ="tournament_country";
    public static final String COLLUMN_TOURNAMENT_AVATAR ="tournament_avatar";


    public static final String CREATE_TOURNAMENT_TABLE=
            "CREATE TABLE "+ TABLE_TOURNAMENT +"("+
                    COLLUMN_TOURNAMENT_ID+" TEXT,"+
                    COLLUMN_TOURNAMENT_NAME +" TEXT,"+
                    COLLUMN_TOURNAMENT_COUNTRY +" TEXT,"+
                    COLLUMN_TOURNAMENT_AVATAR +" TEXT)";

//------------------
//CREACION TABLA DE TEAMXTOURNAMENT
public static final String TABLE_TXT ="teamxtournament";
    public static final String COLLUMN_TXT_ID="txt_id";
    public static final String COLLUMN_TXT_TEAM ="id_team";
    public static final String COLLUMN_TXT_TOURNAMENT ="id_tournament";
    public static final String COLLUMN_TXT_POINTS ="points";


    public static final String CREATE_TXT_TABLE=
            "CREATE TABLE "+ TABLE_TXT +"("+
                    COLLUMN_TXT_ID+" TEXT,"+
                    COLLUMN_TXT_TEAM +" TEXT,"+
                    COLLUMN_TXT_TOURNAMENT +" TEXT,"+
                    COLLUMN_TXT_POINTS +" TEXT)";

//------------------
//CREACION TABLA DE MATCH
public static final String TABLE_MATCH ="match";
    public static final String COLLUMN_MATCH_ID="match_id";
    public static final String COLLUMN_MATCH_TOURNAMENT ="tournament_id";
    public static final String COLLUMN_MATCH_GOALS1 ="team1_goals";
    public static final String COLLUMN_MATCH_GOALS2 ="team2_goals";
    public static final String COLLUMN_MATCH_RCARD1 ="rcard_t1`";
    public static final String COLLUMN_MATCH_RCARD2="rcard_t2";
    public static final String COLLUMN_MATCH_YCARD1 ="ycard_t1";
    public static final String COLLUMN_MATCH_YCARD2 ="ycard_t2";

    public static final String CREATE_MATCH_TABLE=
            "CREATE TABLE "+ TABLE_MATCH +"("+
                    COLLUMN_MATCH_ID+" TEXT,"+
                    COLLUMN_MATCH_TOURNAMENT+" TEXT,"+
                    COLLUMN_MATCH_GOALS1 +" TEXT,"+
                    COLLUMN_MATCH_GOALS2+" TEXT,"+
                    COLLUMN_MATCH_RCARD1 +" TEXT,"+
                    COLLUMN_MATCH_RCARD2 +" TEXT,"+
                    COLLUMN_MATCH_YCARD1 +" TEXT,"+
                    COLLUMN_MATCH_YCARD2 +" TEXT)";

//------------------



    public DBHelper(Context context) {
        super(context,DB_NAME,null,1);
        this.context=context;
        db=this.getWritableDatabase();
    }

    public static DBHelper getInstance(Context ctx){
        if(myDB==null){
            myDB=new DBHelper(ctx.getApplicationContext());
        }
        return myDB;
    }

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USER_TABLE);
        db.execSQL(CREATE_PLAYER_TABLE);
        db.execSQL(CREATE_NEW_TABLE);
        db.execSQL(CREATE_PXT_TABLE);
        db.execSQL(CREATE_TOURNAMENT_TABLE);
        db.execSQL(CREATE_TXT_TABLE);
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+COLLUMN_USER);
        db.execSQL("DROP TABLE IF EXISTS "+ COLLUMN_TEAM_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+ COLLUMN_PLAYER_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+COLLUMN_MATCH_ID);
        db.execSQL("DROP TABLE IF EXISTS "+ COLLUMN_TOURNAMENT_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+ COLLUMN_TXT_TOURNAMENT);
        db.execSQL("DROP TABLE IF EXISTS "+COLLUMN_PXT_ID);
        onCreate(db);
    }

 /*   public boolean add(User user){

        ContentValues values = new ContentValues();
        values.put(COLLUMN_ID,user.getId());
        values.put(COLLUMN_USER,user.getUser());
        values.put(COLLUMN_UAVATAR,user.getAvatar());
        values.put(COLLUMN_PASSWORD,user.getPassword());
        //ejecutar sentencia sql
        db.insert(TABLE_USER,null,values);
        Toast.makeText(context,"Exitaso",Toast.LENGTH_SHORT);
        return true;
    }
    public boolean add(News news){

        ContentValues values = new ContentValues();
        values.put(COLLUMN_PLAYER_ID,news.getId());
        values.put(COLLUMN_TEAM_NAME,news.getTitle());
        values.put(COLLUMN_PLAYER_AVATAR,news.getCoverImage());
        values.put(COLLUMN_CDATE,news.getCreatedDate());
        values.put(COLLUMN_DESC,news.getDescription());
        values.put(COLUMN_BODY,news.getBody());
        values.put(COLUMN_GAME,news.getGame());

        //ejecutar sentencia sql
        db.insert(TABLE_NEW,null,values);
        Toast.makeText(context,"Exitaso",Toast.LENGTH_SHORT);
        return true;
    }

    public boolean add(Players players){

        ContentValues values = new ContentValues();
        values.put(COLLUMN_PLAYER_ID,players.getId());
        values.put(COLLUMN_TEAM_NAME,players.getName());
        values.put(COLLUMN_TEAM_COUNTRY,players.getBiografia());
        values.put(COLLUMN_PLAYER_AVATAR,players.getAvatar());
        values.put(COLLUMN_TEAM_DIVISION,players.getGame());


        //ejecutar sentencia sql

        db.insert(TABLE_TEAM,null,values);
        Toast.makeText(context,"Exitaso",Toast.LENGTH_SHORT);
        return true;
    }*/
}

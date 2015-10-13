package com.xdsjs.save.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DbOpenHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 4;
    private static DbOpenHelper instance;

//    private static final String USERNAME_TABLE_CREATE = "CREATE TABLE "
//            + UserDao.TABLE_NAME + " ("
//            + UserDao.COLUMN_NAME_NICK + " TEXT, "
//            + UserDao.COLUMN_NAME_AVATAR + " TEXT, "
//            + UserDao.COLUMN_NAME_ID + " TEXT PRIMARY KEY);";

    private DbOpenHelper(Context context) {
        super(context, getUserDatabaseName(), null, DATABASE_VERSION);
    }

    public static DbOpenHelper getInstance(Context context) {
        if (instance == null) {
            instance = new DbOpenHelper(context.getApplicationContext());
        }
        return instance;
    }

    private static String getUserDatabaseName() {
        return "_demo.db";
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        db.execSQL(USERNAME_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 2) {
        }
        if (oldVersion < 3) {
        }
        if (oldVersion < 4) {
        }
    }

    public void closeDB() {
        if (instance != null) {
            try {
                SQLiteDatabase db = instance.getWritableDatabase();
                db.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            instance = null;
        }
    }

}
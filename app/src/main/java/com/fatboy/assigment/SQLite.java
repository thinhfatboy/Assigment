package com.fatboy.assigment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLite extends SQLiteOpenHelper {
    public static final String DB_LOP = "THEMLOP";
    public static final String DB_SINHVIEN = "SINHVIEN";
    public static final int DB_VERSION = 1;




    public SQLite(Context context) {
        super(context,DB_SINHVIEN,null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(LopDAO.SQL_LOP);
        db.execSQL(SinhVienDAO.SQL_SINHVIEN);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + LopDAO.TABLE_NAME_LOP);
        db.execSQL(" DROP TABLE IF EXISTS " + SinhVienDAO.TABLE_NAME_SINHVIEN);
    }
}

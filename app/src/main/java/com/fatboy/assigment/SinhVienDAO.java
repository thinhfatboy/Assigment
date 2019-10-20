package com.fatboy.assigment;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class SinhVienDAO {
    private Context context;
    SQLite sqLite;
    SQLiteDatabase db;
    public static final String SQL_SINHVIEN = "CREATE TABLE SinhVien (" +
            "TenSinhVien Text primary key," +
            " NgaySinh int" +
            ")";

    public static final String TABLE_NAME_SINHVIEN = "SinhVien";
    public SinhVienDAO(Context context){
        sqLite = new SQLite(context);
        db = sqLite.getWritableDatabase();
    }
    public int insertSinhVien(modelSinhVien sinhVien){
        ContentValues values= new ContentValues();
        values.put("TenSinhVien",sinhVien.getTenSinhVien());
        values.put("NgaySinh",sinhVien.getNgaySinh());
        if(  db.insert(TABLE_NAME_SINHVIEN,null,values) <0){

            return -1;//insert fail
        }
        return 1;
    }

}

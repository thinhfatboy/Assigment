package com.fatboy.assigment;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class LopDAO {
    private Context context;
    SQLite sqLite;
    SQLiteDatabase db;
    public static final String SQL_LOP = "CREATE TABLE Lop (" +
            "MaLop Text primary key," +
            " TenLop Text" +
            ")";
    public static final String TABLE_NAME_LOP = "Lop";
    public LopDAO(Context context){
    sqLite = new SQLite(context);
    db = sqLite.getWritableDatabase();
    }
    public int insertLop(modelLop lop){
        ContentValues values= new ContentValues();
        values.put("MaLop",lop.getMalop());
        values.put("TenLop",lop.getTenLop());
      if(  db.insert(TABLE_NAME_LOP,null,values) <0){
          return -1;//insert fail
      }
        return 1;
    }

}

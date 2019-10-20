package com.fatboy.assigment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edMaLop;
    private EditText edTenLop;
    private Button btnClear;
    private Button btnSave;
    private ListView lvList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLite sqLite = new SQLite(this);




    }

    public void ThemLop(View view) {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);

        View alert = LayoutInflater.from(this).inflate(R.layout.dialog,null);
        builder.setView(alert);
        edMaLop = alert.findViewById(R.id.edMaLop);
        edTenLop = alert.findViewById(R.id.edTenLop);
        btnClear = alert.findViewById(R.id.btnClear);
        btnSave = alert.findViewById(R.id.btnSave);
        builder.create().show();

//clear
btnClear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        edMaLop.setText("");
        edTenLop.setText("");
    }
});
//save
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Lưu thành công", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void DanhSachLop(View view) {
        Intent intent= new Intent(this,DanhSachActivity.class);
        startActivity(intent);
    }

    public void QuanLySinhVien(View view) {
        Intent intent= new Intent(this,QuanLySinhVienActivity.class);
        startActivity(intent);
    }
}

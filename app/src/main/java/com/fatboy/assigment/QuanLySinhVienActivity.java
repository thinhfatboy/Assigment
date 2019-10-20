package com.fatboy.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVienActivity extends AppCompatActivity {
    private TextView tvLop;
    private Spinner spinner;
    private TextView tvTenSV;
    private EditText edTenSV;
    private TextView tvNgaySinh;
    private EditText edNgaySinh;
    private Button btnThemSinhVien;
    private ListView lvThemSinhVien;
    Context context;
    private List<String> listSv = new ArrayList<String>();
 ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_sinh_vien);
        anhxa();
        btnThemSinhVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                modelSinhVien sinhVien = new modelSinhVien();

                sinhVien.setTenSinhVien(edTenSV.getText().toString());
                sinhVien.setTenSinhVien(edNgaySinh.getText().toString());
                listSv.add(sinhVien.getTenSinhVien());
                SinhVienDAO sinhVienDAO = new SinhVienDAO(QuanLySinhVienActivity.this);
                if(sinhVienDAO.insertSinhVien(sinhVien) <0){
                    Toast.makeText(getApplicationContext(), "them that bai", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "hihi", Toast.LENGTH_SHORT).show();
                }
                adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,listSv);
                lvThemSinhVien.setAdapter(adapter);
            }
        });
    }
    public void anhxa(){

        tvLop = (TextView) findViewById(R.id.tvLop);
        spinner = (Spinner) findViewById(R.id.spinner);
        tvTenSV = (TextView) findViewById(R.id.tvTenSV);
        edTenSV = (EditText) findViewById(R.id.edTenSV);
        tvNgaySinh = (TextView) findViewById(R.id.tvNgaySinh);
        edNgaySinh = (EditText) findViewById(R.id.edNgaySinh);
        btnThemSinhVien = (Button) findViewById(R.id.btnThemSinhVien);
        lvThemSinhVien = (ListView) findViewById(R.id.lvThemSinhVien);

    }
    }

package com.fatboy.assigment;

public class modelSinhVien {
    public String TenSinhVien;
    public int NgaySinh;

    public modelSinhVien(String tenSinhVien, int ngaySinh) {
        TenSinhVien = tenSinhVien;
        NgaySinh = ngaySinh;
    }

    public modelSinhVien() {

    }

    public String getTenSinhVien() {
        return TenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        TenSinhVien = tenSinhVien;
    }

    public int getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        NgaySinh = ngaySinh;
    }
}

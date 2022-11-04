package com.example.quanlysinhvien.model;

public class SinhVien {
    private int MaSV_334;
    private String HoTen_334;
    private int GioiTinh_334;
    private String DienThoai_334;
    private String Email_334;

    public SinhVien() {
    }

    public SinhVien(String hoTen_334, int gioiTinh_334, String dienThoai_334, String email_334) {
        HoTen_334 = hoTen_334;
        GioiTinh_334 = gioiTinh_334;
        DienThoai_334 = dienThoai_334;
        Email_334 = email_334;
    }

    public SinhVien(int maSV_334, String hoTen_334, int gioiTinh_334, String dienThoai_334, String email_334) {
        MaSV_334 = maSV_334;
        HoTen_334 = hoTen_334;
        GioiTinh_334 = gioiTinh_334;
        DienThoai_334 = dienThoai_334;
        Email_334 = email_334;
    }

    public int getMaSV_334() {
        return MaSV_334;
    }

    public void setMaSV_334(int maSV_334) {
        MaSV_334 = maSV_334;
    }

    public String getHoTen_334() {
        return HoTen_334;
    }

    public void setHoTen_334(String hoTen_334) {
        HoTen_334 = hoTen_334;
    }

    public int getGioiTinh_334() {
        return GioiTinh_334;
    }

    public void setGioiTinh_334(int gioiTinh_334) {
        GioiTinh_334 = gioiTinh_334;
    }

    public String getDienThoai_334() {
        return DienThoai_334;
    }

    public void setDienThoai_334(String dienThoai_334) {
        DienThoai_334 = dienThoai_334;
    }

    public String getEmail_334() {
        return Email_334;
    }

    public void setEmail_334(String email_334) {
        Email_334 = email_334;
    }
}

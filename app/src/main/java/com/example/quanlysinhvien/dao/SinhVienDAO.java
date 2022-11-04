package com.example.quanlysinhvien.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.quanlysinhvien.database.DbHelper;
import com.example.quanlysinhvien.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienDAO {
    private DbHelper csdl;
    public SinhVienDAO(Context context){
        csdl = new DbHelper(context);
    }
    public List<SinhVien> TatCaSinhVien(){
        String sql = "SELECT * FROM SinhVien";
        List<SinhVien> sinhVienList = new ArrayList<SinhVien>();
        SQLiteDatabase database = csdl.getReadableDatabase();
        Cursor cursor = database.rawQuery(sql,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int masv_334 = cursor.getInt(0);
            String hoten_334 = cursor.getString(1);
            int gioitinh_334 = cursor.getInt(2);
            String dienthoai_334 = cursor.getString(3);
            String email_334 = cursor.getString(4);
            SinhVien sv = new SinhVien(masv_334,hoten_334,gioitinh_334,dienthoai_334,email_334);
            sinhVienList.add(sv);
            cursor.moveToNext();

        }
        return sinhVienList;
    }
}

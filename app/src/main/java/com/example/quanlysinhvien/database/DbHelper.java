package com.example.quanlysinhvien.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context, "QLSinhVien.sqlite",null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            String sqlSVCreate ="CREATE TABLE IF NOT EXISTS " +
                    "SinhVien(MaSV_334 INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "HoTen_334 VARCHAR(200), " +
                    "GioiTinh_334 INTEGER, " +
                    "DienThoai_334 VARCHAR(13), " +
                    "Email_334 VARCHAR(200))";
        sqLiteDatabase.execSQL(sqlSVCreate);
        String sqlInsert1 ="INSERT INTO SinhVien(HoTen_334,GioiTinh_334,DienThoai_334,Email_334) VALUES('Thắng','0','334','thang@gmail.com')";
        String sqlInsert2 ="INSERT INTO SinhVien(HoTen_334,GioiTinh_334,DienThoai_334,Email_334) VALUES('Tâm','1','0848651','tam@gmail.com')";
        String sqlInsert3 ="INSERT INTO SinhVien(HoTen_334,GioiTinh_334,DienThoai_334,Email_334) VALUES('Quân','0','0848651','quan@gmail.com')";
        sqLiteDatabase.execSQL(sqlInsert1);
        sqLiteDatabase.execSQL(sqlInsert2);
        sqLiteDatabase.execSQL(sqlInsert3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

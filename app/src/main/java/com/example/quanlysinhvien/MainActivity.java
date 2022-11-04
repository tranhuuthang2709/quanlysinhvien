package com.example.quanlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.quanlysinhvien.adapter.SinhVienAdapter;
import com.example.quanlysinhvien.dao.SinhVienDAO;
import com.example.quanlysinhvien.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvSinhVien_334;
    private List<SinhVien> sinhvienList_334;
    private SinhVienAdapter adapter_334;
    private SinhVienDAO svDAO_334;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSinhVien_334 = (ListView) findViewById(R.id.lvsinhvien_334);
        sinhvienList_334 = new ArrayList<SinhVien>();
        svDAO_334 = new SinhVienDAO(MainActivity.this);
        sinhvienList_334= svDAO_334.TatCaSinhVien();
        adapter_334 = new SinhVienAdapter(getApplicationContext(),sinhvienList_334);
        lvSinhVien_334.setAdapter(adapter_334);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item ){
        int id = item.getItemId();
        if( id==R.id.menu_them){
            Intent intent = new Intent(MainActivity.this,AddActivity.class);
            startActivity(intent);
        }
        if ( id ==R.id.menu_thoat){
            finish();
        }
        return true;
    }
}
package com.example.quanlysinhvien.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quanlysinhvien.R;
import com.example.quanlysinhvien.model.SinhVien;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    private List<SinhVien> sinhVienList_334;
    private Context context;
    public SinhVienAdapter(Context context, List<SinhVien> listlist){
     this.context = context;
     this.sinhVienList_334 =listlist;
    }
    @Override
    public int getCount() {
        return sinhVienList_334.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoder viewHoder;
        if(view== null){
            viewHoder = new ViewHoder();
            LayoutInflater inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.view_item_sinhvien, null);
            viewHoder.tvMaSV_334 = view.findViewById(R.id.tv_masv_334);
            viewHoder.tvHoTen_334 = view.findViewById(R.id.tv_hoten_334);
            viewHoder.tvDienThoai_334 = view.findViewById(R.id.tv_dienthoai_334);
            viewHoder.tvEmail_334 = view.findViewById(R.id.tv_email_334);
            viewHoder.ivGioiTinh_334 = view.findViewById(R.id.tvgioitinh_334);
            view.setTag(viewHoder);
        }
        else {
            viewHoder =(ViewHoder) view.getTag();
        }
        SinhVien sv = sinhVienList_334.get(i);
        viewHoder.tvMaSV_334.setText("Mã SV: "+ sv.getMaSV_334());
        viewHoder.tvHoTen_334.setText("Họ Tên: "+ sv.getHoTen_334());
        viewHoder.tvDienThoai_334.setText("Điện Thoại: "+ sv.getDienThoai_334());
        viewHoder.tvEmail_334.setText("Email: "+ sv.getEmail_334());
        if(sv.getGioiTinh_334()==0){
        viewHoder.ivGioiTinh_334.setImageResource(R.drawable.face);}
        else {
            viewHoder.ivGioiTinh_334.setImageResource(R.drawable.face1);}
        return view;
    }
    class ViewHoder{
        ImageView ivGioiTinh_334;
        TextView tvMaSV_334,tvHoTen_334,tvDienThoai_334,tvEmail_334;
    }
}

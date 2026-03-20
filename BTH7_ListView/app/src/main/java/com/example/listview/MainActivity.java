package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDanhSach;
    ArrayList<String> arrPhuongTien;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDanhSach = findViewById(R.id.lvDanhSach);

        arrPhuongTien = new ArrayList<>();
        arrPhuongTien.add("Xe đạp");
        arrPhuongTien.add("Xe máy");
        arrPhuongTien.add("Ô tô");
        arrPhuongTien.add("Xe tải");
        arrPhuongTien.add("Máy bay");
        arrPhuongTien.add("Tàu lửa");

        adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrPhuongTien
        );

        lvDanhSach.setAdapter(adapter);
        lvDanhSach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // position: Vị trí của phần tử được click (bắt đầu từ 0)
                String monHocĐuocChon = arrPhuongTien.get(position);

                Toast.makeText(MainActivity.this, "Bạn chọn: " + monHocĐuocChon, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
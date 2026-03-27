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
    ArrayList<String> arrTinhThanh;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDanhSach = findViewById(R.id.lvDanhSach);

        arrTinhThanh = new ArrayList<>();
        arrTinhThanh.add("Hà Nội");
        arrTinhThanh.add("Thành phố Hồ Chí Minh");
        arrTinhThanh.add("Đồng Nai");
        arrTinhThanh.add("Bình Thuận");
        arrTinhThanh.add("Ninh Thuận");
        arrTinhThanh.add("Nha Trang");
        arrTinhThanh.add("Tiền Giang");

        adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrTinhThanh
        );

        lvDanhSach.setAdapter(adapter);
        lvDanhSach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String monHocĐuocChon = arrTinhThanh.get(position);

                Toast.makeText(MainActivity.this, "Bạn chọn: " + monHocĐuocChon, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
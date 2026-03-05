package com.example.projectapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // 1. Khai báo các biến đại diện cho các thành phần UI
    EditText edtA, edtB;
    Button btnTinh;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Kích hoạt chế độ hiển thị tràn viền
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Xử lý Padding để không bị che bởi thanh trạng thái hệ thống (Pin, Sóng...)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 2. Ánh xạ (Kết nối biến Java với ID trong file XML)
        edtA = findViewById(R.id.edtSoA);
        edtB = findViewById(R.id.edtSoB);
        btnTinh = findViewById(R.id.button);
        tvKetQua = findViewById(R.id.txtKetQua);

        // 3. Thiết lập sự kiện khi nhấn vào nút Tính Tổng
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhTong();
            }
        });
    }

    // Hàm xử lý logic tính toán
    private void tinhTong() {
        // Lấy dữ liệu từ ô nhập (dạng chuỗi)
        String sA = edtA.getText().toString().trim();
        String sB = edtB.getText().toString().trim();

        // Kiểm tra xem người dùng có bỏ trống ô nào không
        if (sA.isEmpty() || sB.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ hai số", Toast.LENGTH_SHORT).show();
            tvKetQua.setText(""); // Xóa kết quả cũ nếu nhập thiếu
            return;
        }

        try {
            // Chuyển từ chuỗi sang số thực để tính toán
            double soA = Double.parseDouble(sA);
            double soB = Double.parseDouble(sB);

            double tong = soA + soB;

            // Hiển thị kết quả lên màn hình (chỉ hiện con số)
            tvKetQua.setText(String.valueOf(tong));

        } catch (NumberFormatException e) {
            // Trường hợp người dùng nhập sai định dạng (ví dụ chỉ nhập dấu chấm)
            tvKetQua.setText("Lỗi số!");
            Toast.makeText(this, "Số nhập vào không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}
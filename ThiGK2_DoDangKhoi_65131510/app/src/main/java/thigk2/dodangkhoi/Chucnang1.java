package thigk2.dodangkhoi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Chucnang1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang1);

        EditText edtVND = findViewById(R.id.edtVND);
        EditText edtTiGia = findViewById(R.id.edtTiGia);
        Button btnChuyenDoi = findViewById(R.id.btnChuyenDoi);
        TextView tvKetQua = findViewById(R.id.tvKetQua);

        btnChuyenDoi.setOnClickListener(v -> {
            try {
                double dola = Double.parseDouble(edtVND.getText().toString());
                double tigia = Double.parseDouble(edtTiGia.getText().toString());
                double vnd = dola * tigia;
                tvKetQua.setText("Kết quả: " + vnd + " VND");
            } catch (Exception e) {
                Toast.makeText(this, "Lỗi nhập liệu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
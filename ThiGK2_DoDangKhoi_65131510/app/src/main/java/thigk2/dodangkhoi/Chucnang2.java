package thigk2.dodangkhoi;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class Chucnang2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang2);

        ListView lvBaiHat = findViewById(R.id.lvBaiHat);
        String[] baiHats = {
                "Tiến quân ca", "Cô gái mở đường", "Lên đàng", "Trường Sơn Đông, Trường Sơn Tây",
                "Nối vòng tay lớn", "Hành khúc ngày và đêm", "Đỗ Đăng Khôi",
                "Chào em cô gái Lam Hồng", "Bóng cây Kơnia", "Đất nước trọn niềm vui"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, baiHats);
        lvBaiHat.setAdapter(adapter);
    }
}
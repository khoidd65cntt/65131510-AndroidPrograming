package thigk2.dodangkhoi;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Chucnang3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang3);

        ListView lvDanhNhan = findViewById(R.id.lvDanhNhan);
        ArrayList<DanhNhan> listDanhNhan = new ArrayList<>();

        listDanhNhan.add(new DanhNhan(R.mipmap.ic_launcher, "Lý Thường Kiệt", "Hà Nội"));
        listDanhNhan.add(new DanhNhan(R.mipmap.ic_launcher, "Trần Hưng Đạo", "Nam Định"));
        listDanhNhan.add(new DanhNhan(R.mipmap.ic_launcher, "Nguyễn Trãi", "Hà Nội"));
        listDanhNhan.add(new DanhNhan(R.mipmap.ic_launcher, "Quang Trung", "Bình Định"));
        listDanhNhan.add(new DanhNhan(R.mipmap.ic_launcher, "Võ Nguyên Giáp", "Quảng Bình"));

        DanhNhanAdapter adapter = new DanhNhanAdapter(this, R.layout.activity_item_danh_nhan, listDanhNhan);
        lvDanhNhan.setAdapter(adapter);
    }
}
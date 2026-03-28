package thomc.appmonan;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvDsMonAn = findViewById(R.id.lvDsMonAn);

        ArrayList<MonAn> dsMonAn = new ArrayList<>();
        dsMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Cơm tấm sườn siêu ngon có cơm và miếng sườn.", R.drawable.cts));
        dsMonAn.add(new MonAn("Cơm tấm sườn trứng", 27000, "Cơm tấm có cơm, miếng sườn và có thêm miếng trứng.", R.drawable.cst));
        dsMonAn.add(new MonAn("Cơm gà xối mỡ", 30000, "Đĩa cơm gà bày ra đĩa trông bắt mắt với phần cơm...", R.drawable.cg));
        dsMonAn.add(new MonAn("Cơm tấm sườn bì chả", 32000, "Cơm tấm có cơm, miếng sườn, cộng thêm bì và chả...", R.drawable.sb));
        dsMonAn.add(new MonAn("Cơm tấm đặc biệt", 35000, "Cơm tấm đặc biệt có cơm và đầy đủ topping...", R.drawable.db));

        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDsMonAn.setAdapter(adapter);
    }
}
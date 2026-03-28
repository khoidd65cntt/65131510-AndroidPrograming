package thomc.appmonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView; // Đã thêm dòng này
import android.widget.TextView;  // Đã thêm dòng này

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;

    public MonAnAdapter(Context _context, ArrayList<MonAn> dsMonAn) {
        this.dsMonAn = dsMonAn;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewHienHanh = view;
        if (viewHienHanh == null) {
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan, null);
        }

        MonAn monAnHienTai = dsMonAn.get(i);

        ImageView imAnhDaiDien = viewHienHanh.findViewById(R.id.imAnhDaiDien);
        TextView tvTenMonAn = viewHienHanh.findViewById(R.id.tvTenMonAn);
        TextView tvDonGia = viewHienHanh.findViewById(R.id.tvDonGia);
        TextView tvMoTa = viewHienHanh.findViewById(R.id.tvMoTa);

        tvTenMonAn.setText(monAnHienTai.getTenMonAn());
        tvDonGia.setText((int)monAnHienTai.getDonGia() + " đ");
        tvMoTa.setText(monAnHienTai.getMoTa());
        imAnhDaiDien.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return viewHienHanh;
    }
}
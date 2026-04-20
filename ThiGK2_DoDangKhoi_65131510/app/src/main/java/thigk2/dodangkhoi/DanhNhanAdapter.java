package thigk2.dodangkhoi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class DanhNhanAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<DanhNhan> danhNhanList;

    public DanhNhanAdapter(Context context, int layout, List<DanhNhan> danhNhanList) {
        this.context = context;
        this.layout = layout;
        this.danhNhanList = danhNhanList;
    }

    @Override
    public int getCount() { return danhNhanList.size(); }

    @Override
    public Object getItem(int position) { return null; }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        ImageView imgDanhNhan = convertView.findViewById(R.id.imgDanhNhan);
        TextView tvTen = convertView.findViewById(R.id.tvTen);
        TextView tvQueQuan = convertView.findViewById(R.id.tvQueQuan);

        DanhNhan danhNhan = danhNhanList.get(position);
        imgDanhNhan.setImageResource(danhNhan.getHinhAnh());
        tvTen.setText(danhNhan.getTen());
        tvQueQuan.setText(danhNhan.getQueQuan());

        return convertView;
    }
}
package thigk2.dodangkhoi;

public class DanhNhan {
    private int hinhAnh;
    private String ten;
    private String queQuan;

    public DanhNhan(int hinhAnh, String ten, String queQuan) {
        this.hinhAnh = hinhAnh;
        this.ten = ten;
        this.queQuan = queQuan;
    }

    public int getHinhAnh() { return hinhAnh; }
    public String getTen() { return ten; }
    public String getQueQuan() { return queQuan; }
}
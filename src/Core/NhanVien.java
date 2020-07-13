package Core;

public class NhanVien extends Nguoi {
    private double luong;


    public NhanVien(String name, double luong) {
        super(name);
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}

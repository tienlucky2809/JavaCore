package Core;

public class Main {
    public static void main(String[] args) {
        Nguoi sinhVien = (SinhVien) new SinhVien("sinhvien", 1);
        Nguoi nhanVien = new NhanVien("nhanvien", 2.0);
        System.out.println("thong tin sinh vien : " + sinhVien.getName() + " " + ((SinhVien) sinhVien).getId());
    }
}

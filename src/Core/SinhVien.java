package Core;

public class SinhVien extends Nguoi {
    private int id;

    public SinhVien(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
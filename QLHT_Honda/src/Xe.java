public class Xe {
    private String tenXe;
    private String maSoXe;
    private double giaTien;
    private String trangThai;

    public Xe(String tenXe, String maSoXe, double giaTien, String trangThai) {
        this.tenXe = tenXe;
        this.maSoXe = maSoXe;
        this.giaTien = giaTien;
        this.trangThai = trangThai;
    }

    public String getTenXe() {
        return tenXe;
    }

    public double getGiaTien() {
        return giaTien;
    }

    @Override
    public String toString() {
        return "Tên xe: " + tenXe +
                ", Mã số xe: " + maSoXe +
                ", Giá tiền: " + giaTien +
                ", Trạng thái: " + trangThai;
    }
}

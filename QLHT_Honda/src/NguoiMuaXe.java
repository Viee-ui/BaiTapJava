import java.time.LocalDate;

public class NguoiMuaXe extends Nguoi {
    private LocalDate ngayMua;
    private Xe xeDaMua;
    private int soTichDiem;

    public NguoiMuaXe(String hoTen, String soDienThoai, String soCanCuoc, LocalDate ngayMua, Xe xeDaMua) {
        super(hoTen, soDienThoai, soCanCuoc); // Kế thừa từ lớp cha
        this.ngayMua = ngayMua;
        this.xeDaMua = xeDaMua;
        this.soTichDiem = 0; // Điểm tích lũy khởi đầu
    }

    public LocalDate getNgayMua() {
        return ngayMua;
    }

    public Xe getXeDaMua() {
        return xeDaMua;
    }

    public void tangTichDiem() {
        this.soTichDiem += 1; // Tăng điểm tích lũy mỗi lần mua xe
    }

    public double tinhTien() {
        return (xeDaMua.getGiaTien() - (soTichDiem * 10)) * 1.1; // Áp dụng tích điểm và thuế 10%
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Ngày mua: " + ngayMua +
                ", Xe đã mua: " + xeDaMua +
                ", Số tích điểm: " + soTichDiem;
    }
}

public class Phong {
    private String idPhong;
    private String tenPhong;
    private int soLuongGiuong;
    private int soLuongBenhNhan;

    public Phong(String idPhong, String tenPhong, int soLuongGiuong) {
        this.idPhong = idPhong;
        this.tenPhong = tenPhong;
        this.soLuongGiuong = soLuongGiuong;
        this.soLuongBenhNhan = 0;
    }

    public void themBenhNhan() {
        if (soLuongBenhNhan >= soLuongGiuong) {
            System.out.println("Phòng quá tải!");
        } else {
            soLuongBenhNhan++;
        }
    }

    public void xoaBenhNhan() {
        if (soLuongBenhNhan > 0) {
            soLuongBenhNhan--;
        }
    }

    @Override
    public String toString() {
        return "ID Phòng: " + idPhong + ", Tên phòng: " + tenPhong +
                ", Số lượng giường: " + soLuongGiuong +
                ", Số lượng bệnh nhân: " + soLuongBenhNhan;
    }
}

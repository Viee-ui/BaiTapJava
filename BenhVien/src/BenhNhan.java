public class BenhNhan extends Person {
    private String idBenhNhan;
    private String idBenh;
    private String idPhong;
    private String ngayNhapVien;
    private String ngayXuatVien;
    private boolean daXuatVien;
    private String idBacSiDamNhiem;

    public BenhNhan(String ten, String namSinh, String diaChi, String idBenhNhan, String idBenh, String idPhong,
                    String ngayNhapVien, String idBacSiDamNhiem) {
        super(ten, namSinh, diaChi);
        this.idBenhNhan = idBenhNhan;
        this.idBenh = idBenh;
        this.idPhong = idPhong;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayXuatVien = "";
        this.daXuatVien = false;
        this.idBacSiDamNhiem = idBacSiDamNhiem;
    }

    public void xuatVien(String ngayXuatVien) {
        if (ngayXuatVien.compareTo(ngayNhapVien) < 0) {
            System.out.println("Ngày xuất viện không hợp lệ!");
            return;
        }
        this.ngayXuatVien = ngayXuatVien;
        this.daXuatVien = true;
    }

    public void doiPhong(String idPhongMoi) {
        this.idPhong = idPhongMoi;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", ID Bệnh nhân: " + idBenhNhan +
                ", ID Bệnh: " + idBenh +
                ", ID Phòng: " + idPhong +
                ", Ngày nhập viện: " + ngayNhapVien +
                ", Ngày xuất viện: " + ngayXuatVien +
                ", Đã xuất viện: " + daXuatVien +
                ", ID Bác sĩ đảm nhiệm: " + idBacSiDamNhiem;
    }

    public String getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(String idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    public String getIdBenh() {
        return idBenh;
    }

    public void setIdBenh(String idBenh) {
        this.idBenh = idBenh;
    }

    public String getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
    }
}

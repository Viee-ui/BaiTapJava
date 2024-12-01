public class NguoiDoc extends Nguoi {
    private String maSinhVien;
    private String ngayMuon;
    private String ngayTra;

    public NguoiDoc(String hoTen, String soDienThoai, String email, String maSinhVien) {
        super(hoTen, soDienThoai, email);
        this.maSinhVien = maSinhVien;
        this.ngayMuon = null;
        this.ngayTra = null;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    @Override
    public void print() {
        System.out.println("Họ tên: " + hoTen + ", SĐT: " + soDienThoai + ", Email: " + email);
        System.out.println("Mã sinh viên: " + maSinhVien + ", Ngày mượn: " + ngayMuon + ", Ngày trả: " + ngayTra);
    }
}


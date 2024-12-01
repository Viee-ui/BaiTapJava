public class NguoiQuanLy extends Nguoi {
    private String chucVu; // Chức vụ của người quản lý

    public NguoiQuanLy(String hoTen, String soDienThoai, String soCanCuoc, String chucVu) {
        super(hoTen, soDienThoai, soCanCuoc);
        this.chucVu = chucVu;
    }

    public String getChucVu() {
        return chucVu;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chức vụ: " + chucVu;
    }
}

public class Nguoi {
    protected String hoTen;
    protected String soDienThoai;
    protected String soCanCuoc;

    public Nguoi(String hoTen, String soDienThoai, String soCanCuoc) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soCanCuoc = soCanCuoc;
    }

    @Override
    public String toString() {
        return "Họ tên: " + hoTen +
                ", Số điện thoại: " + soDienThoai +
                ", Số căn cước: " + soCanCuoc;
    }
}

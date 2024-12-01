public abstract class Nguoi {
    protected String hoTen;
    protected String soDienThoai;
    protected String email;

    public Nguoi(String hoTen, String soDienThoai, String email) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public abstract void print(); // Phương thức in thông tin (được triển khai bởi các lớp con)
}


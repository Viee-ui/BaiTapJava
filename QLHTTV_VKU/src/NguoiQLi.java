public class NguoiQLi extends Nguoi {
    private String soCCCD;

    public NguoiQLi(String hoTen, String soDienThoai, String email, String soCCCD) {
        super(hoTen, soDienThoai, email);
        this.soCCCD = soCCCD;
    }

    @Override
    public void print() {
        System.out.println("Họ tên: " + hoTen + ", SĐT: " + soDienThoai + ", Email: " + email);
        System.out.println("Số CCCD: " + soCCCD);
    }
}


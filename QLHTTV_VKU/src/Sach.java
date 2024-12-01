public class Sach {
    private String tenSach;
    private String maSach;
    private boolean trangThai; // true: Đã mượn, false: Còn lại

    public Sach(String tenSach, String maSach) {
        this.tenSach = tenSach;
        this.maSach = maSach;
        this.trangThai = false; // Mặc định là chưa được mượn
    }

    public String getMaSach() {
        return maSach;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void print() {
        System.out.println("Tên sách: " + tenSach + ", Mã sách: " + maSach +
                ", Trạng thái: " + (trangThai ? "Đã mượn" : "Còn lại"));
    }
}

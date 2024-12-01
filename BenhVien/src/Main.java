public class Main {
    public static void main(String[] args) {
        QuanLyBenhVien quanLy = new QuanLyBenhVien();

        // Thêm khoa
        Khoa khoa1 = new Khoa("K001", "Khoa Nội");
        quanLy.themKhoa(khoa1);

        // Thêm bác sĩ
        BacSi bacSi1 = new BacSi("Nguyễn Văn Phong", "1985", "Hà Nội", "BS001", "K001");
        quanLy.themBacSi(bacSi1);

        Phong phong1 = new Phong("P001", "Phòng 101", 2);
        quanLy.themPhong(phong1);

        BenhNhan benhNhan1 = new BenhNhan("Phan Thị Cam", "2000", "Hà Nội", "BN001", "B001", "P001", "15/11/2024", "BS001");
        quanLy.themBenhNhan(benhNhan1);

        quanLy.hienThiBenhNhanTheoBenh("B001");

        quanLy.hienThiBacSiTheoKhoa("K001");

        quanLy.doiPhongBenhNhan("BN001", "P002");
    }
}


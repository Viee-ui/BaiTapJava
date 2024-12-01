public class Main {
    public static void main(String[] args) {
        ThuVien thuVien = new ThuVien();

        // Thêm sách vào thư viện
        thuVien.themSach(new Sach("Lập trình Java", "S001"));
        thuVien.themSach(new Sach("Cấu trúc dữ liệu", "S002"));
        thuVien.themSach(new Sach("Giải tích 1", "S003"));
        thuVien.themSach(new Sach("Hệ điều hành", "S004"));
        thuVien.themSach(new Sach("Cơ sở dữ liệu", "S005"));

        // Thêm người đọc
        NguoiDoc nguoiDoc1 = new NguoiDoc("Nguyễn Văn A", "0123456789", "nguyenvana@gmail.com", "SV001");
        thuVien.themNguoiDoc(nguoiDoc1);

        // Mượn sách
        thuVien.capNhatMuonTraSach("S001", nguoiDoc1, "2024-11-22", null);

        // Trả sách
        thuVien.capNhatMuonTraSach("S001", nguoiDoc1, null, "2024-11-29");

        // In danh sách sách
        thuVien.inDanhSachSach();

        // Kiểm tra sách đã mượn
        thuVien.kiemTraSachMuon();

        // Kiểm tra sách còn lại
        thuVien.kiemTraSachCon();
    }
}

import java.util.ArrayList;
import java.util.List;

public class QliThuVien {
    private static List<Sach> danhSachSach;
    private static List<NguoiDoc> danhSachNguoiDoc;

    public QliThuVien() {
        danhSachSach = new ArrayList<>();
        danhSachNguoiDoc = new ArrayList<>();
    }

    // Thêm sách vào thư viện
    public static void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    // Thêm người đọc
    public static void themNguoiDoc(NguoiDoc nguoiDoc) {
        danhSachNguoiDoc.add(nguoiDoc);
    }

    // Cập nhật mượn/trả sách
    public static void capNhatMuonTraSach(String maSach, NguoiDoc nguoiDoc, String ngayMuon, String ngayTra) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                if (!sach.isTrangThai()) {
                    // Mượn sách
                    sach.setTrangThai(true);
                    nguoiDoc.setNgayMuon(ngayMuon);
                    System.out.println(nguoiDoc.hoTen + " đã mượn sách: " + sach.getMaSach());
                } else {
                    // Trả sách
                    sach.setTrangThai(false);
                    nguoiDoc.setNgayTra(ngayTra);
                    System.out.println(nguoiDoc.hoTen + " đã trả sách: " + sach.getMaSach());
                }
                return;
            }
        }
        System.out.println("Không tìm thấy mã sách: " + maSach);
    }

    // In danh sách sách
    public static void inDanhSachSach() {
        System.out.println("Danh sách sách trong thư viện:");
        for (Sach sach : danhSachSach) {
            sach.print();
        }
    }

    // In danh sách sách đã mượn
    public static void kiemTraSachMuon() {
        System.out.println("Danh sách sách đã mượn:");
        for (Sach sach : danhSachSach) {
            if (sach.isTrangThai()) {
                sach.print();
            }
        }
    }

    // In danh sách sách còn lại
    public static void kiemTraSachCon() {
        System.out.println("Danh sách sách còn lại:");
        for (Sach sach : danhSachSach) {
            if (!sach.isTrangThai()) {
                sach.print();
            }
        }
    }
}

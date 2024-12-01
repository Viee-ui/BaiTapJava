import java.util.ArrayList;
import java.util.List;

public class QuanLyBenhVien {
    private List<Khoa> danhSachKhoa;
    private List<BacSi> danhSachBacSi;
    private List<BenhNhan> danhSachBenhNhan;
    private List<Phong> danhSachPhong;

    public QuanLyBenhVien() {
        danhSachKhoa = new ArrayList<>();
        danhSachBacSi = new ArrayList<>();
        danhSachBenhNhan = new ArrayList<>();
        danhSachPhong = new ArrayList<>();
    }

    // Thêm khoa
    public void themKhoa(Khoa khoa) {
        danhSachKhoa.add(khoa);
        System.out.println("Đã thêm khoa: " + khoa);
    }

    // Thêm bác sĩ
    public void themBacSi(BacSi bacSi) {
        danhSachBacSi.add(bacSi);
        System.out.println("Đã thêm bác sĩ: " + bacSi);
    }

    // Thêm bệnh nhân
    public void themBenhNhan(BenhNhan benhNhan) {
        danhSachBenhNhan.add(benhNhan);
        System.out.println("Đã thêm bệnh nhân: " + benhNhan);
    }

    // Thêm phòng
    public void themPhong(Phong phong) {
        danhSachPhong.add(phong);
        System.out.println("Đã thêm phòng: " + phong);
    }

    // Hiển thị danh sách bệnh nhân theo bệnh
    public void hienThiBenhNhanTheoBenh(String idBenh) {
        System.out.println("Danh sách bệnh nhân theo ID bệnh " + idBenh + ":");
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getIdBenh().equals(idBenh)) {
                System.out.println(bn);
            }
        }
    }

    // Hiển thị danh sách bệnh nhân theo phòng
    public void hienThiBenhNhanTheoPhong(String idPhong) {
        System.out.println("Danh sách bệnh nhân trong phòng " + idPhong + ":");
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getIdPhong().equals(idPhong)) {
                System.out.println(bn);
            }
        }
    }

    // Hiển thị danh sách bác sĩ theo khoa
    public void hienThiBacSiTheoKhoa(String idKhoa) {
        System.out.println("Danh sách bác sĩ trong khoa " + idKhoa + ":");
        for (BacSi bs : danhSachBacSi) {
            if (bs.getIdKhoaDamNhiem().equals(idKhoa)) {
                System.out.println(bs);
            }
        }
    }

    // Hiển thị danh sách bệnh nhân theo năm sinh
    public void hienThiBenhNhanTheoNamSinh(String namSinh) {
        System.out.println("Danh sách bệnh nhân sinh năm " + namSinh + ":");
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getNamSinh().equals(namSinh)) {
                System.out.println(bn);
            }
        }
    }

    // Đổi phòng cho bệnh nhân
    public void doiPhongBenhNhan(String idBenhNhan, String idPhongMoi) {
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getIdBenhNhan().equals(idBenhNhan)) {
                bn.doiPhong(idPhongMoi);
                System.out.println("Đã đổi phòng cho bệnh nhân " + idBenhNhan + " sang phòng " + idPhongMoi);
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân với ID: " + idBenhNhan);
    }

    // Đổi khoa cho bác sĩ
    public void doiKhoaBacSi(String idBacSi, String idKhoaMoi) {
        for (BacSi bs : danhSachBacSi) {
            if (bs.getIdBacSi().equals(idBacSi)) {
                bs.doiKhoa(idKhoaMoi);
                System.out.println("Đã đổi khoa cho bác sĩ " + idBacSi + " sang khoa " + idKhoaMoi);
                return;
            }
        }
        System.out.println("Không tìm thấy bác sĩ với ID: " + idBacSi);
    }
}

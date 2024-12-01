import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class QuanLy {
        private List<NguoiMuaXe> danhSachNguoiMua = new ArrayList<>();
        private List<NguoiQuanLy> danhSachQuanLy = new ArrayList<>();

        public void themNguoiMua(NguoiMuaXe nguoiMua) {
            danhSachNguoiMua.add(nguoiMua);
            nguoiMua.tangTichDiem(); // Tăng điểm tích lũy cho người mua
        }

        public void themNguoiQuanLy(NguoiQuanLy quanLy) {
            danhSachQuanLy.add(quanLy);
        }

        public void sapXepNguoiMuaTheoNgay() {
            danhSachNguoiMua.sort(Comparator.comparing(NguoiMuaXe::getNgayMua));
        }

        public List<NguoiMuaXe> timNguoiMuaTheoNgay(LocalDate ngayMua) {
            List<NguoiMuaXe> ketQua = new ArrayList<>();
            for (NguoiMuaXe nguoiMua : danhSachNguoiMua) {
                if (nguoiMua.getNgayMua().equals(ngayMua)) {
                    ketQua.add(nguoiMua);
                }
            }
            return ketQua;
        }

        public void inDanhSachNguoiMua() {
            System.out.println("Danh sách người mua xe:");
            for (NguoiMuaXe nguoiMua : danhSachNguoiMua) {
                System.out.println(nguoiMua);
            }
        }

        public void inDanhSachQuanLy() {
            System.out.println("Danh sách người quản lý:");
            for (NguoiQuanLy quanLy : danhSachQuanLy) {
                System.out.println(quanLy);
            }
        }
    }


import java.util.ArrayList;
import java.util.List;

public class Khoa {
    private String idKhoa;
    private String tenKhoa;
    private List<String> danhSachBacSi;

    public Khoa(String idKhoa, String tenKhoa) {
        this.idKhoa = idKhoa;
        this.tenKhoa = tenKhoa;
        this.danhSachBacSi = new ArrayList<>();
    }

    public void themBacSi(String idBacSi) {
        danhSachBacSi.add(idBacSi);
    }

    public void xoaBacSi(String idBacSi) {
        danhSachBacSi.remove(idBacSi);
    }

    @Override
    public String toString() {
        return "ID Khoa: " + idKhoa + ", Tên khoa: " + tenKhoa + ", Danh sách bác sĩ: " + danhSachBacSi;
    }
}


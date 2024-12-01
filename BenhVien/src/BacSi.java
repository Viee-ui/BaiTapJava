import java.util.ArrayList;
import java.util.List;

public class BacSi extends Person {
    private String idBacSi;
    private String idKhoaDamNhiem;
    private List<String> danhSachBenhNhan;

    public BacSi(String ten, String namSinh, String diaChi, String idBacSi, String idKhoaDamNhiem) {
        super(ten, namSinh, diaChi);
        this.idBacSi = idBacSi;
        this.idKhoaDamNhiem = idKhoaDamNhiem;
        this.danhSachBenhNhan = new ArrayList<>();
    }

    public void themBenhNhan(String idBenhNhan) {
        danhSachBenhNhan.add(idBenhNhan);
    }

    public void doiKhoa(String idKhoaMoi) {
        this.idKhoaDamNhiem = idKhoaMoi;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", ID Bác sĩ: " + idBacSi +
                ", ID Khoa đảm nhiệm: " + idKhoaDamNhiem +
                ", Danh sách bệnh nhân: " + danhSachBenhNhan;
    }

    public Object getIdKhoaDamNhiem() {
        return null;
    }

    public Object getIdBacSi() {
        return null;
    }
}


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Xe xe1 = new Xe("Honda Civic", "001", 50000, "Mới");
        Xe xe2 = new Xe("Honda CR-V", "002", 60000, "Mới");
        Xe xe3 = new Xe("Honda Accord", "003", 70000, "Mới");
        Xe xe4 = new Xe("Dream", "004", 40000, "Mới");
        Xe xe5 = new Xe("Honda cup", "005", 30000, "Mới");

        QuanLy quanLy = new QuanLy();

        // Thêm người mua
        NguoiMuaXe nguoi1 = new NguoiMuaXe("Phan Thị Cam", "0123456789", "123456789", LocalDate.of(2024, 11, 20), xe1);
        NguoiMuaXe nguoi2 = new NguoiMuaXe("Nguyễn Văn Phong", "0987654321", "987654321", LocalDate.of(2024, 11, 19), xe2);
        quanLy.themNguoiMua(nguoi1);
        quanLy.themNguoiMua(nguoi2);

        // Thêm người quản lý
        NguoiQuanLy quanLy1 = new NguoiQuanLy("Tran Van C", "0345678901", "345678901", "Quản lý khu vực miền Bắc");
        NguoiQuanLy quanLy2 = new NguoiQuanLy("Nguyen Thi D", "0567890123", "567890123", "Quản lý khu vực miền Nam");
        quanLy.themNguoiQuanLy(quanLy1);
        quanLy.themNguoiQuanLy(quanLy2);

        // Hiển thị danh sách
        System.out.println("Danh sách trước khi sắp xếp:");
        quanLy.inDanhSachNguoiMua();

        quanLy.sapXepNguoiMuaTheoNgay();

        System.out.println("\nDanh sách sau khi sắp xếp theo ngày mua:");
        quanLy.inDanhSachNguoiMua();

        System.out.println("\nDanh sách người quản lý:");
        quanLy.inDanhSachQuanLy();
    }
}

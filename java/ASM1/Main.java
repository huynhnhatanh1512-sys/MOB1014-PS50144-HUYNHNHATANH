/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM1;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author nhat
 */
public class Main {
    private static final ArrayList<SanPham> ds = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            menu();
            int chon = docLuaChon();
            switch (chon) {
                case 1:
                    them(new SanPhamDienTu());
                    break;
                case 2:
                    them(new SanPhamTieuDung());
                    break;
                case 3:
                    xuatTatCa();
                    break;
                case 4:
                    capNhat();
                    break;
                case 5:
                    xoa();
                    break;
                case 6:
                    timTheoTen();
                    break;
                case 7:
                    sapXepGiamDanTheoThanhTien();
                    break;
                case 8:
                    tongGiaTri();
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }

    private static void menu() {
        System.out.println("\n===== QUAN LY SAN PHAM =====");
        System.out.println("1. Them san pham dien tu");
        System.out.println("2. Them san pham tieu dung");
        System.out.println("3. Xem danh sach");
        System.out.println("4. Cap nhat theo ma");
        System.out.println("5. Xoa theo ma");
        System.out.println("6. Tim theo ten");
        System.out.println("7. Sap xep giam dan theo thanh tien");
        System.out.println("8. Tong gia tri kho");
        System.out.println("0. Thoat");
        System.out.print("Chon: ");
    }

    private static int docLuaChon() {
        try {
            return Integer.parseInt(SanPham.sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static SanPham timTheoMa(String ma) {
        for (SanPham sp : ds) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) {
                return sp;
            }
        }
        return null;
    }

    private static void them(SanPham sp) {
        sp.Nhap(); // rang buoc dong: chay Nhap() cua lop con
        if (timTheoMa(sp.getMaSP()) != null) {
            System.out.println("Ma SP da ton tai, khong them!");
            return;
        }
        ds.add(sp);
        System.out.println("Da them san pham.");
    }

    private static void xuatTatCa() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach trong.");
            return;
        }
        for (SanPham sp : ds) {
            sp.Xuat(); // toString() va thanhTien() cua dung kieu thuc te
            System.out.println("------------------------");
}
    }

    private static void capNhat() {
        System.out.print("Nhap ma SP can cap nhat: ");
        SanPham sp = timTheoMa(SanPham.sc.nextLine().trim());
        if (sp == null) {
            System.out.println("Khong tim thay!");
            return;
        }
        sp.capNhat();
        System.out.println("Da cap nhat.");
    }

    private static void xoa() {
        System.out.print("Nhap ma SP can xoa: ");
        SanPham sp = timTheoMa(SanPham.sc.nextLine().trim());
        if (sp == null) {
            System.out.println("Khong tim thay!");
            return;
        }
        ds.remove(sp);
        System.out.println("Da xoa.");
    }

    private static void timTheoTen() {
        System.out.print("Nhap ten can tim: ");
        String tuKhoa = SanPham.sc.nextLine().trim().toLowerCase();
        boolean thay = false;
        for (SanPham sp : ds) {
            if (sp.getTenSP().toLowerCase().contains(tuKhoa)) {
                sp.Xuat();
                System.out.println("------------------------");
                thay = true;
            }
        }
        if (!thay) {
            System.out.println("Khong tim thay!");
        }
    }

    private static void sapXepGiamDanTheoThanhTien() {
        ds.sort(Comparator.comparingDouble(SanPham::thanhTien).reversed());
        System.out.println("Da sap xep.");
        xuatTatCa();
    }

    private static void tongGiaTri() {
        double tong = 0;
        for (SanPham sp : ds) {
            tong += sp.thanhTien();
        }
        System.out.println("Tong gia tri kho: " + tong);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM1;

/**
 *
 * @author nhat
 */
public class SanPhamTieuDung extends SanPham {
    private String hanSuDung; // ví dụ: "12/2026"

    public SanPhamTieuDung() {
        super();
    }

    public SanPhamTieuDung(String maSP, String tenSP, double donGia, int soLuong, String hanSuDung) {
        super(maSP, tenSP, donGia, soLuong);
        this.hanSuDung = hanSuDung;
    }

    @Override
    public void Nhap() {
        super.Nhap(); // Gọi phương thức Nhap() của lớp cha SanPham
        System.out.print("Nhap han su dung (vd: 12/2026): ");
        this.hanSuDung = sc.nextLine();
    }

    @Override
    public void capNhat() {
        super.capNhat(); // Gọi capNhat() của lớp cha SanPham
        System.out.print("Nhap han su dung moi (Enter de giu nguyen): ");
        String hsd = sc.nextLine();
        if (!hsd.isEmpty()) {
            this.hanSuDung = hsd;
        }
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    @Override
    public String toString() {
        return super.toString() + " | Han su dung: " + hanSuDung;
    }
}


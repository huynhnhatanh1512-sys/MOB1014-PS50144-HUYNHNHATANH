/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM1;

/**
 *
 * @author nhat
 */
public class SanPhamDienTu extends SanPham {
    private int thoiGianBaoHanh;

    public SanPhamDienTu() {
        super();
    }

    public SanPhamDienTu(String maSP, String tenSP, double donGia, int soLuong, int thoiGianBaoHanh) {
        super(maSP, tenSP, donGia, soLuong);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    @Override
    public void Nhap() {
        super.Nhap(); // Gọi phương thức Nhap() của lớp cha SanPham
        System.out.print("Nhap thoi gian bao hanh (thang): ");
        this.thoiGianBaoHanh = Integer.parseInt(SanPham.sc.nextLine());
    }

    @Override
    public void capNhat() {
        super.capNhat();
        System.out.print("Nhap thoi gian bao hanh moi (nho hon 0 de giu nguyen): ");
        int bh = Integer.parseInt(SanPham.sc.nextLine());
        if (bh >= 0) {
            this.thoiGianBaoHanh = bh;
        }
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    @Override
    public String toString() {
        return super.toString() + " | Bao hanh: " + thoiGianBaoHanh + " thang";
    }
}
   

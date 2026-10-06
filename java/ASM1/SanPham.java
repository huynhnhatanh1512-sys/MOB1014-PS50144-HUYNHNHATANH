package ASM1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author nhat
 */
public class SanPham {
    protected static final Scanner sc = new Scanner(System.in);

    String maSP;
    String tenSP;
    double donGia;
    int soLuong;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void Nhap() {
        do {
            System.out.print("Nhap ma SP (dang SPXXX, vd: SP001): ");
            maSP = sc.nextLine().trim(); 

            if (!maSP.matches("^SP\\d{3}$")) {
                System.out.println("Loi: Ma SP phai co dang SPXXX (XXX la 3 so tu nhien). Vui long nhap lai!");
            }
        } while (!maSP.matches("^SP\\d{3}$"));

        System.out.print("Nhap ten SP: ");
        tenSP = sc.nextLine();

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    public void Xuat() {
        System.out.println("-------------------------");
        System.out.println("Ma SP: " + maSP);
        System.out.println("Ten SP: " + tenSP);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien: " + thanhTien());
    }

    public double thanhTien() {
        return soLuong * donGia;
    }

    public void capNhat() {
        System.out.println("=== CAP NHAT THONG TIN SAN PHAM ===");
        System.out.print("Nhap ten san pham moi: ");
        this.tenSP = sc.nextLine();

        System.out.print("Nhap don gia moi: ");
        this.donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong moi: ");
        this.soLuong = Integer.parseInt(sc.nextLine());

        System.out.println("Cap nhat thanh cong");
    }
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Ma SP: " + maSP + " | Ten SP: " + tenSP + " | Don gia: " + donGia + " | So luong: " + soLuong;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;
import java.util.Scanner;
/**
 *
 * @author nhat
 */
public class XepLoaiHocLuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem Toan");
        double Toan = sc.nextDouble();
        System.out.print("Nhap diem Ly");
        double Ly = sc.nextDouble();
        System.out.print("Nhap diem Hoa");
        double Hoa = sc.nextDouble();
        if (Toan > 0 || Toan > 10 || Ly < 0 || Ly > 10 || Hoa < 0 || Hoa > 10) {
            System.out.println("Diem khong hop le");
            return;
        }
        double dtb = (Toan * 2 + Ly + Hoa) / 4;
        System.out.printf("Diem trung binh: %.2f\n", dtb);
        if (dtb >= 8.0) {
            System.out.println("Xep loai: Gioi");
        } else if (dtb >= 6.5) {
            System.out.println("Xep loai: Kha");
        } else if (dtb >= 5.0) {
            System.out.println("Xep loai: Trung binh");
        } else {
            System.out.println("Xep loai: Yeu");
        }
        sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;
import java.util.Scanner;
/**
 *
 * @author nhat
 */
public class Trungbingcong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();

        // Kiểm tra điều kiện n phải là số nguyên dương
        if (n <= 1) {
            System.out.println("n phai la so nguyen duong");
            sc.close();
            return;
        }

        int tong = 0;
        int dem = 0;
        String danhSach = ""; // Dùng để lưu chuỗi các số chia hết cho 3

        // Duyệt các số từ 1 đến n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                tong += i;
                dem++;
                danhSach += i + " "; // Nối số chia hết cho 3 vào chuỗi
            }
        }

        // Kiểm tra trường hợp không có số nào chia hết cho 3 (ví dụ n = 1 hoặc n = 2)
        if (dem == 0) {
            System.out.println("Khong co so nao chia het cho 3");
        } else {
            // In danh sách các số, dùng .trim() để cắt khoảng trắng thừa ở cuối
            System.out.println("Cac so chia het cho 3: " + danhSach.trim());
            System.out.println("Tong: " + tong);
            // Ép kiểu để phép chia không bị mất phần thập phân
            double trungBinh = (double) tong / dem;
            System.out.printf("Trung binh cong: %.2f\n", trungBinh);
        } 

       sc.close();
    }
}

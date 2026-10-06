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
public class NhapSoHopLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int dem = 0;
        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            dem++;
            if (!(n > 0 && n % 3 == 0 && n % 5 == 0)) {
                System.out.println("So khong hop le, moi nhap lai!");
                        }
        } while (!(n > 0 && n % 3 == 0 && n % 5 == 0));
       System.out.println("So hop le: " + n + "(sau " + dem + " lan nhap)");
       sc.close();
    }
}

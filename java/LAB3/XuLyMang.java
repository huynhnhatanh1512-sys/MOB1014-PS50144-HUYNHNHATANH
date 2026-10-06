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
public class XuLyMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
       System.out.print("Nhap so phan tu n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("n phai lon hon 0, moi nhap lai!");
            }
        } while (n <= 0);
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        System.out.print("Mang vua nhap: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        String dsChan = "";
        for (int x : a) {
            if (x % 2 != 0) {
                continue;
                }
            dsChan += x + " ";
        }
        if (dsChan.isEmpty()) {
            System.out.println("Cac phan tu chan: Khong co phan tu chan");
        } else {
            System.out.println("Cac phan tu chan: " + dsChan.trim());
        }
        int tongChiaHetCho4 = 0;
        for (int x : a) {
            if (x % 4 == 0) {
                tongChiaHetCho4 += x;
            }
        }
        System.out.println("Tong cac so chia het cho 4: " + tongChiaHetCho4);
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Gia tri lon nhat: " + max);

        sc.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author nhat
 */
public class TimKiemSapXep {
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

        System.out.print("Nhap x can tim: ");
        int x = sc.nextInt();

        boolean timThay = false;
        String viTri = "";

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                timThay = true;
                viTri += i + " "; 
            }
        }


        if (timThay) {
            System.out.println("Vi tri cua " + x + " trong mang: " + viTri.trim());
        } else {
            System.out.println("Vi tri cua " + x + " trong mang: Khong tim thay");
        }

        int[] banSao = Arrays.copyOf(a, a.length);

 
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                    if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Mang giam dan (Bubble Sort): " + Arrays.toString(a));


        Arrays.sort(banSao);
        System.out.println("Mang tang dan (Arrays.sort): " + Arrays.toString(banSao));

        sc.close();
    }
}


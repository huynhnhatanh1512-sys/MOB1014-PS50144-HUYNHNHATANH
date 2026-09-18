/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import java.util.Scanner;

/**
 *
 * @author nhat
 */
public class Bai4_hinhchunhat {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("nhap chieu dai: ");
    double dai = sc.nextDouble();
    
    System.out.print("nhap chieu rong: ");
    double rong = sc.nextDouble();
    double chuvi = (dai+rong)*2;
    double dientich = dai*rong;
    
    System.out.printf("chu vi : %.2f\n", chuvi);
    System.out.printf("dien tich : %.2f\n", dientich);
    
   }
}

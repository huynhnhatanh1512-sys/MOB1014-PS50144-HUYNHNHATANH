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
public class Bài3_chuvidientichhinhtron {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI =3.14159;
        double r,cv,dt;
        System.out.print("ban kinh hinh tron: ");
        r = sc.nextDouble();
        cv = 2 * PI * r;
        dt = PI * r * r;
        System.out.printf("Chu vi hinh tron: %.2f\n", cv);
        System.out.printf("Dien tich hinh tron: %.2f\n", dt);
        sc.close();
     }
}

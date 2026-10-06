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
public class muatrongnnam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Thang");
        int Thang = sc.nextInt();
        switch (Thang) {
            case 1,2,3:
                System.out.println("Thang"+ Thang +": Mua Xuan");
            case 4,5,6:
                System.out.println("Thang"+ Thang +": Mua Ha");
            case 7,8,9:
                System.out.println("Thang"+ Thang +": Mua Thu");
            case 10,11,12:
                System.out.println("Thang"+ Thang +": Mua Dong");
            default:
                System.out.println("Thang khong hop le");
                break;
        }
        sc.close();
        }
    }
 

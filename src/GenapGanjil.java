/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan angka bulat (0 untuk keluar): ");
            int angka = input.nextInt();
            
            if (angka == 0) {
                System.out.println("Program selesai.");
                break;
            }
            
            if (angka % 2 == 0) {
                System.out.println("Angka genap.");
            } else {
                System.out.println("Angka ganjil.");
            }
        }
        
        input.close();
    }
}
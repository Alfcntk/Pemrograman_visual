/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan dua angka bulat
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        // Melakukan operasi penjumlahan
        int hasilPenjumlahan = angka1 + angka2;
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        
        // Melakukan operasi pengurangan
        int hasilPengurangan = angka1 - angka2;
        System.out.println("Hasil pengurangan: " + hasilPengurangan);
        
        // Melakukan operasi perkalian
        int hasilPerkalian = angka1 * angka2;
        System.out.println("Hasil perkalian: " + hasilPerkalian);
        
        // Melakukan operasi pembagian
        if (angka2 != 0) {
            double hasilPembagian = (double) angka1 / angka2;
            System.out.println("Hasil pembagian: " + hasilPembagian);
        } else {
            System.out.println("Tidak dapat melakukan pembagian dengan angka kedua 0.");
        }
        
        input.close();
    }
}
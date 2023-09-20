/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class InputDataPengguna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan nama
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        // Meminta pengguna untuk memasukkan usia
        System.out.print("Masukkan usia (integer): ");
        int usia = input.nextInt();
        
        // Meminta pengguna untuk memasukkan tinggi badan
        System.out.print("Masukkan tinggi badan (double): ");
        double tinggiBadan = input.nextDouble();
        
        // Menampilkan hasil input ke layar
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        
        // Menutup Scanner
        input.close();
    }
}
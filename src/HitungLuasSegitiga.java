/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
   import java.util.Scanner;

public class HitungLuasSegitiga {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Menampilkan pesan kepada pengguna untuk memasukkan panjang alas dan tinggi segitiga
        System.out.print("Masukkan panjang alas segitiga: ");
        double panjangAlas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        // Menghitung luas segitiga
        double luasSegitiga = 0.5 * panjangAlas * tinggi;

        // Menampilkan hasil perhitungan
        System.out.println("Luas segitiga adalah: " + luasSegitiga);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            try {
                System.out.print("Masukkan jumlah angka yang akan dihitung rata-ratanya: ");
                int jumlah = input.nextInt();

                if (jumlah <= 0) {
                    System.out.println("Jumlah angka harus lebih dari 0.");
                    continue;
                }

                double total = 0;

                for (int i = 1; i <= jumlah; i++) {
                    System.out.print("Masukkan angka ke-" + i + ": ");
                    double angka = input.nextDouble();
                    total += angka;
                }

                double rataRata = total / jumlah;
                System.out.println("Rata-rata: " + rataRata);

                // Menanyakan kepada pengguna apakah ingin melanjutkan atau keluar
                System.out.print("Apakah ingin menghitung rata-rata lagi? (ya/tidak): ");
                String jawaban = input.next();

                if (jawaban.equalsIgnoreCase("tidak")) {
                    lanjut = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka yang valid.");
                input.nextLine(); // Membersihkan buffer input
            }
        }

        input.close();
    }
}

package Pertemuan1;

import java.util.Scanner;

/**
 * prakPemilihan
 */
public class prakPemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tugas, kuis, uts, uas;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextInt();

        double nilAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

        if (tugas >= 0 && tugas <= 100 && kuis >= 0 && kuis <= 100 && uts >= 0 && uts <= 100
                && uas >= 0 && uas <= 100) {
            System.out.println("Nilai Akhir: " + nilAkhir);

            if (nilAkhir > 80 && nilAkhir <= 100) {
                System.out.println("Nilai Huruf: A");
                System.out.println("Selamat Anda LULUS");
            } else if (nilAkhir > 73 && nilAkhir <= 80) {
                System.out.println("Nilai Huruf: B+");
                System.out.println("Selamat Anda LULUS");
            } else if (nilAkhir > 65 && nilAkhir <= 73) {
                System.out.println("Nilai Huruf: B");
                System.out.println("Selamat Anda LULUS");
            } else if (nilAkhir > 60 && nilAkhir <= 65) {
                System.out.println("Nilai Huruf: C+");
                System.out.println("Selamat Anda LULUS");
            } else if (nilAkhir > 50 && nilAkhir <= 60) {
                System.out.println("Nilai Huruf: C");
                System.out.println("Selamat Anda LULUS");
            } else if (nilAkhir > 39 && nilAkhir <= 50) {
                System.out.println("Nilai Huruf: D");
                System.out.println("Selamat Anda TIDAK LULUS");
            } else if (nilAkhir <= 39) {
                System.out.println("Nilai Huruf: E");
                System.out.println("Selamat Anda TIDAK LULUS");
            }
        } else {
            System.out.println("Nilai tidak valid brow");
        }

        input.close();
    }
}
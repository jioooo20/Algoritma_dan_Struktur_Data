package Pertemuan1;

import java.util.Scanner;

public class tugas2 {
    static void kecepatan(double s, double t) {
        double v = s / t;

        System.out.println("Hasil Penghitungan Kecepatan: " + v + "m/s");
    }

    static void waktu(double s, double v) {
        double t = s / v;

        System.out.println("Hasil Penghitungan Waktu: " + t + "s");
    }

    static void jarak(double v, double t) {
        double s = v * t;

        System.out.println("Hasil Penghitungan Jarak: " + s + "m");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fitur;
        do {
            System.out.println("====================");
            System.out.println("Pilih Rumus Yang Akan Dihitung");
            System.out.println("====================");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Angka: ");
            fitur = input.nextInt();

            switch (fitur) {
                case 1:
                    System.out.println("====================");
                    System.out.println("Hitung Kecepatan");
                    System.out.println("====================");
                    System.out.print("Masukkan Jarak(m): ");
                    double jarak = input.nextDouble();
                    System.out.print("Masukkan Waktu(s): ");
                    double waktu = input.nextDouble();
                    kecepatan(jarak, waktu);
                    break;
                case 2:
                    System.out.println("====================");
                    System.out.println("Hitung Jarak");
                    System.out.println("====================");
                    System.out.print("Masukkan Kecepatan(m/s): ");
                    double kecepatan = input.nextDouble();
                    System.out.print("Masukkan Waktu(s): ");
                    double waktuu = input.nextDouble();
                    jarak(kecepatan, waktuu);
                    break;
                case 3:
                    System.out.println("====================");
                    System.out.println("Hitung Waktu");
                    System.out.println("====================");
                    System.out.print("Masukkan Kecepatan(m/s): ");
                    double kecepatann = input.nextDouble();
                    System.out.print("Masukkan Jarak(m): ");
                    double jarakk = input.nextDouble();
                    waktu(jarakk, kecepatann);
                    break;

                default:
                    System.out.println("Pilih Nomor Rumus Yang Tersedia");
                    break;
            }
        } while (fitur != 0);

        input.close();
    }

}
